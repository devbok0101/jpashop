package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void 회원가입() throws Exception {
        Member member = new Member("kim");

        Long saveId = memberService.join(member);

        assertEquals(member, memberRepository.findOne(saveId));

    }


    @Test
    public void 중복_회원_예외() throws Exception {
        Member member1 = new Member("Kim");
        Member member2 = new Member("Kim");

        memberService.join(member1);
        assertThrows(IllegalStateException.class, () -> memberService.join(member2));

        //fail("예외가 발생해야합니다.");
    }
}
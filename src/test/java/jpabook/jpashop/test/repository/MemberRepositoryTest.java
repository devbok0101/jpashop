package jpabook.jpashop.test.repository;

import jpabook.jpashop.test.entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;


    @Test
    @DisplayName("save한 회원과 find한 회원이 같아야한다.")
    @Transactional
    void testMember() {
        Member member = Member.builder()
                .name("chanbok")
                .build();

        Long memberId = memberRepository.save(member);

        assertEquals(member, memberRepository.find(memberId));
    }
}
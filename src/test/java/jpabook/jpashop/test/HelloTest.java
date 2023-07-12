package jpabook.jpashop.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    @DisplayName("롬복의 @Getter가 알맞게 적용되는지 테스트")
    void lombokTest() throws Exception {
        final String actualName = "name";
        Hello hello = new Hello(actualName);
        assertEquals(actualName, hello.getName());
    }
}
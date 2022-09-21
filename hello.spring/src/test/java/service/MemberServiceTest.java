package service;

import hello.hello.spring.domain.Member;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {


    MemberService memberService = new MemberService();
    @Test
    void 회원가입() {
        // given
        Member member = new Member();
        member.setName("hello");

        // when
        Long saveId = mem

        // then
    }
    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}
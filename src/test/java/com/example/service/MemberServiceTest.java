package com.example.service;

import com.example.member.dto.MemberRequest;
import com.example.member.repository.MemberRepository;
import com.example.member.service.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@SpringBootTest
public class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    // 테스트를 위해 가상의 데이터를 넣음
    @Autowired
    private MemberRepository memberRepository;

    @Test
    @DisplayName("로그인 테스트")
    void loginTest() {
        var member = new Member(null, "1234", "1234@test.com", "tester", null, null);
        var newMember = memberRepository.save(member);

        var memberId = newMember.getId();
        memberService.로그인(memberId);
    }

}

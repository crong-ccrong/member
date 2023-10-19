package com.example.controller;

import com.example.member.controller.MemberController;
import com.example.member.dto.MemberRequest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class MemberControllerTest {

    @Autowired
    private MemberController memberController;

    @Test
    public void test() {
        var member = new MemberRequest("1234@test.com", "1234", "tester");
        var newMember = this.memberController.회원_가입(member);
        Assertions.assertThat(member.email()).isEqualTo(newMember.email());
    }

}

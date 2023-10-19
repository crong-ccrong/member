package com.example.member.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public record MemberRequest (

    // 레코드 클래스를 사용하면 롬복을 사용하지 않아도 됨
    @Email
    String email,

    @NotBlank
    String password,

    @NotBlank
    String username
)
    {

}

package com.example.member.dto;

public record MemberResponse(
    Long id,
    String email,
    String username
)
{
}

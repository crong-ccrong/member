package com.example.member.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

//@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Entity // 하이버네이트 아래서 어노테이션을 쓸 때 JPA로 사용할 수 있게 변환됨
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private String userName;

    @Column
    private LocalDateTime createdAt; // LocalDateTime 년월일초

    @Column
    private LocalDateTime updatedAt;

    // update
    public Member updateMember() {
        return this;
    }
}

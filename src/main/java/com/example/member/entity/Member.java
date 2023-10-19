package com.example.member.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Entity // 하이버네이트 아래서 어노테이션을 쓸 때 JPA로 사용할 수 있게 변환됨
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "password", nullable = false )
    private String password;

    @Column
    private String email;

    @Column
    private String userName;

    @CreationTimestamp
    @Column
    private LocalDateTime createdAt; // LocalDateTime 년월일초

    @UpdateTimestamp
    @Column
    private LocalDateTime updatedAt;

    // update
    public Member updateMember() {
        return this;
    }
}

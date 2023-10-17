package com.example.member.repository;

import com.example.member.entity.Member;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;

@ComponentScan // 안붙여도 됨
public interface MemberRepository extends JpaRepository<Member, Long> {

}

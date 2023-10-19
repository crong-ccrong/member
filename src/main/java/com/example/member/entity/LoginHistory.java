package com.example.member.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "login_history")
@Entity
public class LoginHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY) // 데이터를 필요할 때 가져온다 : LAZY -> join되서 가져옴. 아니라면 list마다 select함. , cascade = {CascadeType.ALL}를 LAZY 다음에 넣어줬는데 오류나서 뻈음 : 영속성 컨텍스트
    private Member member; // Member 정보를 가져오는 것이므로

    @CreationTimestamp
    private LocalDateTime createdAt;
}

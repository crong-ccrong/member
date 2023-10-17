package com.example.member.service;

import com.example.member.entity.Member;
import com.example.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service // @Component를 포함함
public class MemberService {

    private final MemberRepository memberRepository;

    public void 회원_가입() {
        Member member = new Member();
        memberRepository.save(member);
    }

    public void 로그인(long loginId) {
        var member = memberRepository.findById(loginId);
        if (member.isPresent()) {
            // todo: 로그인
        } else {
            // todo: 로그인 실패
        }
    }

    public void 회원_정보_조회(long loginId) {
        var member = memberRepository.findById(loginId);
        if (member.isPresent()) {
            // todo: 로그인
        } else {
            // todo: 로그인 실패
        }
    }

    public void 회원_정보_수정(long loginId) {
        var member = memberRepository.findById(loginId);
        if (member.isPresent()) {
            // todo: 수정할 데이터를 넣어준다
            var updatedMember = member.get().updateMember();
            memberRepository.save(updatedMember);
        } else {
            // todo: 로그인 실패
        }
    }

    public void 중복_확인() {
        // 회원_정보_조회() 메서드로 대체할 수 있을 거 같음
    }

}

package com.example.member.controller;

import com.example.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping(value = "/v1/api") // restApi에서 api 붙이는 습관
@RestController //@Component를 포함함
public class MemberController {

    // @Autowired보다 생성자 주입이 권장됨
    private final MemberService memberService;

    @ResponseStatus(code = HttpStatus.CREATED) // 지향하는 방법은 ResponseEntity.메서드 이지만 간단히 보기 위해 이 어노테이션 사용
    @PostMapping(value = "/auth/signup")
    public void 회원_가입() {
        memberService.회원_가입();
    }

    @ResponseStatus(code = HttpStatus.OK)
    @PostMapping(value = "/auth/login")
    public void 로그인() {
        //memberService.로그인(9999);
    }

    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping(value = "/members/{id}")
    public void 회원_정보_조회(@PathVariable long id) {
        //memberService.회원_정보_조회(9999);
    }

    @ResponseStatus(code = HttpStatus.OK)
    @PatchMapping(value = "/members/{id}")
    public void 회원_정보_수정(@PathVariable long id) {
        //memberService.회원_정보_수정(9999);
    }
    
    public void 중복_확인() {
        // 회원_정보_조회() 메서드로 대체할 수 있을 거 같음
    }

}

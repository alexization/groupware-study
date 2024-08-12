package com.ureca.urecaWare.domain.member.controller;


import com.ureca.urecaWare.domain.member.dto.LoginRequestDto;
import com.ureca.urecaWare.domain.member.entity.Member;
import com.ureca.urecaWare.domain.member.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequestDto loginRequest) {
        try {
            Member member = loginService.login(loginRequest.getMemberId());
            return ResponseEntity.ok("Login successful. Welcome, " + member.getMember_name() + "!");
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(404).body("Member not found");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}


package com.ureca.urecaWare.domain.member.service;

import com.ureca.urecaWare.domain.member.entity.Member;
import com.ureca.urecaWare.domain.member.repository.MemberRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    public Member login(String memberId) {
//        return memberRepository.findById(memberId)
//                .orElseThrow(() -> new NoSuchElementException("Member not found"));
        Optional<Member> member = memberRepository.findByMemberId(memberId);
        if(member.isPresent()) {
            return  member.get();
        }

        throw new EntityNotFoundException(
                "Cannot find member with id: " + memberId
        );
    }
}

package com.sparta.cicdtest.service;

import com.sparta.cicdtest.dto.MemberRequestDto;
import com.sparta.cicdtest.entity.Member;
import com.sparta.cicdtest.repository.MemberRepository;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {


    private final MemberRepository memberRepository;

    public void addMember(String name) {
        Member member = new Member(name);
        memberRepository.save(member);
    }

    public List<Member> getMembers() {
        return memberRepository.findAll();
    }
}

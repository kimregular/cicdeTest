package com.sparta.cicdtest.controller;

import com.sparta.cicdtest.entity.Member;
import com.sparta.cicdtest.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
//@RequestMapping("/")
public class MainController {

    private final MemberService memberService;

    @GetMapping("/")
    public String home(Model model) {
        List<Member> members = memberService.getMembers();
//        model.addAttribute("hello", members.get(members.size()-1).getName());
        model.addAttribute("members", members);
        return "index";
    }

    @PostMapping("/members")
    public String addMember(HttpServletRequest request) {
        String name = request.getParameter("name");
        memberService.addMember(name);
        return "redirect:/";
    }
}

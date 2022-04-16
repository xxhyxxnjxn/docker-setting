package com.gmc.dockertest.controller;

import com.gmc.dockertest.repository.MemberRepository;
import com.gmc.dockertest.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DockerController {
    private final MemberRepository memberRepository;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/save")
    public void test() {
        Member m1 = Member.builder()
                .name("정현진")
                .build();
        memberRepository.save(m1);
    }

    @GetMapping("/get")
    public String getM1() {
        return memberRepository.findAll().toString();
    }
}

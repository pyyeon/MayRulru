package com.springboot.member.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

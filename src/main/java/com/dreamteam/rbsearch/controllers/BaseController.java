package com.dreamteam.rbsearch.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping()
public class BaseController {
    @GetMapping("/")
    public String returnStartPage() {
        return "start_page_another";
    }

    @GetMapping("/error")
    public String returnErrorPage() {
        return "../public/error/404";
    }
}

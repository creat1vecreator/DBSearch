package com.dreamteam.rbsearch.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping()
public class BaseController {
    @GetMapping("/")
    public String returnStartPage() {
        return "start_page";
    }

    @GetMapping("/error")
    public String returnErrorPage() {
        return "../public/error/404";
    }

    @GetMapping("/{category}")
    public String returnCriteriaPage(@PathVariable String category) {
        switch (category) {
            case "individual":
                return "criteria/individual";
            case "legal_entity":
                return "criteria/legal_entity";
            case "corporation":
                return "criteria/corporation";
        }
        return returnErrorPage();
    }
}

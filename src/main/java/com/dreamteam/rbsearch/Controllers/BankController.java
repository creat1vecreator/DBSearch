package com.dreamteam.rbsearch.Controllers;

import com.dreamteam.rbsearch.Services.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
@RequestMapping()
public class BankController {

    private final BankService bankService;

    @GetMapping("/")
    public String returnStartPage(Model model) {
        model.addAttribute("title", "Welcome to us");
        return "start_page";
    }

    @GetMapping("/error")
    public String returnErrorPage(Model model) {
        return "error/404";
    }

    @GetMapping("/criteria")
    public String returnSearchPage(Model model) {
        return "criteria";
    }

}

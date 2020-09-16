package com.dreamteam.rbsearch.controllers;

import com.dreamteam.rbsearch.form.BankForm;
import com.dreamteam.rbsearch.services.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "error/404_page";
    }

    @GetMapping("/criteria")
    public String returnSearchPage(Model model) {
        return "criteria_page";
    }

//    @RequestMapping("/criteria", RequestMethod.GET)
//    public String returnAnswerPage() {
//
//    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String returnSearchList(Model model) {
        BankForm bankForm = new BankForm(model.asMap());
//        model.addAttribute("bankEntity");
//        model.addAttribute("price", bankForm.getPrice());
//        model.addAttribute("app", bankForm.getApp());
        return "bank_list_page";
    }

}

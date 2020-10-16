package com.dreamteam.rbsearch.controllers;

import com.dreamteam.rbsearch.services.IndividualService;
import com.dreamteam.rbsearch.services.IndividualService_simple;
import com.dreamteam.rbsearch.services.LegalEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping()
public class BaseController_simple {
    private final IndividualService_simple individualService_simple;
    private final LegalEntityService_simple legalEntityService_simple;

    @GetMapping("/")
    public String returnStartPage() {
        return "start_page";
    }

    @GetMapping("/error")
    public String returnErrorPage() {
        return "../public/error/404";
    }

    @GetMapping("/{category}")
    public String returnCriteriaPage(@PathVariable String category, Model model) {
        switch (category) {
            case "individual":
                model.addAttribute("banks", individualService_simple.findAll());
                return "answer/individual1";
            case "legal_entity":
                model.addAttribute("banks", legalEntityService_simple.findAll());
                return "answer/legal_entity";
        }
        return returnErrorPage();
    }
}

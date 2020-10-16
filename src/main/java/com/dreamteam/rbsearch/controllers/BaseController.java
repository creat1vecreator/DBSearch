package com.dreamteam.rbsearch.controllers;

import com.dreamteam.rbsearch.services.IndividualService_not;
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
public class BaseController {
    private final IndividualService_not individualService;
    private final LegalEntityService legalEntityService;

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
                model.addAttribute("banks", individualService.findAll());
                return "answer/individual";
            case "legal_entity":
                model.addAttribute("banks", legalEntityService.findAll());
                return "answer/legal_entity";
        }
        return returnErrorPage();
    }
}

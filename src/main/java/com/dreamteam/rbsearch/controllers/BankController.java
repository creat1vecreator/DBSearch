package com.dreamteam.rbsearch.controllers;

import com.dreamteam.rbsearch.form.BankForm;
import com.dreamteam.rbsearch.services.BankService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@Controller
@RequiredArgsConstructor
@RequestMapping()
public class BankController {

    private final BankService bankService;

    @GetMapping("/")
    public String returnStartPage() {
        return "start_page";
    }

    @GetMapping("/error")
    public String returnErrorPage() {
        return "error/404_page";
    }

    @GetMapping("/criteria")
    public String returnSearchPage() {
        return "criteria_page";
    }

//    @RequestMapping("/criteria", RequestMethod.GET)
//    public String returnAnswerPage() {
//
//    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<String> get(
            @RequestParam(value = "price", required = true) String price,
            @RequestParam(value = "app", required = true) String app) {
        BankForm bankForm = new BankForm(price, app);
        return new ResponseEntity<>(bankForm.toString(), HttpStatus.OK);
    }

}

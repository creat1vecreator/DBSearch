package com.dreamteam.rbsearch.controllers;

import com.dreamteam.rbsearch.BankEntitiesDTO.BankEntitiesDTO;
import com.dreamteam.rbsearch.entities.BankEntity;
import com.dreamteam.rbsearch.form.BankForm;
import com.dreamteam.rbsearch.services.BankService;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
        return "../public/error/404";
    }

    @GetMapping("/criteria")
    public String returnSearchPage() {
        return "sample_ans";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> getSearch(
            @RequestParam(value = "price") String price,
            @RequestParam(value = "app", required = false) String app) {
        BankForm bankForm = new BankForm(
                price,
                app
        );
        System.out.println(bankForm);
        BankEntitiesDTO bankEntitiesDTO = bankService.find(bankForm);
        String jsonResponse = new Gson().toJson(bankEntitiesDTO.getBankEntities());
        System.out.println(jsonResponse);
        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }

    @GetMapping("/bank/{name}")
    public @ResponseBody ResponseEntity<String> findByName(@PathVariable String name) {
        BankEntity bankEntity = bankService.findByName(name);
        String jsonResponse = new Gson().toJson(bankEntity);
        System.out.println(jsonResponse);
        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }


    @GetMapping("/all")
    public @ResponseBody ResponseEntity<String> getAllBanks() {
        BankEntitiesDTO bankEntitiesDTO = bankService.findAll();
        String jsonResponse = new Gson().toJson(bankEntitiesDTO);
        System.out.println(jsonResponse);
        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }
}

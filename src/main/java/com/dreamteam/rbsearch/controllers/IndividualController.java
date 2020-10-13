package com.dreamteam.rbsearch.controllers;

import com.dreamteam.rbsearch.BankEntitiesDTO.BankEntitiesDTO;
import com.dreamteam.rbsearch.entities.IndividualEntity;
import com.dreamteam.rbsearch.form.IndividualForm;
import com.dreamteam.rbsearch.services.IndividualService;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/individual")
public class IndividualController {
    private final IndividualService individualService;

//    @GetMapping("/criteria")
//    public String returnSearchPage() {
//        return "criteria/individual";
//    }

//    @RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
//    public ResponseEntity<String> getSearch(
//            @RequestParam(value = "price") String price,
//            @RequestParam(value = "app", required = false) String app) {
//        IndividualForm individualForm = new IndividualForm(
//                price,
//                app
//        );
//        System.out.println(individualForm);
//        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO = individualService.find(individualForm);
//        String jsonResponse = new Gson().toJson(bankEntitiesDTO.getBankEntities());
//        System.out.println(jsonResponse);
//        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
//    }

    @RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
    public String getSearch(
            Model model,
            @RequestParam(value = "price") String price,
            @RequestParam(value = "app", required = false) String app) {
        IndividualForm individualForm = new IndividualForm(
                price,
                app
        );
        System.out.println(individualForm);
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO = individualService.find(individualForm);
        model.addAttribute("banks", bankEntitiesDTO.getBankEntities());
        return "answer/individual";
    }

//    @GetMapping("/bank/{name}")
//    public @ResponseBody ResponseEntity<String> findByName(@PathVariable String name, Model model) {
//        try {
//            IndividualEntity individualEntity = individualService.findByName(name);
//            String jsonResponse = new Gson().toJson(individualEntity);
//            System.out.println(jsonResponse);
//            return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
//        } catch (RuntimeException runtimeException) {
//            return new ResponseEntity<>("error 404 - not found", HttpStatus.OK);
//        }
//    }

    @GetMapping("/bank/{name}")
    public String findByName(@PathVariable String name, Model model) {
        try {
            IndividualEntity individualEntity = individualService.findByName(name);
            model.addAttribute("bank", individualEntity);
            return "single/individual";
        } catch (RuntimeException runtimeException) {
            return "error";
        }
    }

    @GetMapping("/all")
    public @ResponseBody ResponseEntity<String> getAllBanks() {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO = individualService.findAll();
        String jsonResponse = new Gson().toJson(bankEntitiesDTO);
        System.out.println(jsonResponse);
        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }
}

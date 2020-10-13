package com.dreamteam.rbsearch.controllers;

import com.dreamteam.rbsearch.BankEntitiesDTO.BankEntitiesDTO;
import com.dreamteam.rbsearch.entities.CorporationEntity;
import com.dreamteam.rbsearch.form.CorporationForm;
import com.dreamteam.rbsearch.services.CorporationService;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/corporation")
public class CorporationController {
    private final CorporationService corporationService;

//    @GetMapping("/criteria")
//    public String returnSearchPage() {
//        return "criteria/corporation";
//    }

    @RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> getSearch(
            @RequestParam(value = "price") String price) {
        CorporationForm corporationForm = new CorporationForm(
                price
        );
        System.out.println(corporationForm);
        BankEntitiesDTO<CorporationEntity> bankEntitiesDTO = corporationService.find(corporationForm);
        String jsonResponse = new Gson().toJson(bankEntitiesDTO.getBankEntities());
        System.out.println(jsonResponse);
        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }

    @GetMapping("/bank/{name}")
    public @ResponseBody ResponseEntity<String> findByName(@PathVariable String name) {
        try {
            CorporationEntity corporationEntity = corporationService.findByName(name);
            String jsonResponse = new Gson().toJson(corporationEntity);
            System.out.println(jsonResponse);
            return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
        } catch (RuntimeException runtimeException) {
            return new ResponseEntity<>("error 404 - not found", HttpStatus.OK);
        }
    }

    @GetMapping("/all")
    public @ResponseBody ResponseEntity<String> getAllBanks() {
        BankEntitiesDTO<CorporationEntity> bankEntitiesDTO = corporationService.findAll();
        String jsonResponse = new Gson().toJson(bankEntitiesDTO);
        System.out.println(jsonResponse);
        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }
}

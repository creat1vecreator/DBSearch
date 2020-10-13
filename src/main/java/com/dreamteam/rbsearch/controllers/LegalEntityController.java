package com.dreamteam.rbsearch.controllers;

import com.dreamteam.rbsearch.BankEntitiesDTO.BankEntitiesDTO;
import com.dreamteam.rbsearch.entities.LegalEntityEntity;
import com.dreamteam.rbsearch.form.LegalEntityForm;
import com.dreamteam.rbsearch.services.LegalEntityService;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/legal_entity")
public class LegalEntityController {
    private final LegalEntityService legalEntityService;

//    @GetMapping("/criteria")
//    public String returnSearchPage() {
//        return "criteria/legal_entity";
//    }

    @RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> getSearch(
            @RequestParam(value = "price") String price) {
        LegalEntityForm legalEntityForm = new LegalEntityForm(
                price
        );
        System.out.println(legalEntityForm);
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO = legalEntityService.find(legalEntityForm);
        String jsonResponse = new Gson().toJson(bankEntitiesDTO.getBankEntities());
        System.out.println(jsonResponse);
        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }

    @GetMapping("/bank/{name}")
    public @ResponseBody ResponseEntity<String> findByName(@PathVariable String name) {
        try {
            LegalEntityEntity legalEntityEntity = legalEntityService.findByName(name);
            String jsonResponse = new Gson().toJson(legalEntityEntity);
            System.out.println(jsonResponse);
            return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
        } catch (RuntimeException runtimeException) {
            return new ResponseEntity<>("error 404 - not found", HttpStatus.OK);
        }
    }

    @GetMapping("/all")
    public @ResponseBody ResponseEntity<String> getAllBanks() {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO = legalEntityService.findAll();
        String jsonResponse = new Gson().toJson(bankEntitiesDTO);
        System.out.println(jsonResponse);
        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }
}

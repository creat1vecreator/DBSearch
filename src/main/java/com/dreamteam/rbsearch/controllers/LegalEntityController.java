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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/legal_entity")
public class LegalEntityController {
    private final LegalEntityService legalEntityService;

    @RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
    public String getSearch(
            Model model,
            @RequestParam(value = "price") String price) {
        LegalEntityForm legalEntityForm = new LegalEntityForm(
                price
        );
        System.out.println(legalEntityForm);
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO = legalEntityService.find(legalEntityForm);
        model.addAttribute("banks", bankEntitiesDTO.getBankEntities());
        return "answer/legal_entity";
    }

    @GetMapping("/bank/{name}")
    public String findByName(@PathVariable String name, Model model) {
        try {
            LegalEntityEntity legalEntityEntity = legalEntityService.findByName(name);
            model.addAttribute("bank", legalEntityEntity);
            return "single/legal_entity";
        } catch (RuntimeException runtimeException) {
            return "error";
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

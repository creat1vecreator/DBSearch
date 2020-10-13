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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/corporation")
public class CorporationController {
    private final CorporationService corporationService;

    @RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
    public String getSearch(
            Model model,
            @RequestParam(value = "price") String price) {
        CorporationForm corporationForm = new CorporationForm(
                price
        );
        System.out.println(corporationForm);
        BankEntitiesDTO<CorporationEntity> bankEntitiesDTO = corporationService.find(corporationForm);
        model.addAttribute("banks", bankEntitiesDTO.getBankEntities());
        return "answer/corporation";
    }

    @GetMapping("/bank/{name}")
    public String findByName(@PathVariable String name, Model model) {
        try {
            CorporationEntity corporationEntity = corporationService.findByName(name);
            model.addAttribute("bank", corporationEntity);
            return "single/corporation";
        } catch (RuntimeException runtimeException) {
            return "error";
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

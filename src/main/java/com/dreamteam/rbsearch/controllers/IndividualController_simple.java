package com.dreamteam.rbsearch.controllers;

import com.dreamteam.rbsearch.BankEntitiesDTO.BankEntitiesDTO;
import com.dreamteam.rbsearch.entities.IndividualEntity;
import com.dreamteam.rbsearch.form.IndividualForm_simple;
import com.dreamteam.rbsearch.services.IndividualService_simple;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Deprecated
@Controller
@RequiredArgsConstructor
@RequestMapping("/individual_simple")
public class IndividualController_simple {
    private final IndividualService_simple individualService_simple;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String getSearch(
            Model model,
            @RequestParam(value = "transfer_types", required = false) String transferTypes,
            @RequestParam(value = "transfer_auto", required = false) String transferAuto,
            @RequestParam(value = "transfer_currency", required = false)String transferCurrency,
            @RequestParam(value = "transfer_method", required = false) String paymentMethod,
            @RequestParam(value = "payment_aims_services", required = false) String paymentAimsServices,
            @RequestParam(value = "payment_auto", required = false) String paymentAuto,
            @RequestParam(value = "deposit_rate", required = false) String depositRate,
            @RequestParam(value = "deposit_aim", required = false) String depositAim,
            @RequestParam(value = "deposit_currency", required = false) String depositCurrency,
            @RequestParam(value = "deposit_additional_conditions",required = false) String depositAdditionalConditions,
            @RequestParam(value = "consultation", required = false) String consultation,
            @RequestParam(value = "card_free_serice", required = false) String cardFreeService,
            @RequestParam(value = "card_types", required = false) String cardTypes,
            @RequestParam(value = "card_categories", required = false) String cardCategories,
            @RequestParam(value = "card_annual_service_price", required = false) String cardAnnualServicePrice,
            @RequestParam(value = "card_cahsback", required = false) String cardCashback,
            @RequestParam(value = "card_design_to_choose", required = false) String cardDesignToChoose,
            @RequestParam(value = "card_validity") String cardValidity,
            @RequestParam(value = "credit_aim", required = false) String creditAim,
            @RequestParam(value = "credit_interest_rate", required = false) String creditInterestRate,
            @RequestParam(value = "credit_term", required = false) String creditTerm,
            @RequestParam(value = "credit_early_payment", required = false) String creditEarlyPayment,
            @RequestParam(value = "credit_amount", required = false) String creditAmount,
            @RequestParam(value = "insurance_aim", required = false) String insuranceAim,
            @RequestParam(value = "insurance_amount", required = false) String insuranceAmount,
            @RequestParam(value = "rating", required = false) String sorting,
            @RequestParam(value = "unique_services", required = false) String uniqueServices) {
        IndividualForm_simple individualForm_simple = new IndividualForm_simple(
                transferTypes,
                transferAuto,
                transferCurrency,
                paymentMethod,
                paymentAimsServices,
                paymentAuto,
                depositRate,
                depositAim,
                depositCurrency,
                depositAdditionalConditions,
                consultation,
                cardFreeService,
                cardTypes,
                cardCategories,
                cardAnnualServicePrice,
                cardCashback,
                cardDesignToChoose,
                cardValidity,
                creditAim,
                creditInterestRate,
                creditTerm,
                creditEarlyPayment,
                creditAmount,
                insuranceAim,
                insuranceAmount,
                sorting,
                uniqueServices
        );
        System.out.println(individualForm_simple);
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO = individualService_simple.find(individualForm_simple);
        model.addAttribute("banks", bankEntitiesDTO.getBankEntities());
        return "answer/individual";
    }

    @GetMapping("/bank/{name}")
    public String findByName(@PathVariable String name, Model model) {
        try {
            IndividualEntity individualEntity = individualService_simple.findByName(name);
            model.addAttribute("bank", individualEntity);
            return "single_individual_";
        } catch (RuntimeException runtimeException) {
            return "error";
        }
    }

    @GetMapping("/all")
    public @ResponseBody ResponseEntity<String> getAllBanks() {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO = individualService_simple.findAll();
        String jsonResponse = new Gson().toJson(bankEntitiesDTO);
        System.out.println(jsonResponse);
        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }
}

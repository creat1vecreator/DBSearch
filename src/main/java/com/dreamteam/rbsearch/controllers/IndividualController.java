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
            @RequestParam(value = "card_cashback", required = false) String cardCashback,
            @RequestParam(value = "card_design_to_choose", required = false) String cardDesignToChoose,
            @RequestParam(value = "card_validity", required = false) String cardValidity,
            @RequestParam(value = "credit_aim", required = false) String creditAim,
            @RequestParam(value = "credit_interest_rate", required = false) String creditInterestRate,
            @RequestParam(value = "credit_term", required = false) String creditTerm,
            @RequestParam(value = "credit_early_payment", required = false) String creditEarlyPayment,
            @RequestParam(value = "credit_amount", required = false) String creditAmount,
            @RequestParam(value = "insurance_aim", required = false) String insuranceAim,
            @RequestParam(value = "insurance_amount", required = false) String insuranceAmount,
            @RequestParam(value = "rating", required = false) String sorting,
            @RequestParam(value = "unique_services", required = false) String uniqueServices) {

        IndividualForm individualForm = new IndividualForm(
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
        System.out.println(individualForm);
        System.out.println(individualForm.getCreditAmount());
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO = individualService.find(individualForm);
        bankEntitiesDTO.getBankEntities().forEach(System.out::println);
        model.addAttribute("banks", bankEntitiesDTO.getBankEntities());
        return "answer/individual";
    }

    @GetMapping("/bank/{name}")
    public String findByName(@PathVariable String name, Model model) {
        try {
            IndividualEntity individualEntity = individualService.findByName(name);
            System.out.println(individualEntity);
            model.addAttribute("bank", individualEntity);
            return "single_individual";
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

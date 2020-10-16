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

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String getSearch(
            Model model,
            @RequestParam(name = "payment_aim_services", required = false) String paymentAimsServices,
            @RequestParam(name = "payment_method", required = false) String paymentMethod,
            @RequestParam(name = "payment_auto", required = false) String paymentAuto,
            @RequestParam(name = "services_financial", required = false) String servicesFinancial,
            @RequestParam(name = "services_sales", required = false) String servicesSales,
            @RequestParam(name = "services_document_management", required = false) String servicesDocumentManagement,
            @RequestParam(name = "services_analytics", required = false) String servicesAnalytics,
            @RequestParam(name = "bank_account_opening_price", required = false) String bankAccountOpeningPrice,
            @RequestParam(name = "bank_account_availability_of_free_period", required = false) String bankAccountAvailabilityOfFreePeriod,
            @RequestParam(name = "bank_account_currency", required = false) String bankAccountCurrency,
            @RequestParam(name = "bank_account_types", required = false) String bankAccountTypes,
            @RequestParam(name = "acquiring_types", required = false) String acquiringTypes,
            @RequestParam(name = "minimum_commission_rate_of_turnover", required = false) String minimumCommissionRateOfTurnover,
            @RequestParam(name = "credit_aim", required = false) String creditAim,
            @RequestParam(name = "credit_interest_rate", required = false) String creditInterestRate,
            @RequestParam(name = "credit_term", required = false) String creditTerm,
            @RequestParam(name = "credit_early_repayment", required = false) String creditEarlyRepayment,
            @RequestParam(name = "deposit_rate", required = false) String depositRate,
            @RequestParam(name = "deposit_currency", required = false) String depositCurrency,
            @RequestParam(name = "deposit_types_of_funds", required = false) String depositTypesOfFunds,
            @RequestParam(name = "deposit_additional_conditions", required = false) String depositAdditionalConditions,
            @RequestParam(name = "consultation", required = false) String consultation,
            @RequestParam(name = "card_types", required = false) String cardTypes,
            @RequestParam(name = "card_categories", required = false) String cardCategories,
            @RequestParam(name = "card_annual_service_price", required = false) String cardAnnualServicePrice,
            @RequestParam(name = "insurance_aim", required = false) String insuranceAim,
            @RequestParam(name = "insurance_amount", required = false) String insuranceAmount,
            @RequestParam(name = "corporation_services", required = false) String corporationServices,
            @RequestParam(name = "corporation_financing", required = false) String corporationFinancing
    ) {
        LegalEntityForm legalEntityForm = new LegalEntityForm(
                paymentAimsServices,
                paymentMethod,
                paymentAuto,
                servicesFinancial,
                servicesSales,
                servicesDocumentManagement,
                servicesAnalytics,
                bankAccountOpeningPrice,
                bankAccountAvailabilityOfFreePeriod,
                bankAccountCurrency,
                bankAccountTypes,
                acquiringTypes,
                minimumCommissionRateOfTurnover,
                creditAim,
                creditInterestRate,
                creditTerm,
                creditEarlyRepayment,
                depositRate,
                depositCurrency,
                depositTypesOfFunds,
                depositAdditionalConditions,
                consultation,
                cardTypes,
                cardCategories,
                cardAnnualServicePrice,
                insuranceAim,
                insuranceAmount,
                corporationServices,
                corporationFinancing
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

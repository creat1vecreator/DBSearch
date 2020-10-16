package com.dreamteam.rbsearch.form;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class IndividualForm {
    private List<String> transfer_types;
    private Boolean transfer_auto;
    private List<String> transfer_currency;
    private List<String> payment_method;
    private List<String> payment_aims_services;
    private Boolean payment_auto;
    private Float deposit_rate;
    private List<String> deposit_aim;
    private List<String> deposit_currency;
    private List<String> deposit_additional_conditions;
    private List<String> consultation;
    private Boolean card_free_service;
    private List<String> card_types;
    private List<String> card_categories;
    private Integer card_annual_service_price;
    private Float card_cashback;
    private Boolean card_design_to_choose;
    private Integer card_validity;
    private List<String> credit_aim;
    private Float credit_interest_rate;
    private Integer credit_term_start;
    private Integer credit_term;
    private Boolean credit_early_payment;
    private Integer credit_amount;
    private List<String> insurance_aim;
    private Integer insurance_amount;
    private String sorting;
    private List<String> unique_services;

    public IndividualForm(
            String transferTypes,
            String transferAuto,
            String transferCurrency,
            String paymentMethod,
            String paymentAimsServices,
            String paymentAuto,
            String depositRate,
            String depositAim,
            String depositCurrency,
            String depositAdditionalConditions,
            String consultation,
            String cardFreeService,
            String cardTypes,
            String cardCategories,
            String cardAnnualServicePrice,
            String cardCashback,
            String cardDesignToChoose,
            String cardValidity,
            String creditAim,
            String creditInterestRate,
            String creditTerm,
            String creditEarlyPayment,
            String creditAmount,
            String insuranceAim,
            String insuranceAmount,
            String sorting,
            String uniqueServices
    ) {
        this.transfer_types = transferTypes == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(transferTypes.split(",")));
        this.transfer_auto = Boolean.parseBoolean(transferAuto);
        this.transfer_currency = transferCurrency == null ? new ArrayList<>() :new ArrayList<>(Arrays.asList(transferCurrency.split(",")));
        this.payment_method = paymentMethod == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(paymentMethod.split(",")));
        this.payment_aims_services = paymentAimsServices == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(paymentAimsServices.split(",")));
        this.payment_auto = Boolean.parseBoolean(paymentAuto);
        this.deposit_rate = Float.parseFloat(depositRate);
        this.deposit_aim = depositAim == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(depositAim.split(",")));
        this.deposit_currency = depositCurrency == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(depositCurrency.split(",")));
        this.deposit_additional_conditions = depositAdditionalConditions == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(depositAdditionalConditions.split(",")));
        this.consultation = consultation == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(consultation.split(",")));
        this.card_free_service = Boolean.parseBoolean(cardFreeService);
        this.card_types = cardTypes == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(cardTypes.split(",")));
        this.card_categories = cardCategories == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(cardCategories.split(",")));
        this.card_annual_service_price = Integer.parseInt(cardAnnualServicePrice);
        this.card_cashback = Float.parseFloat(cardCashback);
        this.card_design_to_choose = Boolean.parseBoolean(cardDesignToChoose);
        this.card_validity = Integer.parseInt(cardValidity);
        this.credit_aim = creditAim == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(creditAim.split(",")));
        this.credit_interest_rate = Float.parseFloat(creditInterestRate);
        this.credit_term = Integer.parseInt(creditTerm);
        this.credit_early_payment = Boolean.parseBoolean(creditEarlyPayment);
        this.credit_amount = Integer.parseInt(creditAmount);
        this.insurance_aim = insuranceAim == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(insuranceAim.split(",")));
        this.insurance_amount = Integer.parseInt(insuranceAmount);
        this.sorting = sorting == null ? "" : sorting;
        this.unique_services = insuranceAim == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(uniqueServices.split(",")));
    }
}

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
    private Float deposit_rate_start;
    private Float deposit_rate_finish;
    private List<String> deposit_currency;
    private List<String> deposit_additional_conditions;
    private List<String> consultation;
    private Boolean card_free_service;
    private List<String> card_types;
    private List<String> card_categories;
    private Integer card_annual_service_price_start;
    private Integer card_annual_service_price_finish;
    private Float card_cashback_start;
    private Float card_cashback_finish;
    private Boolean card_design_to_choose;
    private Integer card_validity_start;
    private Integer card_validity_finish;
    private List<String> credit_aim;
    private Float credit_interest_rate_start;
    private Float credit_interest_rate_finish;
    private Integer credit_term_start;
    private Integer credit_term_finish;
    private Boolean credit_early_payment;
    private Integer credit_amount_start;
    private Integer credit_amount_finish;
    private List<String> insurance_aim;
    private Integer insurance_amount_start;
    private Integer insurance_amount_finish;
    private Float rating;
    private Integer popularity;
    private List<String> unique_services;

    public IndividualForm(
            String transferTypes,
            String transferAuto,
            String transferCurrency,
            String paymentMethod,
            String paymentAimsServices,
            String paymentAuto,
            String depositRateStart,
            String depositRateFinish,
            String depositCurrency,
            String depositAdditionalConditions,
            String consultation,
            String cardFreeService,
            String cardTypes,
            String cardCategories,
            String cardAnnualServicePriceStart,
            String cardAnnualServicePriceFinish,
            String cardCashbackStart,
            String cardCashbackFinish,
            String cardDesignToChoose,
            String cardValidityStart,
            String cardValidityFinish,
            String creditAim,
            String creditInterestRateStart,
            String creditInterestRateFinish,
            String creditTermStart,
            String creditTermFinish,
            String creditEarlyPayment,
            String creditAmountStart,
            String creditAmountFinish,
            String insuranceAim,
            String insuranceAmountStart,
            String insuranceAmountFinish,
            String rating,
            String popularity,
            String uniqueServices
    ) {
        this.transfer_types = transferTypes == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(transferTypes.split(", ")));
        this.transfer_auto = Boolean.parseBoolean(transferAuto);
        this.transfer_currency = transferCurrency == null ? new ArrayList<>() :new ArrayList<>(Arrays.asList(transferCurrency.split(", ")));
        this.payment_method = paymentMethod == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(paymentMethod.split(", ")));
        this.payment_aims_services = paymentAimsServices == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(paymentAimsServices.split(", ")));
        this.payment_auto = Boolean.parseBoolean(paymentAuto);
        this.deposit_rate_start = Float.parseFloat(depositRateStart);
        this.deposit_rate_finish = Float.parseFloat(depositRateFinish);
        this.deposit_currency = depositCurrency == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(depositCurrency.split(", ")));
        this.deposit_additional_conditions = depositAdditionalConditions == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(depositAdditionalConditions.split(", ")));
        this.consultation = consultation == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(consultation.split(", ")));
        this.card_free_service = Boolean.parseBoolean(cardFreeService);
        this.card_types = cardTypes == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(cardTypes.split(", ")));
        this.card_categories = cardCategories == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(cardCategories.split(", ")));
        this.card_annual_service_price_start = Integer.parseInt(cardAnnualServicePriceStart);
        this.card_annual_service_price_finish = Integer.parseInt(cardAnnualServicePriceFinish);
        this.card_cashback_start = Float.parseFloat(cardCashbackStart);
        this.card_cashback_finish = Float.parseFloat(cardCashbackFinish);
        this.card_design_to_choose = Boolean.parseBoolean(cardDesignToChoose);
        this.card_validity_start = Integer.parseInt(cardValidityStart);
        this.card_validity_finish = Integer.parseInt(cardValidityFinish);
        this.credit_aim = creditAim == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(creditAim.split(", ")));
        this.credit_interest_rate_start = Float.parseFloat(creditInterestRateStart);
        this.credit_interest_rate_finish = Float.parseFloat(creditInterestRateFinish);
        this.credit_term_start = Integer.parseInt(creditTermStart);
        this.credit_term_finish = Integer.parseInt(creditTermFinish);
        this.credit_early_payment = Boolean.parseBoolean(creditEarlyPayment);
        this.credit_amount_start = Integer.parseInt(creditAmountStart);
        this.credit_amount_finish = Integer.parseInt(creditAmountFinish);
        this.insurance_aim = insuranceAim == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(insuranceAim.split(", ")));
        this.insurance_amount_start = Integer.parseInt(insuranceAmountStart);
        this.insurance_amount_finish = Integer.parseInt(insuranceAmountFinish);
        this.rating = Float.parseFloat(rating);
        this.popularity = Integer.parseInt(popularity);
        this.unique_services = insuranceAim == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(uniqueServices.split(", ")));
    }
}

package com.dreamteam.rbsearch.form;

import lombok.Data;

@Data
public class IndividualForm {
    private String transfer_types;
    private Boolean transfer_auto;
    private String transfer_currency;
    private String payment_method;
    private String payment_aims_services;
    private Boolean payment_auto;
    private Float deposit_rate_start;
    private Float deposit_rate_finish;
    private String deposit_currency;
    private String deposit_additional_conditions;
    private String consultation;
    private Boolean card_free_service;
    private String card_types;
    private String card_categories;
    private Integer card_annual_service_price_start;
    private Integer card_annual_service_price_finish;
    private Float card_cashback_start;
    private Float card_cashback_finish;
    private Boolean card_design_to_choose;
    private Integer card_validity_start;
    private Integer card_validity_finish;
    private String credit_aim;
    private Float credit_interest_rate_start;
    private Float credit_interest_rate_finish;
    private Integer credit_term_start;
    private Integer credit_term_finish;
    private Boolean credit_early_payment;
    private Integer credit_amount_start;
    private Integer credit_amount_finish;
    private String insurance_aim;
    private Integer insurance_amount_start;
    private Integer insurance_amount_finish;
    private Float rating;
    private Integer popularity;
    private String unique_services;

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
        this.transfer_types = transferTypes == null ? "" : transferTypes;
        this.transfer_auto = Boolean.parseBoolean(transferAuto);
        this.transfer_currency = transferCurrency == null ? "" :transferCurrency;
        this.payment_method = paymentMethod == null ? "" : paymentMethod;
        this.payment_aims_services = paymentAimsServices == null ? "" : paymentAimsServices;
        this.payment_auto = Boolean.parseBoolean(paymentAuto);
        this.deposit_rate_start = Float.parseFloat(depositRateStart);
        this.deposit_rate_finish = Float.parseFloat(depositRateFinish);
        this.deposit_currency = depositCurrency == null ? "" : depositCurrency;
        this.deposit_additional_conditions = depositAdditionalConditions == null ? "" : depositAdditionalConditions;
        this.consultation = consultation == null ? "" : consultation;
        this.card_free_service = Boolean.parseBoolean(cardFreeService);
        this.card_types = cardTypes == null ? "" : cardTypes;
        this.card_categories = cardCategories == null ? "" : cardCategories;
        this.card_annual_service_price_start = Integer.parseInt(cardAnnualServicePriceStart);
        this.card_annual_service_price_finish = Integer.parseInt(cardAnnualServicePriceFinish);
        this.card_cashback_start = Float.parseFloat(cardCashbackStart);
        this.card_cashback_finish = Float.parseFloat(cardCashbackFinish);
        this.card_design_to_choose = Boolean.parseBoolean(cardDesignToChoose);
        this.card_validity_start = Integer.parseInt(cardValidityStart);
        this.card_validity_finish = Integer.parseInt(cardValidityFinish);
        this.credit_aim = creditAim == null ? "" : creditAim;
        this.credit_interest_rate_start = Float.parseFloat(creditInterestRateStart);
        this.credit_interest_rate_finish = Float.parseFloat(creditInterestRateFinish);
        this.credit_term_start = Integer.parseInt(creditTermStart);
        this.credit_term_finish = Integer.parseInt(creditTermFinish);
        this.credit_early_payment = Boolean.parseBoolean(creditEarlyPayment);
        this.credit_amount_start = Integer.parseInt(creditAmountStart);
        this.credit_amount_finish = Integer.parseInt(creditAmountFinish);
        this.insurance_aim = insuranceAim == null ? "" : insuranceAim;
        this.insurance_amount_start = Integer.parseInt(insuranceAmountStart);
        this.insurance_amount_finish = Integer.parseInt(insuranceAmountFinish);
        this.rating = Float.parseFloat(rating);
        this.popularity = Integer.parseInt(popularity);
        this.unique_services = insuranceAim == null ? "" : uniqueServices;
    }
}

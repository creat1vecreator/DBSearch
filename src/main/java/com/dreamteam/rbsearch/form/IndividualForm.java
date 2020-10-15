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
    private List<String> deposit_aim;
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
        this.transfer_types = transferTypes == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(transferTypes.split(", ")));
        this.transfer_auto = Boolean.parseBoolean(transferAuto);
        this.transfer_currency = transferCurrency == null ? new ArrayList<>() :new ArrayList<>(Arrays.asList(transferCurrency.split(", ")));
        this.payment_method = paymentMethod == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(paymentMethod.split(", ")));
        this.payment_aims_services = paymentAimsServices == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(paymentAimsServices.split(", ")));
        this.payment_auto = Boolean.parseBoolean(paymentAuto);
        depositRate = depositRate.equals("") ? "[0, 0]" : depositRate;
        String[] depositRateRange = depositRate.replace('[', ' ').replace(']', ' ').strip().split(", ");
        this.deposit_rate_start = Float.parseFloat(depositRateRange[0]);
        this.deposit_rate_finish = Float.parseFloat(depositRateRange[1]);
        this.deposit_aim = depositAim == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(depositAim.split(", ")));
        this.deposit_currency = depositCurrency == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(depositCurrency.split(", ")));
        this.deposit_additional_conditions = depositAdditionalConditions == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(depositAdditionalConditions.split(", ")));
        this.consultation = consultation == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(consultation.split(", ")));
        this.card_free_service = Boolean.parseBoolean(cardFreeService);
        this.card_types = cardTypes == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(cardTypes.split(",")));
        this.card_categories = cardCategories == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(cardCategories.split(",")));
        cardAnnualServicePrice = cardAnnualServicePrice.equals("") ? "[0, 0]" : cardAnnualServicePrice;
        String[] cardAnnualServicePriceRange = cardAnnualServicePrice.replace('[', ' ').replace(']', ' ').strip().split(",");
        this.card_annual_service_price_start = Integer.parseInt(cardAnnualServicePriceRange[0]);
        this.card_annual_service_price_finish = Integer.parseInt(cardAnnualServicePriceRange[1]);
        cardCashback = cardCashback.equals("") ? "[0, 0]" : cardCashback;
        String[] cardCashbackRange = cardCashback.replace('[', ' ').replace(']', ' ').strip().split(",");
        this.card_cashback_start = Float.parseFloat(cardCashbackRange[0]);
        this.card_cashback_finish = Float.parseFloat(cardCashbackRange[1]);
        this.card_design_to_choose = Boolean.parseBoolean(cardDesignToChoose);
        cardValidity = cardValidity.equals("") ? "[0, 0]" : cardValidity;
        String[] cardValidityRange = cardValidity.replace('[', ' ').replace(']', ' ').strip().split(",");
        this.card_validity_start = Integer.parseInt(cardValidityRange[0]);
        this.card_validity_finish = Integer.parseInt(cardValidityRange[1]);
        this.credit_aim = creditAim == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(creditAim.split(",")));
        creditInterestRate = creditInterestRate.equals("") ? "[0, 0]" : creditInterestRate;
        String[] creditInterestRateRange = creditInterestRate.replace('[', ' ').replace(']', ' ').strip().split(",");
        this.credit_interest_rate_start = Float.parseFloat(creditInterestRateRange[0]);
        this.credit_interest_rate_finish = Float.parseFloat(creditInterestRateRange[1]);
        creditTerm = creditTerm.equals("") ? "[0, 0]" : creditTerm;
        String[] creditTermRange = creditTerm.replace('[', ' ').replace(']', ' ').strip().split(",");
        this.credit_term_start = Integer.parseInt(creditTermRange[0]);
        this.credit_term_finish = Integer.parseInt(creditTermRange[1]);
        this.credit_early_payment = Boolean.parseBoolean(creditEarlyPayment);
        creditAmount = creditAmount.equals("") ? "[0, 0]" : creditAmount;
        String[] creditAmountRange = creditAmount.replace('[', ' ').replace(']', ' ').strip().split(",");
        this.credit_amount_start = Integer.parseInt(creditAmountRange[0]);
        this.credit_amount_finish = Integer.parseInt(creditAmountRange[1]);
        this.insurance_aim = insuranceAim == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(insuranceAim.split(",")));
        insuranceAmount = insuranceAmount.equals("") ? "[0, 0]" : insuranceAmount;
        String[] insuranceAmountRange = insuranceAmount.replace('[', ' ').replace(']', ' ').strip().split(",");
        this.insurance_amount_start = Integer.parseInt(insuranceAmountRange[0]);
        this.insurance_amount_finish = Integer.parseInt(insuranceAmountRange[1]);
        this.sorting = sorting == null ? "" : sorting;
        this.unique_services = insuranceAim == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(uniqueServices.split(",")));
    }
}

package com.dreamteam.rbsearch.form;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class IndividualForm {
    private List<String> transferTypes;
    private Boolean transferAuto;
    private List<String> transferCurrency;
    private List<String> paymentMethod;
    private List<String> paymentAimsServices;
    private Boolean paymentAuto;
    private Float depositRate;
    private List<String> depositAim;
    private List<String> depositCurrency;
    private List<String> depositAdditionalConditions;
    private List<String> consultation;
    private Boolean cardFreeService;
    private List<String> cardTypes;
    private List<String> cardCategories;
    private Integer cardAnnualServicePrice;
    private Float cardCashback;
    private Boolean cardDesignToChoose;
    private Integer cardValidity;
    private List<String> creditAim;
    private Float creditInterestRate;
    private Integer creditTerm;
    private Boolean creditEarlyPayment;
    private Integer creditAmount;
    private List<String> insuranceAim;
    private Integer insuranceAmount;
    private String sorting;
    private List<String> uniqueServices;

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
        this.transferTypes = transferTypes == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(transferTypes.split(",")));
        this.transferAuto = Boolean.parseBoolean(transferAuto);
        this.transferCurrency = transferCurrency == null ? new ArrayList<>() :new ArrayList<>(Arrays.asList(transferCurrency.split(",")));
        this.paymentMethod = paymentMethod == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(paymentMethod.split(",")));
        this.paymentAimsServices = paymentAimsServices == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(paymentAimsServices.split(",")));
        this.paymentAuto = Boolean.parseBoolean(paymentAuto);
        this.depositRate = depositRate == null ? null : Float.parseFloat(depositRate);
        this.depositAim = depositAim == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(depositAim.split(",")));
        this.depositCurrency = depositCurrency == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(depositCurrency.split(",")));
        this.depositAdditionalConditions = depositAdditionalConditions == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(depositAdditionalConditions.split(",")));
        this.consultation = consultation == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(consultation.split(",")));
        this.cardFreeService = Boolean.parseBoolean(cardFreeService);
        this.cardTypes = cardTypes == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(cardTypes.split(",")));
        this.cardCategories = cardCategories == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(cardCategories.split(",")));
        this.cardAnnualServicePrice = cardAnnualServicePrice == null ? null : Integer.parseInt(cardAnnualServicePrice);
        this.cardCashback = cardCashback ==null ? null :Float.parseFloat(cardCashback);
        this.cardDesignToChoose = Boolean.parseBoolean(cardDesignToChoose);
        this.cardValidity = cardValidity == null ? null :Integer.parseInt(cardValidity);
        this.creditAim = creditAim == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(creditAim.split(",")));
        this.creditInterestRate = creditInterestRate == null ? null : Float.parseFloat(creditInterestRate);
        this.creditTerm = creditTerm == null ? null :Integer.parseInt(creditTerm);
        this.creditEarlyPayment = Boolean.parseBoolean(creditEarlyPayment);
        this.creditAmount = creditAmount == null? null:Integer.parseInt(creditAmount);
        this.insuranceAim = insuranceAim == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(insuranceAim.split(",")));
        this.insuranceAmount = insuranceAmount == null ? null:Integer.parseInt(insuranceAmount);
        this.sorting = sorting == null ? "" : sorting;
        this.uniqueServices = insuranceAim == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(uniqueServices.split(",")));
    }
}

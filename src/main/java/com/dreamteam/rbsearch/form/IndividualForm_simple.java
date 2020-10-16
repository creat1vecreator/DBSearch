package com.dreamteam.rbsearch.form;

import lombok.Data;

@Data
public class IndividualForm_simple {
    private String transferTypes;
    private Boolean transferAuto;
    private String transferCurrency;
    private String paymentMethod;
    private String paymentAimsServices;
    private Boolean paymentAuto;
    private Float depositRate;
    private String depositAim;
    private String depositCurrency;
    private String depositAdditionalConditions;
    private String consultation;
    private Boolean cardFreeService;
    private String cardTypes;
    private String cardCategories;
    private Integer cardAnnualServicePrice;
    private Float cardCashback;
    private Boolean cardDesignToChoose;
    private Integer cardValidity;
    private String creditAim;
    private Float creditInterestRate;
    private Integer creditTermStart;
    private Integer creditTerm;
    private Boolean creditEarlyPayment;
    private Integer creditAmount;
    private String insuranceAim;
    private Integer insuranceAmount;
    private String sorting;
    private String uniqueServices;

    public IndividualForm_simple(
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
        this.transferTypes = transferTypes == null ? "" : transferTypes;
        this.transferAuto = Boolean.parseBoolean(transferAuto);
        this.transferCurrency = transferCurrency == null ? "" :transferCurrency;
        this.paymentMethod = paymentMethod == null ? "" : paymentMethod;
        this.paymentAimsServices = paymentAimsServices == null ? "" : paymentAimsServices;
        this.paymentAuto = Boolean.parseBoolean(paymentAuto);
        this.depositRate = Float.parseFloat(depositRate);
        this.depositAim = depositAim == null ? "" : depositAim;
        this.depositCurrency = depositCurrency == null ? "" : depositCurrency;
        this.depositAdditionalConditions = depositAdditionalConditions == null ? "" : depositAdditionalConditions;
        this.consultation = consultation == null ? "" : consultation;
        this.cardFreeService = Boolean.parseBoolean(cardFreeService);
        this.cardTypes = cardTypes == null ? "" : cardTypes;
        this.cardCategories = cardCategories == null ? "" : cardCategories;
        this.cardAnnualServicePrice = Integer.parseInt(cardAnnualServicePrice);
        this.cardCashback = Float.parseFloat(cardCashback);
        this.cardDesignToChoose = Boolean.parseBoolean(cardDesignToChoose);
        this.cardValidity = Integer.parseInt(cardValidity);
        this.creditAim = creditAim == null ? "" : creditAim;
        this.creditInterestRate = Float.parseFloat(creditInterestRate);
        this.creditTerm = Integer.parseInt(creditTerm);
        this.creditEarlyPayment = Boolean.parseBoolean(creditEarlyPayment);
        this.creditAmount = Integer.parseInt(creditAmount);
        this.insuranceAim = insuranceAim == null ? "" : insuranceAim;
        this.insuranceAmount = Integer.parseInt(insuranceAmount);
        this.sorting = sorting == null ? "" : sorting;
        this.uniqueServices = insuranceAim == null ? "" : uniqueServices;
    }
}

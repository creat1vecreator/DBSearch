package com.dreamteam.rbsearch.form;

import lombok.Data;

@Deprecated
@Data
public class LegalEntityForm_simple {
    private String paymentAimsServices;
    private String paymentMethod;
    private Boolean paymentAuto;
    private String servicesFinancial;
    private String servicesSales;
    private String servicesDocumentManagement;
    private String servicesAnalytics;
    private Integer bankAccountOpeningPrice;
    private Boolean bankAccountAvailabilityOfFreePeriod;
    private String bankAccountCurrency;
    private String bankAccountTypes;
    private String acquiringTypes;
    private Float minimumCommissionRateOfTurnover;
    private String creditAim;
    private Float creditInterestRate;
    private Integer creditTerm;
    private Boolean creditEarlyRepayment;
    private Float depositRate;
    private String depositCurrency;
    private String depositTypesOfFunds;
    private String depositAdditionalConditions;
    private String consultation;
    private String cardTypes;
    private String cardCategories;
    private Integer cardAnnualServicePrice;
    private String insuranceAim;
    private Integer insuranceAmount;
    private String corporationServices;
    private String corporationFinancing;

    public LegalEntityForm_simple(
            String paymentAimsServices,
            String paymentMethod,
            String paymentAuto,
            String servicesFinancial,
            String servicesSales,
            String servicesDocumentManagement,
            String servicesAnalytics,
            String bankAccountOpeningPrice,
            String bankAccountAvailabilityOfFreePeriod,
            String bankAccountCurrency,
            String bankAccountTypes,
            String acquiringTypes,
            String minimumCommissionRateOfTurnover,
            String creditAim,
            String creditInterestRate,
            String creditTerm,
            String creditEarlyRepayment,
            String depositRate,
            String depositCurrency,
            String depositTypesOfFunds,
            String depositAdditionalConditions,
            String consultation,
            String cardTypes,
            String cardCategories,
            String cardAnnualServicePrice,
            String insuranceAim,
            String insuranceAmount,
            String corporationServices,
            String corporationFinancing
    ) {
        this.paymentAimsServices = paymentAimsServices == null ? "" : paymentAimsServices;        this.paymentMethod = paymentMethod == null ? "" : paymentMethod;
        this.paymentAuto = Boolean.parseBoolean(paymentAuto);
        this.servicesFinancial = servicesFinancial == null ? "" : servicesFinancial;
        this.servicesSales = servicesSales == null ? "" : servicesSales;
        this.servicesDocumentManagement = servicesDocumentManagement == null ? "" : servicesDocumentManagement;
        this.servicesAnalytics = servicesAnalytics == null ? "" : servicesAnalytics;
        this.bankAccountOpeningPrice = Integer.parseInt(bankAccountOpeningPrice);
        this.bankAccountAvailabilityOfFreePeriod = Boolean.parseBoolean(bankAccountAvailabilityOfFreePeriod);
        this.bankAccountCurrency = bankAccountCurrency == null ? "" : bankAccountCurrency;
        this.bankAccountTypes = bankAccountTypes == null ? "" : bankAccountTypes;
        this.acquiringTypes = acquiringTypes == null ? "" : acquiringTypes;
        this.minimumCommissionRateOfTurnover = Float.parseFloat(minimumCommissionRateOfTurnover);
        this.creditAim = creditAim == null ? "" : creditAim;
        this.creditInterestRate = Float.parseFloat(creditInterestRate);
        this.creditTerm = Integer.parseInt(creditTerm);
        this.creditEarlyRepayment = Boolean.parseBoolean(creditEarlyRepayment);
        this.depositRate = Float.parseFloat(depositRate);
        this.depositCurrency = depositCurrency == null ? "" : depositCurrency;
        this.depositTypesOfFunds = depositTypesOfFunds == null ? "" : depositTypesOfFunds;
        this.depositAdditionalConditions = depositAdditionalConditions == null ? "" : depositAdditionalConditions;
        this.consultation = consultation == null ? "" : consultation;
        this.cardTypes = cardTypes == null ? "" : cardTypes;
        this.cardCategories = cardCategories == null ? "" : cardCategories;
        this.cardAnnualServicePrice = Integer.parseInt(cardAnnualServicePrice);
        this.insuranceAim = insuranceAim == null ? "" : insuranceAim;
        this.insuranceAmount = Integer.parseInt(insuranceAmount);
        this.corporationServices = corporationServices == null ? "" : corporationServices;
        this.corporationFinancing = corporationFinancing == null ? "" : corporationFinancing;
    }
}

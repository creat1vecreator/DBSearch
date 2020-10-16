package com.dreamteam.rbsearch.form;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class LegalEntityForm {
    private List<String> paymentAimsServices;
    private List<String> paymentMethod;
    private Boolean paymentAuto;
    private List<String> servicesFinancial;
    private List<String> servicesSales;
    private List<String> servicesDocumentManagement;
    private List<String> servicesAnalytics;
    private Integer bankAccountOpeningPrice;
    private Boolean bankAccountAvailabilityOfFreePeriod;
    private List<String> bankAccountCurrency;
    private List<String> bankAccountTypes;
    private List<String> acquiringTypes;
    private Float minimumCommissionRateOfTurnover;
    private List<String> creditAim;
    private Float creditInterestRate;
    private Integer creditTerm;
    private Boolean creditEarlyRepayment;
    private Float depositRate;
    private List<String> depositCurrency;
    private List<String> depositTypesOfFunds;
    private List<String> depositAdditionalConditions;
    private List<String> consultation;
    private List<String> cardTypes;
    private List<String> cardCategories;
    private Integer cardAnnualServicePrice;
    private List<String> insuranceAim;
    private Integer insuranceAmount;
    private List<String> corporationServices;
    private List<String> corporationFinancing;

    public LegalEntityForm(
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
        this.paymentAimsServices = paymentAimsServices == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(paymentAimsServices.split(",")));
        this.paymentMethod = paymentMethod == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(paymentMethod.split(",")));
        this.paymentAuto = Boolean.parseBoolean(paymentAuto);
        this.servicesFinancial = servicesFinancial == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(servicesFinancial.split(",")));
        this.servicesSales = servicesSales == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(servicesSales.split(",")));
        this.servicesDocumentManagement = servicesDocumentManagement == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(servicesDocumentManagement.split(",")));
        this.servicesAnalytics = servicesAnalytics == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(servicesAnalytics.split(",")));
        this.bankAccountOpeningPrice = Integer.parseInt(bankAccountOpeningPrice);
        this.bankAccountAvailabilityOfFreePeriod = Boolean.parseBoolean(bankAccountAvailabilityOfFreePeriod);
        this.bankAccountCurrency = bankAccountCurrency == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(bankAccountCurrency.split(",")));
        this.bankAccountTypes = bankAccountTypes == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(bankAccountTypes.split(",")));
        this.acquiringTypes = acquiringTypes == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(acquiringTypes.split(",")));
        this.minimumCommissionRateOfTurnover = Float.parseFloat(minimumCommissionRateOfTurnover);
        this.creditAim = creditAim == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(creditAim.split(",")));
        this.creditInterestRate = Float.parseFloat(creditInterestRate);
        this.creditTerm = Integer.parseInt(creditTerm);
        this.creditEarlyRepayment = Boolean.parseBoolean(creditEarlyRepayment);
        this.depositRate = Float.parseFloat(depositRate);
        this.depositCurrency = depositCurrency == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(depositCurrency.split(",")));
        this.depositTypesOfFunds = depositTypesOfFunds == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(depositTypesOfFunds.split(",")));
        this.depositAdditionalConditions = depositAdditionalConditions == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(depositAdditionalConditions.split(",")));
        this.consultation = consultation == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(consultation.split(",")));
        this.cardTypes = cardTypes == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(cardTypes.split(",")));
        this.cardCategories = cardCategories == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(cardCategories.split(",")));
        this.cardAnnualServicePrice = Integer.parseInt(cardAnnualServicePrice);
        this.insuranceAim = insuranceAim == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(insuranceAim.split(",")));
        this.insuranceAmount = Integer.parseInt(insuranceAmount);
        this.corporationServices = corporationServices == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(corporationServices.split(",")));
        this.corporationFinancing = corporationFinancing == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(corporationFinancing.split(",")));
    }
}

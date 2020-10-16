package com.dreamteam.rbsearch.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity(name = "legal_entity_bank_list_2")
@AllArgsConstructor
@NoArgsConstructor
public class LegalEntityEntity_simple extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(name = "payment_aims_services")
    private String paymentAimsServices;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "payment_auto")
    private Boolean paymentAuto;

    @Column(name = "services_financial")
    private String servicesFinancial;

    @Column(name = "services_sales")
    private String servicesSales;

    @Column(name = "services_document_management")
    private String servicesDocumentManagement;

    @Column(name = "services_analytics")
    private String servicesAnalytics;

    @Column(name = "bank_account_opening_price")
    private Integer bankAccountOpeningPrice;

    @Column(name = "bank_account_availability_of_free_period")
    private Boolean bankAccountAvailabilityOfFreePeriod;

    @Column(name = "bank_account_currency")
    private String bankAccountCurrency;

    @Column(name = "bank_account_types")
    private String bankAccountTypes;

    @Column(name = "acquiring_types")
    private String acquiringTypes;

    @Column(name = "minimum_commission_rate_of_turnover")
    private Float minimumCommissionRateOfTurnover;

    @Column(name = "credit_aim")
    private String creditAim;

    @Column(name = "credit_interest_rate")
    private Float creditInterestRate;

    @Column(name = "credit_term")
    private Integer creditTerm;

    @Column(name = "credit_early_repayment")
    private Boolean creditEarlyRepayment;

    @Column(name = "deposit_rate")
    private Float depositRate;

    @Column(name = "deposit_currency")
    private String depositCurrency;

    @Column(name = "deposit_types_of_funds")
    private String depositTypesOfFunds;

    @Column(name = "deposit_additional_conditions")
    private String depositAdditionalConditions;

    @Column
    private String consultation;

    @Column(name = "card_types")
    private String cardTypes;

    @Column(name = "card_categories")
    private String cardCategories;

    @Column(name = "card_annual_service_price")
    private Integer cardAnnualServicePrice;

    @Column(name = "insurance_aim")
    private String insuranceAim;

    @Column(name = "insurance_amount")
    private Integer insuranceAmount;

    @Column(name = "corporation_services")
    private String corporationServices;

    @Column(name = "corporation_financing")
    private String corporationFinancing;

    @Column(name = "security") // only for web
    private String security;
}

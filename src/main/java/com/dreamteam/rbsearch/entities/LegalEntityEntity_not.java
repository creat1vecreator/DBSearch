package com.dreamteam.rbsearch.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Deprecated
@Data
@Entity(name = "legal_entity_bank_list_release")
@AllArgsConstructor
@NoArgsConstructor
public class LegalEntityEntity_not extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(name = "payment_aims_services")
    @ElementCollection
    private List<String> paymentAimsServices;

    @Column(name = "payment_method")
    @ElementCollection
    private List<String> paymentMethod;

    @Column(name = "payment_auto")
    private Boolean paymentAuto;

    @Column(name = "services_financial")
    @ElementCollection
    private List<String> servicesFinancial;

    @Column(name = "services_sales")
    @ElementCollection
    private List<String> servicesSales;

    @Column(name = "services_document_management")
    @ElementCollection
    private List<String> servicesDocumentManagement;

    @Column(name = "services_analytics")
    @ElementCollection
    private List<String> servicesAnalytics;

    @Column(name = "bank_account_opening_price")
    private Integer bankAccountOpeningPrice;

    @Column(name = "bank_account_availability_of_free_period")
    private Boolean bankAccountAvailabilityOfFreePeriod;

    @Column(name = "bank_account_currency")
    @ElementCollection
    private List<String> bankAccountCurrency;

    @Column(name = "bank_account_types")
    @ElementCollection
    private List<String> bankAccountTypes;

    @Column(name = "acquiring_types")
    @ElementCollection
    private List<String> acquiringTypes;

    @Column(name = "minimum_commission_rate_of_turnover")
    private Float minimumCommissionRateOfTurnover;

    @Column(name = "credit_aim")
    @ElementCollection
    private List<String> creditAim;

    @Column(name = "credit_interest_rate")
    private Float creditInterestRate;

    @Column(name = "credit_term")
    private Integer creditTerm;

    @Column(name = "credit_early_repayment")
    private Boolean creditEarlyRepayment;

    @Column(name = "deposit_rate")
    private Float depositRate;

    @Column(name = "deposit_currency")
    @ElementCollection
    private List<String> depositCurrency;

    @Column(name = "deposit_types_of_funds")
    @ElementCollection
    private List<String> depositTypesOfFunds;

    @Column(name = "deposit_additional_conditions")
    @ElementCollection
    private List<String> depositAdditionalConditions;

    @Column
    @ElementCollection
    private List<String> consultation;

    @Column(name = "card_types")
    @ElementCollection
    private List<String> cardTypes;

    @Column(name = "card_categories")
    @ElementCollection
    private List<String> cardCategories;

    @Column(name = "card_annual_service_price")
    private Integer cardAnnualServicePrice;

    @Column(name = "insurance_aim")
    @ElementCollection
    private List<String> insuranceAim;

    @Column(name = "insurance_amount")
    private Integer insuranceAmount;

    @Column(name = "corporation_services")
    @ElementCollection
    private List<String> corporationServices;

    @Column(name = "corporation_financing")
    @ElementCollection
    private List<String> corporationFinancing;

    @Column(name = "security") // only for web
    @ElementCollection
    private List<String> security;
}

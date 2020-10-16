package com.dreamteam.rbsearch.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "individuals_bank_list_release")
@AllArgsConstructor
@NoArgsConstructor
public class IndividualEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(name = "transfer_types")
    private String transferTypes;

    @Column(name = "transfer_auto")
    private Boolean transferAuto;

    @Column(name = "transfer_currency")
    private String transferCurrency;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "payment_aims_services")
    private String paymentAimsServices;

    @Column(name = "payment_auto")
    private Boolean paymentAuto;

    @Column(name = "deposit_rate")
    private Float depositRate;

    @Column(name = "deposit_aim")
    private String depositAim;

    @Column(name = "deposit_currency")
    private String depositCurrency;

    @Column(name = "deposit_additional_conditions")
    private String depositAdditionalConditions;

    @Column
    private String consultation;

    @Column(name = "card_free_service")
    private Boolean cardFreeService;

    @Column(name = "card_types")
    private String cardTypes;

    @Column(name = "card_categories")
    private String cardCategories;

    @Column(name = "card_annual_service_price")
    private Integer cardAnnualServicePrice;

    @Column(name = "card_cashback")
    private Float cardCashback;

    @Column(name = "card_design_to_choose")
    private Boolean cardDesignToChoose;

    @Column(name = "card_validity")
    private Integer cardValidity;

    @Column(name = "credit_aim")
    private String creditAim;

    @Column(name = "credit_interest_rate")
    private Float creditInterestRate;

    @Column(name = "credit_term")
    private Integer creditTerm;

    @Column(name = "credit_early_payment")
    private Boolean creditEarlyPayment;

    @Column(name = "credit_amount")
    private Integer creditAmount;

    @Column(name = "insurance_aim")
    private String insuranceAim;

    @Column(name = "insurance_amount")
    private Integer insuranceAmount;

    @Column
    private Float rating;

    @Column
    private Integer popularity;

    @Column(name = "unique_services")
    private String uniqueServices;

    @Column
    private String advantages;

    @Column
    private String disadvantages;

    @Column
    private String security;
}

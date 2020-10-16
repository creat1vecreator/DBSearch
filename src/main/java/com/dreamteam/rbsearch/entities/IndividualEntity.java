package com.dreamteam.rbsearch.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "individual_bank_list_release")
@AllArgsConstructor
@NoArgsConstructor
public class IndividualEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(name = "transfer_types")
    @ElementCollection
    private List<String> transferTypes;

    @Column(name = "transfer_auto")
    private Boolean transferAuto;

    @Column(name = "transfer_currency")
    @ElementCollection
    private List<String> transferCurrency;

    @Column(name = "payment_method")
    @ElementCollection
    private List<String> paymentMethod;

    @Column(name = "payment_aims_services")
    @ElementCollection
    private List<String> paymentAimsServices;

    @Column(name = "payment_auto")
    private Boolean paymentAuto;

    @Column(name = "deposit_rate")
    private Float depositRate;

    @Column(name = "deposit_aim")
    @ElementCollection
    private List<String> depositAim;

    @Column(name = "deposit_currency")
    @ElementCollection
    private List<String> depositCurrency;

    @Column(name = "deposit_additional_conditions")
    @ElementCollection
    private List<String> depositAdditionalConditions;

    @Column
    @ElementCollection
    private List<String> consultation;

    @Column(name = "card_free_service")
    private Boolean cardFreeService;

    @Column(name = "card_types")
    @ElementCollection
    private List<String> cardTypes;

    @Column(name = "card_categories")
    @ElementCollection
    private List<String> cardCategories;

    @Column(name = "card_annual_service_price")
    private Integer cardAnnualServicePrice;

    @Column(name = "card_cashback")
    private Float cardCashback;

    @Column(name = "card_design_to_choose")
    private Boolean cardDesignToChoose;

    @Column(name = "card_validity")
    private Integer cardValidity;

    @Column(name = "credit_aim")
    @ElementCollection
    private List<String> creditAim;

    @Column(name = "credit_interest_rate")
    private Float creditInterestRate;

    @Column(name = "credit_term")
    private Integer creditTerm;

    @Column(name = "credit_early_payment")
    private Boolean creditEarlyPayment;

    @Column(name = "credit_amount")
    private Integer creditAmount;

    @Column(name = "insurance_aim")
    @ElementCollection
    private List<String> insuranceAim;

    @Column(name = "insurance_amount")
    private Integer insuranceAmount;

    @Column
    private Float rating;

    @Column
    private Integer popularity;

    @Column(name = "unique_services")
    @ElementCollection
    private List<String> uniqueServices;

    @Column
    @ElementCollection
    private List<String> advantages;

    @Column
    @ElementCollection
    private List<String> disadvantages;

    @Column
    @ElementCollection
    private List<String> security;
}

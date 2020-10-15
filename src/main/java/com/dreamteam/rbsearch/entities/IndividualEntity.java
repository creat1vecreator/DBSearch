package com.dreamteam.rbsearch.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "individual_bank_list_release_2")
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

    @Column(name = "deposit_rate_start")
    private Float depositRateStart;

    @Column(name = "deposit_rate_finish")
    private Float depositRateFinish;

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

    @Column(name = "card_annual_service_price_start")
    private Integer cardAnnualServicePriceStart;

    @Column(name = "card_annual_service_price_finish")
    private Integer cardAnnualServicePriceFinish;

    @Column(name = "card_cashback_start")
    private Float cardCashbackStart;

    @Column(name = "card_cashback_finish")
    private Float cardCashbackFinish;

    @Column(name = "card_design_to_choose")
    private Boolean cardDesignToChoose;

    @Column(name = "card_validity_start")
    private Integer cardValidityStart;

    @Column(name = "card_validity_finish")
    private Integer cardValidityFinish;

    @Column(name = "credit_aim")
    @ElementCollection
    private List<String> creditAim;

    @Column(name = "credit_interest_rate_start")
    private Float creditInterestRateStart;

    @Column(name = "credit_interest_rate_finish")
    private Float creditInterestRateFinish;

    @Column(name = "credit_term_start")
    private Integer creditTermStart;

    @Column(name = "credit_term_finish")
    private Integer creditTermFinish;

    @Column(name = "credit_early_payment")
    private Boolean creditEarlyPayment;

    @Column(name = "credit_amount_start")
    private Integer creditAmountStart;

    @Column(name = "credit_amount_finish")
    private Integer creditAmountFinish;

    @Column(name = "insurance_aim")
    @ElementCollection
    private List<String> insuranceAim;

    @Column(name = "insurance_amount_start")
    private Integer insuranceAmountStart;

    @Column(name = "insurance_amount_finish")
    private Integer insuranceAmountFinish;

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
}

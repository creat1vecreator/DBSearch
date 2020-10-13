package com.dreamteam.rbsearch.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Entity(name = "individual_bank_list")
@AllArgsConstructor
@NoArgsConstructor
public class IndividualEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column private String name;

    @Column private String transfer_type;

    @Column private Boolean transfer_auto;

    @Column private String transfer_currency;

    @Column private String payment_method;

    @Column private String payment_aims_services;

    @Column private Boolean payment_auto;

    @Column private Float deposit_rate_start;

    @Column private Float deposit_rate_finish;

    @Column private String deposit_currency;

    @Column private String deposit_additional_conditions;

    @Column private String consultation;

    @Column private Boolean card_free_service;

    @Column private String card_types;

    @Column private String card_categories;

    @Column private Integer card_annual_service_price_start;

    @Column private Integer card_annual_service_price_finish;

    @Column private Float card_cashback_start;

    @Column private Float card_cashback_finish;

    @Column private Boolean card_design_to_choose;

    @Column private Integer card_validity_start;

    @Column private Integer card_validity_finish;

    @Column private String credit_aim;

    @Column private Float credit_interest_rate_start;

    @Column private Float credit_interest_rate_finish;

    @Column private Integer credit_term_start;

    @Column private Integer credit_term_finish;

    @Column private Boolean credit_early_payment;

    @Column private Integer credit_amount_start;

    @Column private Integer credit_amount_finish;

    @Column private String insurance_aim;

    @Column private Integer insurance_amount_start;

    @Column private Integer insurance_amount_finish;

    @Column private Float rating;

    @Column private Integer popularity;

    @Column private String unique_services;

    @Column private String advantages;

    @Column private String disadvantages;
}

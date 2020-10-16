package com.dreamteam.rbsearch.repositories;

import com.dreamteam.rbsearch.entities.IndividualEntity;
import com.dreamteam.rbsearch.entities.IndividualEntity_simple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IndividualRepository_simple extends JpaRepository<IndividualEntity_simple, Long> {

    Optional<IndividualEntity_simple> findById(Long id);

    Optional<IndividualEntity_simple> findByNameIgnoreCase(String name);

    List<IndividualEntity_simple> findAllByTransferTypesContains(String transferTypes);

    List<IndividualEntity_simple> findAllByTransferAutoEquals(Boolean transferAuto);

    List<IndividualEntity_simple> findAllByTransferCurrencyContains(String transferCurrency);

    List<IndividualEntity_simple> findAllByPaymentMethodContains(String paymentMethod);

    List<IndividualEntity_simple> findAllByPaymentAimsServicesContains(String paymentAimsServices);

    List<IndividualEntity_simple> findAllByPaymentAutoEquals(Boolean payment_auto);

    List<IndividualEntity_simple> findAllByDepositRateGreaterThan(Float depositRate);

    List<IndividualEntity_simple> findAllByDepositAimContains(String depositAim);

    List<IndividualEntity_simple> findAllByDepositCurrencyContains(String depositCurrency);

    List<IndividualEntity_simple> findAllByDepositAdditionalConditionsContains(String depositAdditionalConditions);

    List<IndividualEntity_simple> findAllByConsultationContains(String consultation);

    List<IndividualEntity_simple> findAllByCardFreeServiceEquals(Boolean cardFreeService);

    List<IndividualEntity_simple> findAllByCardTypesContains(String cardTypes);

    List<IndividualEntity_simple> findAllByCardCategoriesContains(String cardCategories);

    List<IndividualEntity_simple> findAllByCardAnnualServicePriceLessThan(Integer cardAnnualServicePrice);

    List<IndividualEntity_simple> findAllByCardCashbackGreaterThan(Float cardCashback);

    List<IndividualEntity_simple> findAllByCardDesignToChooseEquals(Boolean cardDesignToChoose);

    List<IndividualEntity_simple> findAllByCardValidityGreaterThan(Integer cardValidity);

    List<IndividualEntity_simple> findAllByCreditAimContains(String creditAim);

    List<IndividualEntity_simple> findAllByCreditInterestRateLessThan(Float creditInterestRate);

    List<IndividualEntity_simple> findAllByCreditTermGreaterThan(Integer creditTerm);

    List<IndividualEntity_simple> findAllByCreditEarlyPaymentEquals(Boolean creditEarlyPayment);

    List<IndividualEntity_simple> findAllByCreditAmountGreaterThan(Integer creditAmount);

    List<IndividualEntity_simple> findAllByInsuranceAimContains(String insuranceAim);

    List<IndividualEntity_simple> findAllByInsuranceAmountGreaterThan(Integer insuranceAmount);

    List<IndividualEntity_simple> findByOrderByRating();

    List<IndividualEntity_simple> findByOrderByPopularity();

    List<IndividualEntity_simple> findAllByUniqueServicesContains(String uniqueServices);
}

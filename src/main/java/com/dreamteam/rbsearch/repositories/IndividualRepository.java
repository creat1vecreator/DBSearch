package com.dreamteam.rbsearch.repositories;

import com.dreamteam.rbsearch.entities.IndividualEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IndividualRepository extends JpaRepository<IndividualEntity, Long> {

    Optional<IndividualEntity> findById(Long id);

    Optional<IndividualEntity> findByNameIgnoreCase(String name);

    List<IndividualEntity> findAllByTransferTypesIn(List<String> transferTypes);

    List<IndividualEntity> findAllByTransferAutoEquals(Boolean transferAuto);

    List<IndividualEntity> findAllByTransferCurrencyIn(List<String> transferCurrency);

    List<IndividualEntity> findAllByPaymentMethodIn(List<String> paymentMethod);

    List<IndividualEntity> findAllByPaymentAimsServicesIn(List<String> paymentAimsServices);

    List<IndividualEntity> findAllByPaymentAutoEquals(Boolean payment_auto);

    List<IndividualEntity> findAllByDepositRateGreaterThan(Float depositRate);

    List<IndividualEntity> findAllByDepositAimIn(List<String> depositAim);

    List<IndividualEntity> findAllByDepositCurrencyIn(List<String> depositCurrency);

    List<IndividualEntity> findAllByDepositAdditionalConditionsIn(List<String> depositAdditionalConditions);

    List<IndividualEntity> findAllByConsultationIn(List<String> consultation);

    List<IndividualEntity> findAllByCardFreeServiceEquals(Boolean cardFreeService);

    List<IndividualEntity> findAllByCardTypesIn(List<String> cardTypes);

    List<IndividualEntity> findAllByCardCategoriesIn(List<String> cardCategories);

    List<IndividualEntity> findAllByCardAnnualServicePriceLessThan(Integer cardAnnualServicePrice);

    List<IndividualEntity> findAllByCardCashbackGreaterThan(Float cardCashback);

    List<IndividualEntity> findAllByCardDesignToChooseEquals(Boolean cardDesignToChoose);

    List<IndividualEntity> findAllByCardValidityGreaterThan(Integer cardValidity);

    List<IndividualEntity> findAllByCreditAimIn(List<String> creditAim);

    List<IndividualEntity> findAllByCreditInterestRateLessThan(Float creditInterestRate);

    List<IndividualEntity> findAllByCreditTermGreaterThan(Integer creditTerm);

    List<IndividualEntity> findAllByCreditEarlyPaymentEquals(Boolean creditEarlyPayment);

    List<IndividualEntity> findAllByCreditAmountGreaterThan(Integer creditAmount);

    List<IndividualEntity> findAllByInsuranceAimIn(List<String> insuranceAim);

    List<IndividualEntity> findAllByInsuranceAmountGreaterThan(Integer insuranceAmount);

    List<IndividualEntity> findByOrderByRating();

    List<IndividualEntity> findByOrderByPopularity();

    List<IndividualEntity> findAllByUniqueServicesIn(List<String> uniqueServices);
}

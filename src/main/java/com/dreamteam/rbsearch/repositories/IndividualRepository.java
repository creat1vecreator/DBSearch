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

    List<IndividualEntity> findAllByTransferTypesContains(String transferTypes);

    List<IndividualEntity> findAllByTransferAutoEquals(Boolean transferAuto);

    List<IndividualEntity> findAllByTransferCurrencyContains(String transferCurrency);

    List<IndividualEntity> findAllByPaymentMethodContains(String paymentMethod);

    List<IndividualEntity> findAllByPaymentAimsServicesContains(String paymentAimsServices);

    List<IndividualEntity> findAllByPaymentAutoEquals(Boolean payment_auto);

    List<IndividualEntity> findAllByDepositRateGreaterThan(Float depositRate);

    List<IndividualEntity> findAllByDepositAimContains(String depositAim);

    List<IndividualEntity> findAllByDepositCurrencyContains(String depositCurrency);

    List<IndividualEntity> findAllByDepositAdditionalConditionsContains(String depositAdditionalConditions);

    List<IndividualEntity> findAllByConsultationContains(String consultation);

    List<IndividualEntity> findAllByCardFreeServiceEquals(Boolean cardFreeService);

    List<IndividualEntity> findAllByCardTypesContains(String cardTypes);

    List<IndividualEntity> findAllByCardCategoriesContains(String cardCategories);

    List<IndividualEntity> findAllByCardAnnualServicePriceLessThan(Integer cardAnnualServicePrice);

    List<IndividualEntity> findAllByCardCashbackGreaterThan(Float cardCashback);

    List<IndividualEntity> findAllByCardDesignToChooseEquals(Boolean cardDesignToChoose);

    List<IndividualEntity> findAllByCardValidityGreaterThan(Integer cardValidity);

    List<IndividualEntity> findAllByCreditAimContains(String creditAim);

    List<IndividualEntity> findAllByCreditInterestRateLessThan(Float creditInterestRate);

    List<IndividualEntity> findAllByCreditTermGreaterThan(Integer creditTerm);

    List<IndividualEntity> findAllByCreditEarlyPaymentEquals(Boolean creditEarlyPayment);

    List<IndividualEntity> findAllByCreditAmountGreaterThan(Integer creditAmount);

    List<IndividualEntity> findAllByInsuranceAimContains(String insuranceAim);

    List<IndividualEntity> findAllByInsuranceAmountGreaterThan(Integer insuranceAmount);

    List<IndividualEntity> findByOrderByRating();

    List<IndividualEntity> findByOrderByPopularity();

    List<IndividualEntity> findAllByUniqueServicesContains(String uniqueServices);

    List<IndividualEntity> findAll();
}

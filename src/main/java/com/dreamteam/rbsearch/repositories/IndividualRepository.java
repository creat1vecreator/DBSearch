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

    List<IndividualEntity> findAllByTransferTypesContainsIgnoreCase(String transferTypes);

    List<IndividualEntity> findAllByTransferAutoEquals(Boolean transferAuto);

    List<IndividualEntity> findAllByTransferCurrencyContainsIgnoreCase(String transferCurrency);

    List<IndividualEntity> findAllByPaymentMethodContainsIgnoreCase(String paymentMethod);

    List<IndividualEntity> findAllByPaymentAimsServicesContainsIgnoreCase(String paymentAimsServices);

    List<IndividualEntity> findAllByPaymentAutoEquals(Boolean payment_auto);

    List<IndividualEntity> findAllByDepositRateGreaterThanEqual(Float depositRate);

    List<IndividualEntity> findAllByDepositAimContainsIgnoreCase(String depositAim);

    List<IndividualEntity> findAllByDepositCurrencyContainsIgnoreCase(String depositCurrency);

    List<IndividualEntity> findAllByDepositAdditionalConditionsContainsIgnoreCase(String depositAdditionalConditions);

    List<IndividualEntity> findAllByConsultationContainsIgnoreCase(String consultation);

    List<IndividualEntity> findAllByCardFreeServiceEquals(Boolean cardFreeService);

    List<IndividualEntity> findAllByCardTypesContainsIgnoreCase(String cardTypes);

    List<IndividualEntity> findAllByCardCategoriesContainsIgnoreCase(String cardCategories);

    List<IndividualEntity> findAllByCardAnnualServicePriceLessThan(Integer cardAnnualServicePrice);

    List<IndividualEntity> findAllByCardCashbackGreaterThanEqual(Float cardCashback);

    List<IndividualEntity> findAllByCardDesignToChooseEquals(Boolean cardDesignToChoose);

    List<IndividualEntity> findAllByCardValidityGreaterThanEqual(Integer cardValidity);

    List<IndividualEntity> findAllByCreditAimContainsIgnoreCase(String creditAim);

    List<IndividualEntity> findAllByCreditInterestRateLessThan(Float creditInterestRate);

    List<IndividualEntity> findAllByCreditTermGreaterThanEqual(Integer creditTerm);

    List<IndividualEntity> findAllByCreditEarlyPaymentEquals(Boolean creditEarlyPayment);

    List<IndividualEntity> findAllByCreditAmountGreaterThanEqual(Integer creditAmount);

    List<IndividualEntity> findAllByInsuranceAimContainsIgnoreCase(String insuranceAim);

    List<IndividualEntity> findAllByInsuranceAmountGreaterThanEqual(Integer insuranceAmount);

    List<IndividualEntity> findAllByOrderByRating();

    List<IndividualEntity> findAllByOrderByPopularity();

    List<IndividualEntity> findAllByUniqueServicesContainsIgnoreCase(String uniqueServices);

    List<IndividualEntity> findAll();
}

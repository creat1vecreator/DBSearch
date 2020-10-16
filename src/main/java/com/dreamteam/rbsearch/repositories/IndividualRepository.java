package com.dreamteam.rbsearch.repositories;

import com.dreamteam.rbsearch.entities.IndividualEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IndividualRepository extends JpaRepository<IndividualEntity, Long> {

    Optional<IndividualEntity> findById(Long id);

    Optional<IndividualEntity> findByName(String name);

    List<IndividualEntity> findAllByTransferTypesIn(List<String> transfer_types);

    List<IndividualEntity> findAllByTransferAutoEquals(Boolean transfer_auto);

    List<IndividualEntity> findAllByTransferCurrencyIn(List<String> transfer_currency);

    List<IndividualEntity> findAllByPaymentMethodIn(List<String> payment_method);

    List<IndividualEntity> findAllByPaymentAimsServicesIn(List<String> payment_aims_services);

    List<IndividualEntity> findAllByPaymentAutoEquals(Boolean payment_auto);

    List<IndividualEntity> findAllByDepositRateGreaterThan(Float deposit_rate);

    List<IndividualEntity> findAllByDepositAimIn(List<String> deposit_aim);

    List<IndividualEntity> findAllByDepositCurrencyIn(List<String> deposit_currency);

    List<IndividualEntity> findAllByDepositAdditionalConditionsIn(List<String> deposit_additional_conditions);

    List<IndividualEntity> findAllByConsultationIn(List<String> consultation);

    List<IndividualEntity> findAllByCardFreeServiceEquals(Boolean card_free_service);

    List<IndividualEntity> findAllByCardTypesIn(List<String> card_types);

    List<IndividualEntity> findAllByCardCategoriesIn(List<String> card_categories);

    List<IndividualEntity> findAllByCardAnnualServicePriceLessThan(Integer card_annual_service_price);

    List<IndividualEntity> findAllByCardCashbackGreaterThan(Float card_cashback);

    List<IndividualEntity> findAllByCardDesignToChooseEquals(Boolean card_design_to_choose);

    List<IndividualEntity> findAllByCardValidityGreaterThan(Integer card_validity);

    List<IndividualEntity> findAllByCreditAimIn(List<String> credit_aim);

    List<IndividualEntity> findAllByCreditInterestRateLessThan(Float credit_interest_rate);

    List<IndividualEntity> findAllByCreditTermGreaterThan(Integer credit_term);

    List<IndividualEntity> findAllByCreditEarlyPaymentEquals(Boolean credit_early_payment);

    List<IndividualEntity> findAllByCreditAmountGreaterThan(Integer credit_amount);

    List<IndividualEntity> findAllByInsuranceAimIn(List<String> insurance_aim);

    List<IndividualEntity> findAllByInsuranceAmountGreaterThan(Integer insurance_amount);

    List<IndividualEntity> findByOrderByRating(); // not-ordered

    List<IndividualEntity> findByOrderByPopularity(); // not-ordered

    List<IndividualEntity> findAllByUniqueServicesIn(List<String> unique_services);
}

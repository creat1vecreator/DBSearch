package com.dreamteam.rbsearch.repositories;

import com.dreamteam.rbsearch.entities.LegalEntityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LegalEntityRepository extends JpaRepository<LegalEntityEntity, Long> {

    Optional<LegalEntityEntity> findById(Long id);

    List<LegalEntityEntity> findAllByPaymentAimsServicesIn(List<String> paymentAimsServices);

    List<LegalEntityEntity> findAllByPaymentMethodIn(List<String> paymentMethod);

    List<LegalEntityEntity> findAllByPaymentAutoEquals(Boolean paymentAuto);

    List<LegalEntityEntity> findAllByServicesFinancialIn(List<String> servicesFinancial);

    List<LegalEntityEntity> findAllByServicesSalesIn(List<String> servicesSales);

    List<LegalEntityEntity> findAllByServicesDocumentManagementIn(List<String> servicesDocumentManagement);

    List<LegalEntityEntity> findAllByServicesAnalyticsIn(List<String> servicesAnalytics);

    List<LegalEntityEntity> findAllByBankAccountOpeningPriceLessThan(Integer bankAccountOpeningPrice);

    List<LegalEntityEntity> findAllByBankAccountAvailabilityOfFreePeriodEquals(Boolean bankAccountAvailabilityOfFreePeriod);

    List<LegalEntityEntity> findAllByBankAccountCurrencyIn(List<String> bankAccountCurrency);

    List<LegalEntityEntity> findAllByBankAccountTypesIn(List<String> bankAccountType);

    List<LegalEntityEntity> findAllByAcquiringTypesIn(List<String> acquiringTypes);

    List<LegalEntityEntity> findAllByMinimumCommissionRateOfTurnoverLessThan(Float minimumCommissionRateOfTurnover);

    List<LegalEntityEntity> findAllByCreditAimIn(List<String> creditAim);

    List<LegalEntityEntity> findAllByCreditInterestRateLessThan(Float creditInterestRate);

    List<LegalEntityEntity> findAllByCreditTermGreaterThan(Integer creditTerm);

    List<LegalEntityEntity> findAllByCreditEarlyRepaymentEquals(Boolean creditEarlyRepayment);

    List<LegalEntityEntity> findAllByDepositRateGreaterThan(Float depositRate);

    List<LegalEntityEntity> findAllByDepositCurrencyIn(List<String> depositCurrency);

    List<LegalEntityEntity> findAllByDepositTypesOfFundsIn(List<String> depositTypesOfFunds);

    List<LegalEntityEntity> findAllByDepositAdditionalConditionsIn(List<String> depositAdditionalConditions);

    List<LegalEntityEntity> findAllByConsultationIn(List<String> consultation);

    List<LegalEntityEntity> findAllByCardTypesIn(List<String> cardTypes);

    List<LegalEntityEntity> findAllByCardCategoriesIn(List<String> cardCategories);

    List<LegalEntityEntity> findAllByCardAnnualServicePriceLessThan(Integer cardAnnualServicePrice);

    List<LegalEntityEntity> findAllByInsuranceAimIn(List<String> insurance_aim);

    List<LegalEntityEntity> findAllByInsuranceAmountGreaterThan(Integer insuranceAmount);

    List<LegalEntityEntity> findAllByCorporationServicesIn(List<String> corporationServices);

    List<LegalEntityEntity> findAllByCorporationFinancingIn(List<String> corporationFinancing);

    Optional<LegalEntityEntity> findByName(String name);
}

package com.dreamteam.rbsearch.repositories;

import com.dreamteam.rbsearch.entities.LegalEntityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LegalEntityRepository extends JpaRepository<LegalEntityEntity, Long> {

    Optional<LegalEntityEntity> findById(Long id);

    Optional<LegalEntityEntity> findByNameIgnoreCase(String name);

    List<LegalEntityEntity> findAllByPaymentAimsServicesContains(String paymentAimsServices);

    List<LegalEntityEntity> findAllByPaymentMethodContains(String paymentMethod);

    List<LegalEntityEntity> findAllByPaymentAutoEquals(Boolean paymentAuto);

    List<LegalEntityEntity> findAllByServicesFinancialContains(String servicesFinancial);

    List<LegalEntityEntity> findAllByServicesSalesContains(String servicesSales);

    List<LegalEntityEntity> findAllByServicesDocumentManagementContains(String servicesDocumentManagement);

    List<LegalEntityEntity> findAllByServicesAnalyticsContains(String servicesAnalytics);

    List<LegalEntityEntity> findAllByBankAccountOpeningPriceLessThan(Integer bankAccountOpeningPrice);

    List<LegalEntityEntity> findAllByBankAccountAvailabilityOfFreePeriodEquals(Boolean bankAccountAvailabilityOfFreePeriod);

    List<LegalEntityEntity> findAllByBankAccountCurrencyContains(String bankAccountCurrency);

    List<LegalEntityEntity> findAllByBankAccountTypesContains(String bankAccountType);

    List<LegalEntityEntity> findAllByAcquiringTypesContains(String acquiringTypes);

    List<LegalEntityEntity> findAllByMinimumCommissionRateOfTurnoverLessThan(Float minimumCommissionRateOfTurnover);

    List<LegalEntityEntity> findAllByCreditAimContains(String creditAim);

    List<LegalEntityEntity> findAllByCreditInterestRateLessThan(Float creditInterestRate);

    List<LegalEntityEntity> findAllByCreditTermGreaterThan(Integer creditTerm);

    List<LegalEntityEntity> findAllByCreditEarlyRepaymentEquals(Boolean creditEarlyRepayment);

    List<LegalEntityEntity> findAllByDepositRateGreaterThan(Float depositRate);

    List<LegalEntityEntity> findAllByDepositCurrencyContains(String depositCurrency);

    List<LegalEntityEntity> findAllByDepositTypesOfFundsContains(String depositTypesOfFunds);

    List<LegalEntityEntity> findAllByDepositAdditionalConditionsContains(String depositAdditionalConditions);

    List<LegalEntityEntity> findAllByConsultationContains(String consultation);

    List<LegalEntityEntity> findAllByCardTypesContains(String cardTypes);

    List<LegalEntityEntity> findAllByCardCategoriesContains(String cardCategories);

    List<LegalEntityEntity> findAllByCardAnnualServicePriceLessThan(Integer cardAnnualServicePrice);

    List<LegalEntityEntity> findAllByInsuranceAimContains(String insurance_aim);

    List<LegalEntityEntity> findAllByInsuranceAmountGreaterThan(Integer insuranceAmount);

    List<LegalEntityEntity> findAllByCorporationServicesContains(String corporationServices);

    List<LegalEntityEntity> findAllByCorporationFinancingContains(String corporationFinancing);

    Optional<LegalEntityEntity> findByName(String name);
}

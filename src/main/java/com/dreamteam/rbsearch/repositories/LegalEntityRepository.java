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

    List<LegalEntityEntity> findAllByPaymentAimsServicesContainsIgnoreCase(String paymentAimsServices);

    List<LegalEntityEntity> findAllByPaymentMethodContainsIgnoreCase(String paymentMethod);

    List<LegalEntityEntity> findAllByPaymentAutoEquals(Boolean paymentAuto);

    List<LegalEntityEntity> findAllByServicesFinancialContainsIgnoreCase(String servicesFinancial);

    List<LegalEntityEntity> findAllByServicesSalesContainsIgnoreCase(String servicesSales);

    List<LegalEntityEntity> findAllByServicesDocumentManagementContainsIgnoreCase(String servicesDocumentManagement);

    List<LegalEntityEntity> findAllByServicesAnalyticsContainsIgnoreCase(String servicesAnalytics);

    List<LegalEntityEntity> findAllByBankAccountOpeningPriceLessThan(Integer bankAccountOpeningPrice);

    List<LegalEntityEntity> findAllByBankAccountAvailabilityOfFreePeriodEquals(Boolean bankAccountAvailabilityOfFreePeriod);

    List<LegalEntityEntity> findAllByBankAccountCurrencyContainsIgnoreCase(String bankAccountCurrency);

    List<LegalEntityEntity> findAllByBankAccountTypesContainsIgnoreCase(String bankAccountType);

    List<LegalEntityEntity> findAllByAcquiringTypesContainsIgnoreCase(String acquiringTypes);

    List<LegalEntityEntity> findAllByMinimumCommissionRateOfTurnoverLessThan(Float minimumCommissionRateOfTurnover);

    List<LegalEntityEntity> findAllByCreditAimContainsIgnoreCase(String creditAim);

    List<LegalEntityEntity> findAllByCreditInterestRateLessThan(Float creditInterestRate);

    List<LegalEntityEntity> findAllByCreditTermGreaterThanEqual(Integer creditTerm);

    List<LegalEntityEntity> findAllByCreditEarlyRepaymentEquals(Boolean creditEarlyRepayment);

    List<LegalEntityEntity> findAllByCreditAmountGreaterThanEqual(Integer creditAmount);

    List<LegalEntityEntity> findAllByDepositRateGreaterThanEqual(Float depositRate);

    List<LegalEntityEntity> findAllByDepositCurrencyContainsIgnoreCase(String depositCurrency);

    List<LegalEntityEntity> findAllByDepositTypesOfFundsContainsIgnoreCase(String depositTypesOfFunds);

    List<LegalEntityEntity> findAllByDepositAdditionalConditionsContainsIgnoreCase(String depositAdditionalConditions);

    List<LegalEntityEntity> findAllByConsultationContainsIgnoreCase(String consultation);

    List<LegalEntityEntity> findAllByCardTypesContainsIgnoreCase(String cardTypes);

    List<LegalEntityEntity> findAllByCardCategoriesContainsIgnoreCase(String cardCategories);

    List<LegalEntityEntity> findAllByCardAnnualServicePriceLessThan(Integer cardAnnualServicePrice);

    List<LegalEntityEntity> findAllByCardTermGreaterThanEqual(Integer cardTerm);

    List<LegalEntityEntity> findAllByInsuranceAimContainsIgnoreCase(String insurance_aim);

    List<LegalEntityEntity> findAllByInsuranceAmountGreaterThanEqual(Integer insuranceAmount);

    List<LegalEntityEntity> findAllByCorporationServicesContainsIgnoreCase(String corporationServices);

    List<LegalEntityEntity> findAllByCorporationFinancingContainsIgnoreCase(String corporationFinancing);

    List<LegalEntityEntity> findAllByOrderByRating();

    List<LegalEntityEntity> findAllByOrderByPopularity();
}

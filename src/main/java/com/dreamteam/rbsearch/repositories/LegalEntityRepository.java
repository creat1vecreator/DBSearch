package com.dreamteam.rbsearch.repositories;

import com.dreamteam.rbsearch.entities.LegalEntityEntity_not;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LegalEntityRepository extends JpaRepository<LegalEntityEntity_not, Long> {

    Optional<LegalEntityEntity_not> findById(Long id);

    Optional<LegalEntityEntity_not> findByNameIgnoreCase(String name);

    List<LegalEntityEntity_not> findAllByPaymentAimsServicesIn(List<String> paymentAimsServices);

    List<LegalEntityEntity_not> findAllByPaymentMethodIn(List<String> paymentMethod);

    List<LegalEntityEntity_not> findAllByPaymentAutoEquals(Boolean paymentAuto);

    List<LegalEntityEntity_not> findAllByServicesFinancialIn(List<String> servicesFinancial);

    List<LegalEntityEntity_not> findAllByServicesSalesIn(List<String> servicesSales);

    List<LegalEntityEntity_not> findAllByServicesDocumentManagementIn(List<String> servicesDocumentManagement);

    List<LegalEntityEntity_not> findAllByServicesAnalyticsIn(List<String> servicesAnalytics);

    List<LegalEntityEntity_not> findAllByBankAccountOpeningPriceLessThan(Integer bankAccountOpeningPrice);

    List<LegalEntityEntity_not> findAllByBankAccountAvailabilityOfFreePeriodEquals(Boolean bankAccountAvailabilityOfFreePeriod);

    List<LegalEntityEntity_not> findAllByBankAccountCurrencyIn(List<String> bankAccountCurrency);

    List<LegalEntityEntity_not> findAllByBankAccountTypesIn(List<String> bankAccountType);

    List<LegalEntityEntity_not> findAllByAcquiringTypesIn(List<String> acquiringTypes);

    List<LegalEntityEntity_not> findAllByMinimumCommissionRateOfTurnoverLessThan(Float minimumCommissionRateOfTurnover);

    List<LegalEntityEntity_not> findAllByCreditAimIn(List<String> creditAim);

    List<LegalEntityEntity_not> findAllByCreditInterestRateLessThan(Float creditInterestRate);

    List<LegalEntityEntity_not> findAllByCreditTermGreaterThan(Integer creditTerm);

    List<LegalEntityEntity_not> findAllByCreditEarlyRepaymentEquals(Boolean creditEarlyRepayment);

    List<LegalEntityEntity_not> findAllByDepositRateGreaterThan(Float depositRate);

    List<LegalEntityEntity_not> findAllByDepositCurrencyIn(List<String> depositCurrency);

    List<LegalEntityEntity_not> findAllByDepositTypesOfFundsIn(List<String> depositTypesOfFunds);

    List<LegalEntityEntity_not> findAllByDepositAdditionalConditionsIn(List<String> depositAdditionalConditions);

    List<LegalEntityEntity_not> findAllByConsultationIn(List<String> consultation);

    List<LegalEntityEntity_not> findAllByCardTypesIn(List<String> cardTypes);

    List<LegalEntityEntity_not> findAllByCardCategoriesIn(List<String> cardCategories);

    List<LegalEntityEntity_not> findAllByCardAnnualServicePriceLessThan(Integer cardAnnualServicePrice);

    List<LegalEntityEntity_not> findAllByInsuranceAimIn(List<String> insurance_aim);

    List<LegalEntityEntity_not> findAllByInsuranceAmountGreaterThan(Integer insuranceAmount);

    List<LegalEntityEntity_not> findAllByCorporationServicesIn(List<String> corporationServices);

    List<LegalEntityEntity_not> findAllByCorporationFinancingIn(List<String> corporationFinancing);

    Optional<LegalEntityEntity_not> findByName(String name);
}

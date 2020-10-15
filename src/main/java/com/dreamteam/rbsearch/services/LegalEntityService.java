package com.dreamteam.rbsearch.services;

import com.dreamteam.rbsearch.BankEntitiesDTO.BankEntitiesDTO;
import com.dreamteam.rbsearch.entities.LegalEntityEntity;
import com.dreamteam.rbsearch.form.LegalEntityForm;
import com.dreamteam.rbsearch.repositories.LegalEntityRepository;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LegalEntityService {
    private final LegalEntityRepository legalEntityRepository;


    // todo
    public BankEntitiesDTO<LegalEntityEntity> find(LegalEntityForm legalEntityForm) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO = findAll();

        if (!legalEntityForm.getPaymentAimsServices().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByPaymentAimsService(
                            legalEntityForm.getPaymentAimsServices()
                    ),
                    true
            );
        }

        return bankEntitiesDTO;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByPaymentAimsService(List<String> paymentService) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByPaymentAimsServicesIn(paymentService));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByPaymentMethod(List<String> paymentMethod) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByPaymentMethodIn(paymentMethod));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByPaymentAuto(Boolean paymentAuto) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByPaymentAutoEquals(paymentAuto));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByServicesFinancial(List<String> servicesFinancial) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByServicesFinancialIn(servicesFinancial));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByServicesSales(List<String> servicesSales) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByServicesSalesIn(servicesSales));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByServiceDocumentManagement(List<String> serviceDocumentManagement) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByServicesDocumentManagementIn(serviceDocumentManagement));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByServicesAnalytics(List<String> servicesAnalytics) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByServicesAnalyticsIn(servicesAnalytics));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByBankAccountOpeningPrice(Integer bankAccountOpeningPrice) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByBankAccountOpeningPriceLessThan(bankAccountOpeningPrice));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByBankAccountAvailabilityOfFreePeriod(Boolean bankAccountAvailabilityOfFreePeriod) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByBankAccountAvailabilityOfFreePeriodEquals(bankAccountAvailabilityOfFreePeriod));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByBankAccountCurrency(List<String> bankAccountCurrency) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByBankAccountCurrencyIn(bankAccountCurrency));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByBankAccountTypes(List<String> bankAccountType) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByBankAccountTypesIn(bankAccountType));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByMinimumCommissionRateOfTurnover(Float minimumCommission) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByMinimumCommissionRateOfTurnoverLessThan(minimumCommission));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCreditAim(List<String> creditAim) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCreditAimIn(creditAim));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCreditInterestRate(Float creditInterestRate) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCreditInterestRateLessThan(creditInterestRate));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCreditTerm(Integer creditTerm) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCreditTermGreaterThan(creditTerm));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCreditEarlyRepayment(Boolean creditEarlyRepayment) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCreditEarlyRepaymentEquals(creditEarlyRepayment));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByDepositRate(Float depositRate) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByDepositRateGreaterThan(depositRate));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByDepositCurrency(List<String> depositCurrency) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByDepositCurrencyIn(depositCurrency));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByDepositTypesOfFunds(List<String> depositTypesOfFunds) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByDepositTypesOfFundsIn(depositTypesOfFunds));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByDepositAdditionalConditions(List<String> depositAdditionalConditions) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByDepositAdditionalConditionsIn(depositAdditionalConditions));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByConsultation(List<String> consultation) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByConsultationIn(consultation));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCardTypes(List<String> cardTypes) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCardTypesIn(cardTypes));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCardCategories(List<String> cardCategories) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCardCategoriesIn(cardCategories));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCardAnnualServicePrice(Integer cardAnnualServicePrice) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCardAnnualServicePriceLessThan(cardAnnualServicePrice));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByInsuranceAim(List<String> insuranceAim) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByInsuranceAimIn(insuranceAim));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByInsuranceAmount(Integer insuranceAmount) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByInsuranceAmountGreaterThan(insuranceAmount));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCorporationServices(List<String> corporationServices) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCorporationServicesIn(corporationServices));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCorporationFinancing(List<String> corporationFinancing) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCorporationFinancingIn(corporationFinancing));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByAcquiringTypes(List<String> acquiringTypes) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByAcquiringTypesIn(acquiringTypes));
    }

    public LegalEntityEntity findByName(String name) {
        return legalEntityRepository.findByName(name).orElseThrow(RuntimeException::new);
    }
    public BankEntitiesDTO<LegalEntityEntity> findAll() {
        return new BankEntitiesDTO<>(legalEntityRepository.findAll());
    }
}

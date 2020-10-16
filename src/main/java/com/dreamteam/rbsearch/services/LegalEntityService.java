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

        if (!legalEntityForm.getPaymentMethod().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByPaymentMethod(
                            legalEntityForm.getPaymentMethod()
                    ),
                    true
            );
        }

        if (legalEntityForm.getPaymentAuto() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByPaymentAuto(
                            legalEntityForm.getPaymentAuto()
                    ),
                    true
            );
        }

        if (!legalEntityForm.getServicesFinancial().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByServicesFinancial(
                            legalEntityForm.getServicesFinancial()
                    ),
                    true
            );
        }

        if (!legalEntityForm.getServicesSales().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByServicesSales(
                            legalEntityForm.getServicesSales()
                    ),
                    true
            );
        }

        if (!legalEntityForm.getServicesDocumentManagement().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByServiceDocumentManagement(
                            legalEntityForm.getServicesDocumentManagement()
                    ),
                    true
            );
        }

        if (!legalEntityForm.getServicesAnalytics().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByServicesAnalytics(
                            legalEntityForm.getServicesAnalytics()
                    ),
                    true
            );
        }

        if (legalEntityForm.getBankAccountOpeningPrice() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByBankAccountOpeningPrice(
                            legalEntityForm.getBankAccountOpeningPrice()
                    ),
                    true
            );
        }

        if (legalEntityForm.getBankAccountAvailabilityOfFreePeriod() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByBankAccountAvailabilityOfFreePeriod(
                            legalEntityForm.getBankAccountAvailabilityOfFreePeriod()
                    ),
                    true
            );
        }

        if (!legalEntityForm.getBankAccountCurrency().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByBankAccountCurrency(
                            legalEntityForm.getBankAccountCurrency()
                    ),
                    true
            );
        }

        if (!legalEntityForm.getBankAccountTypes().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByBankAccountTypes(
                        legalEntityForm.getBankAccountTypes()
                    ),
                    true
            );
        }

        if (legalEntityForm.getMinimumCommissionRateOfTurnover() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByMinimumCommissionRateOfTurnover(
                            legalEntityForm.getMinimumCommissionRateOfTurnover()
                    ),
                    true
            );
        }

        if (!legalEntityForm.getCreditAim().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditAim(
                            legalEntityForm.getCreditAim()
                    ),
                    true
            );
        }

        if (legalEntityForm.getCreditInterestRate() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditInterestRate(
                            legalEntityForm.getCreditInterestRate()
                    ),
                    true
            );
        }

        if (legalEntityForm.getCreditTerm() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditTerm(
                            legalEntityForm.getCreditTerm()
                    ),
                    true
            );
        }

        if (legalEntityForm.getCreditEarlyRepayment() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditEarlyRepayment(
                            legalEntityForm.getCreditEarlyRepayment()
                    ),
                    true
            );
        }

        if (legalEntityForm.getDepositRate() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByDepositRate(
                            legalEntityForm.getDepositRate()
                    ),
                    true
            );
        }

        if (!legalEntityForm.getDepositCurrency().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByDepositCurrency(
                            legalEntityForm.getDepositCurrency()
                    ),
                    true
            );
        }

        if (!legalEntityForm.getDepositTypesOfFunds().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByDepositTypesOfFunds(
                            legalEntityForm.getDepositTypesOfFunds()
                    ),
                    true
            );
        }

        if (!legalEntityForm.getDepositAdditionalConditions().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByDepositAdditionalConditions(
                            legalEntityForm.getDepositAdditionalConditions()
                    ),
                    true
            );
        }

        if (!legalEntityForm.getConsultation().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByConsultation(
                            legalEntityForm.getConsultation()
                    ),
                    true
            );
        }

        if (!legalEntityForm.getCardTypes().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardTypes(
                            legalEntityForm.getCardTypes()
                    ),
                    true
            );
        }

        if (!legalEntityForm.getCardCategories().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardCategories(
                            legalEntityForm.getCardCategories()
                    ),
                    true
            );
        }

        if (legalEntityForm.getCardAnnualServicePrice() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardAnnualServicePrice(
                            legalEntityForm.getCardAnnualServicePrice()
                    ),
                    true
            );
        }

        if (!legalEntityForm.getInsuranceAim().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByInsuranceAim(
                            legalEntityForm.getInsuranceAim()
                    ),
                    true
            );
        }

        if (legalEntityForm.getInsuranceAmount() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByInsuranceAmount(
                            legalEntityForm.getInsuranceAmount()
                    ),
                    true
            );
        }

        if (!legalEntityForm.getCorporationServices().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByCorporationServices(
                            legalEntityForm.getCorporationServices()
                    ),
                    true
            );
        }

        if (!legalEntityForm.getCorporationFinancing().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByCorporationFinancing(
                            legalEntityForm.getCorporationFinancing()
                    ),
                    true
            );
        }

        if (!legalEntityForm.getAcquiringTypes().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByAcquiringTypes(
                            legalEntityForm.getAcquiringTypes()
                    ),
                    true
            );
        }

        return bankEntitiesDTO;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByPaymentAimsService(List<StringSentSevice) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByPaymentAimsServicesContains(paymentService));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByPaymentMethod(String paymentMethod) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByPaymentMethodContains(paymentMethod));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByPaymentAuto(Boolean paymentAuto) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByPaymentAutoEquals(paymentAuto));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByServicesFinancial(String servicesFinancial) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByServicesFinancialContains(servicesFinancial));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByServicesSales(String servicesSales) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByServicesSalesContains(servicesSales));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByServiceDocumentManagement(String serviceDocumentManagement) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByServicesDocumentManagementContains(serviceDocumentManagement));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByServicesAnalytics(String servicesAnalytics) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByServicesAnalyticsContains(servicesAnalytics));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByBankAccountOpeningPrice(Integer bankAccountOpeningPrice) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByBankAccountOpeningPriceLessThan(bankAccountOpeningPrice));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByBankAccountAvailabilityOfFreePeriod(Boolean bankAccountAvailabilityOfFreePeriod) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByBankAccountAvailabilityOfFreePeriodEquals(bankAccountAvailabilityOfFreePeriod));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByBankAccountCurrency(String bankAccountCurrency) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByBankAccountCurrencyContains(bankAccountCurrency));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByBankAccountTypes(String bankAccountType) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByBankAccountTypesContains(bankAccountType));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByMinimumCommissionRateOfTurnover(Float minimumCommission) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByMinimumCommissionRateOfTurnoverLessThan(minimumCommission));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCreditAim(String creditAim) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCreditAimContains(creditAim));
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

    private BankEntitiesDTO<LegalEntityEntity> findByDepositCurrency(String depositCurrency) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByDepositCurrencyContains(depositCurrency));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByDepositTypesOfFunds(String depositTypesOfFunds) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByDepositTypesOfFundsContains(depositTypesOfFunds));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByDepositAdditionalConditions(String depositAdditionalConditions) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByDepositAdditionalConditionsContains(depositAdditionalConditions));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByConsultation(String consultation) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByConsultationContains(consultation));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCardTypes(String cardTypes) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCardTypesContains(cardTypes));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCardCategories(String cardCategories) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCardCategoriesContains(cardCategories));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCardAnnualServicePrice(Integer cardAnnualServicePrice) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCardAnnualServicePriceLessThan(cardAnnualServicePrice));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByInsuranceAim(String insuranceAim) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByInsuranceAimContains(insuranceAim));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByInsuranceAmount(Integer insuranceAmount) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByInsuranceAmountGreaterThan(insuranceAmount));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCorporationServices(String corporationServices) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCorporationServicesContains(corporationServices));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCorporationFinancing(String corporationFinancing) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCorporationFinancingContains(corporationFinancing));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByAcquiringTypes(String acquiringTypes) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByAcquiringTypesContains(acquiringTypes));
    }

    public LegalEntityEntity findByName(String name) {
        return legalEntityRepository.findByNameIgnoreCase(name).orElseThrow(RuntimeException::new);
    }
    public BankEntitiesDTO<LegalEntityEntity> findAll() {
        return new BankEntitiesDTO<>(legalEntityRepository.findAll());
    }
}

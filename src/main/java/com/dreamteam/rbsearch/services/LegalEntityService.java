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
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO = new BankEntitiesDTO<>();

        for (LegalEntityEntity bank : bankEntitiesDTO.getBankEntities()) {
            System.out.println(bank.getName());
        }
        System.out.println(bankEntitiesDTO.getBankEntities().size());

        if (!legalEntityForm.getSorting().isBlank()) {
            if (legalEntityForm.getSorting().contains("Rating")) {
                bankEntitiesDTO.addBankEntityList(
                        sortByRating(),
                        false
                );
            }
            if (legalEntityForm.getSorting().contains("Popularity")) {
                bankEntitiesDTO.addBankEntityList(
                        sortByPopularity(),
                        false
                );
            }
        }

        for (LegalEntityEntity bank : bankEntitiesDTO.getBankEntities()) {
            System.out.println(bank.getName());
        }
        System.out.println(bankEntitiesDTO.getBankEntities().size());

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

        if (legalEntityForm.getBankAccountOpeningPrice() != null) {
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

        if (legalEntityForm.getMinimumCommissionRateOfTurnover() != null) {
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

        if (legalEntityForm.getCreditInterestRate() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditInterestRate(
                            legalEntityForm.getCreditInterestRate()
                    ),
                    true
            );
        }

        if (legalEntityForm.getCreditTerm() != null) {
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

        if (legalEntityForm.getCreditAmount() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditAmount(
                            legalEntityForm.getCreditAmount()
                    ),
                    true
            );

        }
        if (legalEntityForm.getDepositRate() != null) {
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

        if (legalEntityForm.getCardAnnualServicePrice() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardAnnualServicePrice(
                            legalEntityForm.getCardAnnualServicePrice()
                    ),
                    true
            );
        }

        if (legalEntityForm.getCardTerm() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardTerm(
                            legalEntityForm.getCardTerm()
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

        if (legalEntityForm.getInsuranceAmount() != null) {
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

    private BankEntitiesDTO<LegalEntityEntity> findByPaymentAimsService(List<String> paymentService) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : paymentService) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByPaymentAimsServicesContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByPaymentMethod(List<String> paymentMethod) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : paymentMethod) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByPaymentMethodContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByPaymentAuto(Boolean paymentAuto) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByPaymentAutoEquals(paymentAuto));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByServicesFinancial(List<String> servicesFinancial) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : servicesFinancial) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByServicesFinancialContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByServicesSales(List<String> servicesSales) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : servicesSales) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByServicesSalesContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByServiceDocumentManagement(List<String> serviceDocumentManagement) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : serviceDocumentManagement) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByServicesDocumentManagementContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByServicesAnalytics(List<String> servicesAnalytics) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : servicesAnalytics) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByServicesAnalyticsContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByBankAccountOpeningPrice(Integer bankAccountOpeningPrice) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByBankAccountOpeningPriceLessThan(bankAccountOpeningPrice));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByBankAccountAvailabilityOfFreePeriod(Boolean bankAccountAvailabilityOfFreePeriod) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByBankAccountAvailabilityOfFreePeriodEquals(bankAccountAvailabilityOfFreePeriod));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByBankAccountCurrency(List<String> bankAccountCurrency) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : bankAccountCurrency) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByBankAccountCurrencyContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByBankAccountTypes(List<String> bankAccountType) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : bankAccountType) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByBankAccountTypesContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByMinimumCommissionRateOfTurnover(Float minimumCommission) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByMinimumCommissionRateOfTurnoverLessThan(minimumCommission));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCreditAim(List<String> creditAim) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : creditAim) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByCreditAimContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCreditInterestRate(Float creditInterestRate) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCreditInterestRateLessThan(creditInterestRate));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCreditTerm(Integer creditTerm) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCreditTermGreaterThanEqual(creditTerm));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCreditEarlyRepayment(Boolean creditEarlyRepayment) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCreditEarlyRepaymentEquals(creditEarlyRepayment));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCreditAmount(Integer creditAmount) {
        return  new BankEntitiesDTO<>(legalEntityRepository.findAllByCreditAmountGreaterThanEqual(creditAmount));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByDepositRate(Float depositRate) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByDepositRateGreaterThanEqual(depositRate));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByDepositCurrency(List<String> depositCurrency) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : depositCurrency) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByDepositCurrencyContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByDepositTypesOfFunds(List<String> depositTypesOfFunds) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : depositTypesOfFunds) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByDepositTypesOfFundsContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByDepositAdditionalConditions(List<String> depositAdditionalConditions) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : depositAdditionalConditions) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByDepositAdditionalConditionsContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByConsultation(List<String> consultation) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : consultation) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByConsultationContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCardTypes(List<String> cardTypes) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : cardTypes) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByCardTypesContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCardCategories(List<String> cardCategories) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : cardCategories) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByCardCategoriesContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCardAnnualServicePrice(Integer cardAnnualServicePrice) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCardAnnualServicePriceLessThan(cardAnnualServicePrice));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCardTerm(Integer cardTerm) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByCardTermGreaterThanEqual(cardTerm));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByInsuranceAim(List<String> insuranceAim) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : insuranceAim) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByInsuranceAimContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByInsuranceAmount(Integer insuranceAmount) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByInsuranceAmountGreaterThanEqual(insuranceAmount));
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCorporationServices(List<String> corporationServices) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : corporationServices) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByCorporationServicesContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByCorporationFinancing(List<String> corporationFinancing) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : corporationFinancing) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByCorporationFinancingContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> findByAcquiringTypes(List<String> acquiringTypes) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : acquiringTypes) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(legalEntityRepository.findAllByAcquiringTypesContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<LegalEntityEntity> sortByRating() {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByOrderByRating());
    }

    private BankEntitiesDTO<LegalEntityEntity> sortByPopularity() {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByOrderByPopularity());
    }

    public LegalEntityEntity findByName(String name) {
        return legalEntityRepository.findByNameIgnoreCase(name).orElseThrow(RuntimeException::new);
    }
    public BankEntitiesDTO<LegalEntityEntity> findAll() {
        return new BankEntitiesDTO<>(legalEntityRepository.findAll());
    }
}

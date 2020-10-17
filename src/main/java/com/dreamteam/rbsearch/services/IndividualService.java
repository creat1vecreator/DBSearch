package com.dreamteam.rbsearch.services;

import com.dreamteam.rbsearch.BankEntitiesDTO.BankEntitiesDTO;
import com.dreamteam.rbsearch.entities.IndividualEntity;
import com.dreamteam.rbsearch.form.IndividualForm;
import com.dreamteam.rbsearch.repositories.IndividualRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IndividualService {
    private final IndividualRepository individualRepository;

    public BankEntitiesDTO<IndividualEntity> find(IndividualForm individualForm) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO = new BankEntitiesDTO<>();

        if (!individualForm.getSorting().isBlank()) {
            if (individualForm.getSorting().contains("Rating")) {
                bankEntitiesDTO.addBankEntityList(
                        sortByRating(),
                        false
                );
            }
            if (individualForm.getSorting().contains("Popularity")) {
                bankEntitiesDTO.addBankEntityList(
                        sortByPopularity(),
                        false
                );
            }
        }

        if (individualForm.getCardAnnualServicePrice() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardAnnualServicePrice(
                            individualForm.getCardAnnualServicePrice()
                    ),
                    true
            );
        }

        if (individualForm.getDepositRate() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByDepositRate(
                            individualForm.getDepositRate()
                    ),
                    true
            );
        }

        if (individualForm.getCardCashback() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardCashback(
                            individualForm.getCardCashback()
                    ),
                    true
            );
        }

        if (individualForm.getCardValidity() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardValidity(
                            individualForm.getCardValidity()
                    ),
                    true
            );
        }

        if (individualForm.getCreditInterestRate() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditInterestRate(
                            individualForm.getCreditInterestRate()
                    ),
                    true
            );
        }

        if (individualForm.getCreditTerm() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditTerm(
                            individualForm.getCreditTerm()
                    ),
                    true
            );
        }

        if (individualForm.getCreditAmount() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditAmount(
                            individualForm.getCreditAmount()
                    ),
                    true
            );
        }

        if (individualForm.getInsuranceAmount() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByInsuranceAmount(
                            individualForm.getInsuranceAmount()
                    ),
                    true
            );
        }

//        for (IndividualEntity bank : bankEntitiesDTO.getBankEntities()) {
//            System.out.println(bank.getName());
//        }
//        System.out.println(bankEntitiesDTO.getBankEntities().size());

        if (!individualForm.getTransferTypes().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByTransferType(
                            individualForm.getTransferTypes()
                    ),
                    true
            );
        }

//        for (IndividualEntity bank : bankEntitiesDTO.getBankEntities()) {
//            System.out.println(bank.getName());
//        }
//        System.out.println(bankEntitiesDTO.getBankEntities().size());

        if (individualForm.getTransferAuto() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByTransferAuto(
                            individualForm.getTransferAuto()
                    ),
                    true
            );
        }

        if (!individualForm.getTransferCurrency().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByTransferCurrency(
                            individualForm.getTransferCurrency()
                    ),
                    true
            );
        }

        if (!individualForm.getPaymentMethod().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByPaymentMethod(
                            individualForm.getPaymentMethod()
                    ),
                    true
            );
        }

        if (!individualForm.getPaymentAimsServices().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByPaymentAims(
                            individualForm.getPaymentAimsServices()
                    ),
                    true
            );
        }

        if (individualForm.getPaymentAuto() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByPaymentAuto(
                            individualForm.getPaymentAuto()
                    ),
                    true
            );
        }

        if (!individualForm.getDepositAim().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByDepositAim(
                            individualForm.getDepositAim()
                    ),
                    true
            );
        }

        if (!individualForm.getDepositCurrency().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByDepositCurrency(
                            individualForm.getDepositCurrency()
                    ),
                    true
            );
        }

        if (!individualForm.getDepositAdditionalConditions().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByDepositAddition(
                            individualForm.getDepositAdditionalConditions()
                    ),
                    true
            );
        }

        if (!individualForm.getConsultation().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByConsultation(
                            individualForm.getConsultation()
                    ),
                    true
            );
        }

        if (individualForm.getCardFreeService() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardFreeService(
                            individualForm.getCardFreeService()
                    ),
                    true
            );
        }

        if (!individualForm.getCardTypes().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardTypes(
                            individualForm.getCardTypes()
                    ),
                    true
            );
        }

        if (!individualForm.getCardCategories().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardCategories(
                            individualForm.getCardCategories()
                    ),
                    true
            );
        }

        if (individualForm.getCardDesignToChoose() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardDesign(
                            individualForm.getCardDesignToChoose()
                    ),
                    true
            );
        }

        if (!individualForm.getCreditAim().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditAim(
                            individualForm.getCreditAim()
                    ),
                    true
            );
        }

        if (individualForm.getCreditEarlyPayment() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditEarlyPayment(


                            individualForm.getCreditEarlyPayment()
                    ),
                    true
            );
        }

        if (!individualForm.getInsuranceAim().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByInsuranceAim(
                            individualForm.getInsuranceAim()
                    ),
                    true
            );
        }

        if (!individualForm.getUniqueServices().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByUniqueServices(
                            individualForm.getUniqueServices()
                    ),
                    true
            );
        }

        return bankEntitiesDTO;
    }

    private BankEntitiesDTO<IndividualEntity> findByTransferType(List<String> transferType) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : transferType) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByTransferTypesContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<IndividualEntity> findByTransferAuto(Boolean transferAuto) {
        return new BankEntitiesDTO<>(individualRepository.findAllByTransferAutoEquals(transferAuto));
    }

    private BankEntitiesDTO<IndividualEntity> findByTransferCurrency(List<String> transferCurrency) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : transferCurrency) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByTransferCurrencyContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<IndividualEntity> findByPaymentMethod(List<String> paymentMethod) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : paymentMethod) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByPaymentMethodContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;     }

    private BankEntitiesDTO<IndividualEntity> findByPaymentAims(List<String> paymentAims) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : paymentAims) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByPaymentAimsServicesContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;     }

    private BankEntitiesDTO<IndividualEntity> findByPaymentAuto(Boolean paymentAuto) {
        return new BankEntitiesDTO<>(individualRepository.findAllByPaymentAutoEquals(paymentAuto));
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositRate(Float depositRate) {
        return new BankEntitiesDTO<>(individualRepository.findAllByDepositRateGreaterThanEqual(depositRate));
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositAim(List<String> depositAim) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : depositAim) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByDepositAimContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositCurrency(List<String> depositCurrency) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : depositCurrency) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByDepositCurrencyContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositAddition(List<String> depositAdditions) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : depositAdditions) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByDepositAdditionalConditionsContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<IndividualEntity> findByConsultation(List<String> consultation) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : consultation) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByConsultationContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;     }

    private BankEntitiesDTO<IndividualEntity> findByCardFreeService(Boolean cardFreeService) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCardFreeServiceEquals(cardFreeService));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardTypes(List<String> cardTypes) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : cardTypes) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByCardTypesContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;     }

    private BankEntitiesDTO<IndividualEntity> findByCardCategories(List<String> cardCategories) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : cardCategories) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByCardCategoriesContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;     }

    private BankEntitiesDTO<IndividualEntity> findByCardAnnualServicePrice(Integer cardAnnualServicePrice) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCardAnnualServicePriceLessThan(cardAnnualServicePrice));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardCashback(Float cardCashback) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCardCashbackGreaterThanEqual(cardCashback));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardDesign(Boolean cardDesignToChoose) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCardDesignToChooseEquals(cardDesignToChoose));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardValidity(Integer cardValidity) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCardValidityGreaterThanEqual(cardValidity));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditAim(List<String> creditAim) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : creditAim) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByCreditAimContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;     }

    private BankEntitiesDTO<IndividualEntity> findByCreditInterestRate(Float creditInterestRate) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCreditInterestRateLessThan(creditInterestRate));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditTerm(Integer creditTerm) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCreditTermGreaterThanEqual(creditTerm));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditEarlyPayment(Boolean creditEarlyPayment) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCreditEarlyPaymentEquals(creditEarlyPayment));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditAmount(Integer creditAmount) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCreditAmountGreaterThanEqual(creditAmount));
    }

    private BankEntitiesDTO<IndividualEntity> findByInsuranceAim(List<String> insuranceAim) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : insuranceAim) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByInsuranceAimContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;     }

    private BankEntitiesDTO<IndividualEntity> findByInsuranceAmount(Integer insuranceAmount) {
        return new BankEntitiesDTO<>(individualRepository.findAllByInsuranceAmountGreaterThanEqual(insuranceAmount));
    }

    private BankEntitiesDTO<IndividualEntity> findByUniqueServices(List<String> uniqueServices) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        int i = 0;
        for (String criterion : uniqueServices) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByUniqueServicesContainsIgnoreCase(criterion)),
                    i++ != 0
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<IndividualEntity> sortByRating() {
        return new BankEntitiesDTO<>(individualRepository.findAllByOrderByRating());
    }

    private BankEntitiesDTO<IndividualEntity> sortByPopularity() {
        return new BankEntitiesDTO<>(individualRepository.findAllByOrderByPopularity());
    }

    public IndividualEntity findByName(String name) {
        return individualRepository.findByNameIgnoreCase(name).orElseThrow(RuntimeException::new);
    }

    public BankEntitiesDTO<IndividualEntity> findAll() {
        return new BankEntitiesDTO<>(individualRepository.findAll());
    }
}

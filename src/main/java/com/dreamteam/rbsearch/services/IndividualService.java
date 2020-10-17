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
            if (individualForm.getSorting().contains("rating")) {
                bankEntitiesDTO.addBankEntityList(
                        sortByRating(),
                        false
                );
            }
            if (individualForm.getSorting().contains("popularity")) {
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
                            individualForm.getCreditAmount()
                    ),
                    true
            );
        }


        if (!individualForm.getTransferTypes().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByTransferType(
                            individualForm.getTransferTypes()
                    ),
                    true
            );
        }

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

        if (individualForm.getDepositAim().isEmpty()) {
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

        System.out.println(bankEntitiesDTO.getBankEntities().size());

        return bankEntitiesDTO;
    }

    private BankEntitiesDTO<IndividualEntity> findByTransferType(List<String> transferType) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        for (String criterion : transferType) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByTransferTypesContainsIgnoreCase(criterion)),
                    true
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<IndividualEntity> findByTransferAuto(Boolean transferAuto) {
        return new BankEntitiesDTO<>(individualRepository.findAllByTransferAutoEquals(transferAuto));
    }

    private BankEntitiesDTO<IndividualEntity> findByTransferCurrency(List<String> transferCurrency) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        for (String criterion : transferCurrency) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByTransferCurrencyContainsIgnoreCase(criterion)),
                    true
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<IndividualEntity> findByPaymentMethod(List<String> paymentMethod) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        for (String criterion : paymentMethod) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByPaymentMethodContainsIgnoreCase(criterion)),
                    true
            );
        }
        return bankEntitiesDTO_temp;     }

    private BankEntitiesDTO<IndividualEntity> findByPaymentAims(List<String> paymentAims) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        for (String criterion : paymentAims) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByPaymentAimsServicesContainsIgnoreCase(criterion)),
                    true
            );
        }
        return bankEntitiesDTO_temp;     }

    private BankEntitiesDTO<IndividualEntity> findByPaymentAuto(Boolean paymentAuto) {
        return new BankEntitiesDTO<>(individualRepository.findAllByPaymentAutoEquals(paymentAuto));
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositRate(Float depositRate) {
        return new BankEntitiesDTO<>(individualRepository.findAllByDepositRateGreaterThan(depositRate));
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositAim(List<String> depositAim) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        for (String criterion : depositAim) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByDepositAimContainsIgnoreCase(criterion)),
                    true
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositCurrency(List<String> depositCurrency) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        for (String criterion : depositCurrency) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByDepositCurrencyContainsIgnoreCase(criterion)),
                    true
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositAddition(List<String> depositAdditions) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        for (String criterion : depositAdditions) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByDepositAdditionalConditionsContainsIgnoreCase(criterion)),
                    true
            );
        }
        return bankEntitiesDTO_temp;
    }

    private BankEntitiesDTO<IndividualEntity> findByConsultation(List<String> consultation) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        for (String criterion : consultation) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByConsultationContainsIgnoreCase(criterion)),
                    true
            );
        }
        return bankEntitiesDTO_temp;     }

    private BankEntitiesDTO<IndividualEntity> findByCardFreeService(Boolean cardFreeService) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCardFreeServiceEquals(cardFreeService));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardTypes(List<String> cardTypes) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        for (String criterion : cardTypes) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByCardTypesContainsIgnoreCase(criterion)),
                    true
            );
        }
        return bankEntitiesDTO_temp;     }

    private BankEntitiesDTO<IndividualEntity> findByCardCategories(List<String> cardCategories) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        for (String criterion : cardCategories) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByCardCategoriesContainsIgnoreCase(criterion)),
                    true
            );
        }
        return bankEntitiesDTO_temp;     }

    private BankEntitiesDTO<IndividualEntity> findByCardAnnualServicePrice(Integer cardAnnualServicePrice) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCardAnnualServicePriceLessThan(cardAnnualServicePrice));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardCashback(Float cardCashback) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCardCashbackGreaterThan(cardCashback));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardDesign(Boolean cardDesignToChoose) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCardDesignToChooseEquals(cardDesignToChoose));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardValidity(Integer cardValidity) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCardValidityGreaterThan(cardValidity));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditAim(List<String> creditAim) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        for (String criterion : creditAim) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByCreditAimContainsIgnoreCase(criterion)),
                    true
            );
        }
        return bankEntitiesDTO_temp;     }

    private BankEntitiesDTO<IndividualEntity> findByCreditInterestRate(Float creditInterestRate) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCreditInterestRateLessThan(creditInterestRate));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditTerm(Integer creditTerm) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCreditTermGreaterThan(creditTerm));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditEarlyPayment(Boolean creditEarlyPayment) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCreditEarlyPaymentEquals(creditEarlyPayment));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditAmount(Integer creditAmount) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCreditAmountGreaterThan(creditAmount));
    }

    private BankEntitiesDTO<IndividualEntity> findByInsuranceAim(List<String> insuranceAim) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        for (String criterion : insuranceAim) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByInsuranceAimContainsIgnoreCase(criterion)),
                    true
            );
        }
        return bankEntitiesDTO_temp;     }

    private BankEntitiesDTO<IndividualEntity> findByInsuranceAmount(Integer insuranceAmount) {
        return new BankEntitiesDTO<>(individualRepository.findAllByInsuranceAmountGreaterThan(insuranceAmount));
    }

    private BankEntitiesDTO<IndividualEntity> findByUniqueServices(List<String> uniqueServices) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO_temp = new BankEntitiesDTO<>();
        for (String criterion : uniqueServices) {
            bankEntitiesDTO_temp.addBankEntityList(
                    new BankEntitiesDTO<>(individualRepository.findAllByUniqueServicesContainsIgnoreCase(criterion)),
                    true
            );
        }
        return bankEntitiesDTO_temp;     }

    private BankEntitiesDTO<IndividualEntity> sortByRating() {
        return new BankEntitiesDTO<>(individualRepository.findByOrderByRating());
    }

    private BankEntitiesDTO<IndividualEntity> sortByPopularity() {
        return new BankEntitiesDTO<>(individualRepository.findByOrderByPopularity());

    }
    public IndividualEntity findByName(String name) {
        return individualRepository.findByNameIgnoreCase(name).orElseThrow(RuntimeException::new);
    }
    public BankEntitiesDTO<IndividualEntity> findAll() {
        return new BankEntitiesDTO<>(individualRepository.findAll());
    }
}

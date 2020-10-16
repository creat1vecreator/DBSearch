package com.dreamteam.rbsearch.services;

import com.dreamteam.rbsearch.BankEntitiesDTO.BankEntitiesDTO;
import com.dreamteam.rbsearch.entities.IndividualEntity;
import com.dreamteam.rbsearch.form.IndividualForm_simple;
import com.dreamteam.rbsearch.repositories.IndividualRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IndividualService_simple {
    private final IndividualRepository individualRepository_;

    public BankEntitiesDTO<IndividualEntity> find(IndividualForm_simple individualForm_simple) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO = new BankEntitiesDTO<>();

        if (!individualForm_simple.getSorting().isBlank()) {
            if (individualForm_simple.getSorting().contains("rating")) {
                bankEntitiesDTO.addBankEntityList(
                        sortByRating(),
                        false
                );
            }
            if (individualForm_simple.getSorting().contains("popularity")) {
                bankEntitiesDTO.addBankEntityList(
                        sortByPopularity(),
                        false
                );
            }
        }

        if (individualForm_simple.getCardAnnualServicePrice() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardAnnualServicePrice(
                            individualForm_simple.getCardAnnualServicePrice()
                    ),
                    true
            );
        }

        if (individualForm_simple.getDepositRate() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByDepositRate(
                            individualForm_simple.getDepositRate()
                    ),
                    true
            );
        }

        if (individualForm_simple.getCardCashback() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardCashback(
                            individualForm_simple.getCardCashback()
                    ),
                    true
            );
        }

        if (individualForm_simple.getCardValidity() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardValidity(
                            individualForm_simple.getCardValidity()
                    ),
                    true
            );
        }

        if (individualForm_simple.getCreditInterestRate() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditInterestRate(
                            individualForm_simple.getCreditInterestRate()
                    ),
                    true
            );
        }

        if (individualForm_simple.getCreditTerm() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditTerm(
                            individualForm_simple.getCreditTerm()
                    ),
                    true
            );
        }

        if (individualForm_simple.getCreditAmount() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditAmount(
                            individualForm_simple.getCreditAmount()
                    ),
                    true
            );
        }

        if (individualForm_simple.getInsuranceAmount() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByInsuranceAmount(
                            individualForm_simple.getCreditAmount()
                    ),
                    true
            );
        }


        if (!individualForm_simple.getTransferTypes().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByTransferType(
                            individualForm_simple.getTransferTypes()
                    ),
                    true
            );
        }

        if (individualForm_simple.getTransferAuto() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByTransferAuto(
                            individualForm_simple.getTransferAuto()
                    ),
                    true
            );
        }

        if (!individualForm_simple.getTransferCurrency().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByTransferCurrency(
                            individualForm_simple.getTransferCurrency()
                    ),
                    true
            );
        }

        if (!individualForm_simple.getPaymentMethod().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByPaymentMethod(
                            individualForm_simple.getPaymentMethod()
                    ),
                    true
            );
        }

        if (!individualForm_simple.getPaymentAimsServices().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByPaymentAims(
                            individualForm_simple.getPaymentAimsServices()
                    ),
                    true
            );
        }

        if (individualForm_simple.getPaymentAuto() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByPaymentAuto(
                            individualForm_simple.getPaymentAuto()
                    ),
                    true
            );
        }

        if (individualForm_simple.getDepositAim().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByDepositAim(
                            individualForm_simple.getDepositAim()
                    ),
                    true
            );
        }

        if (!individualForm_simple.getDepositCurrency().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByDepositCurrency(
                            individualForm_simple.getDepositCurrency()
                    ),
                    true
            );
        }

        if (!individualForm_simple.getDepositAdditionalConditions().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByDepositAddition(
                            individualForm_simple.getDepositAdditionalConditions()
                    ),
                    true
            );
        }

        if (!individualForm_simple.getConsultation().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByConsultation(
                            individualForm_simple.getConsultation()
                    ),
                    true
            );
        }

        if (individualForm_simple.getCardFreeService() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardFreeService(
                            individualForm_simple.getCardFreeService()
                    ),
                    true
            );
        }

        if (!individualForm_simple.getCardTypes().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardTypes(
                            individualForm_simple.getCardTypes()
                    ),
                    true
            );
        }

        if (!individualForm_simple.getCardCategories().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardCategories(
                            individualForm_simple.getCardCategories()
                    ),
                    true
            );
        }

        if (individualForm_simple.getCardDesignToChoose() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardDesign(
                            individualForm_simple.getCardDesignToChoose()
                    ),
                    true
            );
        }

        if (!individualForm_simple.getCreditAim().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditAim(
                            individualForm_simple.getCreditAim()
                    ),
                    true
            );
        }

        if (individualForm_simple.getCreditEarlyPayment() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditEarlyPayment(
                            individualForm_simple.getCreditEarlyPayment()
                    ),
                    true
            );
        }

        if (!individualForm_simple.getInsuranceAim().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByInsuranceAim(
                            individualForm_simple.getInsuranceAim()
                    ),
                    true
            );
        }

        if (!individualForm_simple.getUniqueServices().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByUniqueServices(
                            individualForm_simple.getUniqueServices()
                    ),
                    true
            );
        }

        return bankEntitiesDTO;
    }

    private BankEntitiesDTO<IndividualEntity> findByTransferType(String transfer_type) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByTransferTypesContains(transfer_type));
    }

    private BankEntitiesDTO<IndividualEntity> findByTransferAuto(Boolean transfer_auto) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByTransferAutoEquals(transfer_auto));
    }

    private BankEntitiesDTO<IndividualEntity> findByTransferCurrency(String transfer_currency) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByTransferCurrencyContains(transfer_currency));
    }

    private BankEntitiesDTO<IndividualEntity> findByPaymentMethod(String payment_method) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByPaymentMethodContains(payment_method));
    }

    private BankEntitiesDTO<IndividualEntity> findByPaymentAims(String payment_aims) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByPaymentAimsServicesContains(payment_aims));
    }

    private BankEntitiesDTO<IndividualEntity> findByPaymentAuto(Boolean payment_auto) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByPaymentAutoEquals(payment_auto));
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositRate(Float deposit_rate) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByDepositRateGreaterThan(deposit_rate));
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositAim(String deposit_aim) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByDepositAimContains(deposit_aim));
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositCurrency(String deposit_currency) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByDepositCurrencyContains(deposit_currency));
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositAddition(String deposit_additions) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByDepositAdditionalConditionsContains(deposit_additions));
    }

    private BankEntitiesDTO<IndividualEntity> findByConsultation(String consultation) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByConsultationContains(consultation));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardFreeService(Boolean card_free_service) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByCardFreeServiceEquals(card_free_service));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardTypes(String card_types) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByCardTypesContains(card_types));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardCategories(String card_categories) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByCardCategoriesContains(card_categories));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardAnnualServicePrice(Integer card_annual_service_price) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByCardAnnualServicePriceLessThan(card_annual_service_price));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardCashback(Float card_cashback) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByCardCashbackGreaterThan(card_cashback));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardDesign(Boolean card_design_to_choose) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByCardDesignToChooseEquals(card_design_to_choose));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardValidity(Integer card_validity) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByCardValidityGreaterThan(card_validity));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditAim(String credit_aim) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByCreditAimContains(credit_aim));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditInterestRate(Float credit_interest_rate) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByCreditInterestRateLessThan(credit_interest_rate));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditTerm(Integer credit_term) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByCreditTermGreaterThan(credit_term));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditEarlyPayment(Boolean credit_early_payment) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByCreditEarlyPaymentEquals(credit_early_payment));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditAmount(Integer credit_amount) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByCreditAmountGreaterThan(credit_amount));
    }

    private BankEntitiesDTO<IndividualEntity> findByInsuranceAim(String insurance_aim) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByInsuranceAimContains(insurance_aim));
    }

    private BankEntitiesDTO<IndividualEntity> findByInsuranceAmount(Integer insurance_amount) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByInsuranceAmountGreaterThan(insurance_amount));
    }

    private BankEntitiesDTO<IndividualEntity> findByUniqueServices(String unique_services) {
        return new BankEntitiesDTO<>(individualRepository_.findAllByUniqueServicesContains(unique_services));
    }

    private BankEntitiesDTO<IndividualEntity> sortByRating() {
        return new BankEntitiesDTO<>(individualRepository_.findByOrderByRating());
    }

    private BankEntitiesDTO<IndividualEntity> sortByPopularity() {
        return new BankEntitiesDTO<>(individualRepository_.findByOrderByPopularity());

    }
    public IndividualEntity findByName(String name) {
        return individualRepository_.findByNameIgnoreCase(name).orElseThrow(RuntimeException::new);
    }
    public BankEntitiesDTO<IndividualEntity> findAll() {
        return new BankEntitiesDTO<>(individualRepository_.findAll());
    }
}

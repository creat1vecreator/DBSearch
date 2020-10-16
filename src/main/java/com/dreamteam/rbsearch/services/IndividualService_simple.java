package com.dreamteam.rbsearch.services;

import com.dreamteam.rbsearch.BankEntitiesDTO.BankEntitiesDTO;
import com.dreamteam.rbsearch.entities.IndividualEntity;
import com.dreamteam.rbsearch.entities.IndividualEntity_simple;
import com.dreamteam.rbsearch.form.IndividualForm;
import com.dreamteam.rbsearch.form.IndividualForm_simple;
import com.dreamteam.rbsearch.repositories.IndividualRepository;
import com.dreamteam.rbsearch.repositories.IndividualRepository_simple;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IndividualService_simple {
    private final IndividualRepository_simple individualRepository_simple;

    public BankEntitiesDTO<IndividualEntity_simple> find(IndividualForm_simple individualForm_simple) {
        BankEntitiesDTO<IndividualEntity_simple> bankEntitiesDTO = new BankEntitiesDTO<>();

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

    private BankEntitiesDTO<IndividualEntity_simple> findByTransferType(String transfer_type) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByTransferTypesContains(transfer_type));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByTransferAuto(Boolean transfer_auto) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByTransferAutoEquals(transfer_auto));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByTransferCurrency(String transfer_currency) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByTransferCurrencyContains(transfer_currency));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByPaymentMethod(String payment_method) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByPaymentMethodContains(payment_method));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByPaymentAims(String payment_aims) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByPaymentAimsServicesContains(payment_aims));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByPaymentAuto(Boolean payment_auto) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByPaymentAutoEquals(payment_auto));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByDepositRate(Float deposit_rate) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByDepositRateGreaterThan(deposit_rate));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByDepositAim(String deposit_aim) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByDepositAimContains(deposit_aim));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByDepositCurrency(String deposit_currency) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByDepositCurrencyContains(deposit_currency));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByDepositAddition(String deposit_additions) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByDepositAdditionalConditionsContains(deposit_additions));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByConsultation(String consultation) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByConsultationContains(consultation));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByCardFreeService(Boolean card_free_service) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByCardFreeServiceEquals(card_free_service));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByCardTypes(String card_types) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByCardTypesContains(card_types));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByCardCategories(String card_categories) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByCardCategoriesContains(card_categories));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByCardAnnualServicePrice(Integer card_annual_service_price) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByCardAnnualServicePriceLessThan(card_annual_service_price));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByCardCashback(Float card_cashback) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByCardCashbackGreaterThan(card_cashback));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByCardDesign(Boolean card_design_to_choose) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByCardDesignToChooseEquals(card_design_to_choose));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByCardValidity(Integer card_validity) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByCardValidityGreaterThan(card_validity));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByCreditAim(String credit_aim) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByCreditAimContains(credit_aim));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByCreditInterestRate(Float credit_interest_rate) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByCreditInterestRateLessThan(credit_interest_rate));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByCreditTerm(Integer credit_term) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByCreditTermGreaterThan(credit_term));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByCreditEarlyPayment(Boolean credit_early_payment) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByCreditEarlyPaymentEquals(credit_early_payment));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByCreditAmount(Integer credit_amount) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByCreditAmountGreaterThan(credit_amount));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByInsuranceAim(String insurance_aim) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByInsuranceAimContains(insurance_aim));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByInsuranceAmount(Integer insurance_amount) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByInsuranceAmountGreaterThan(insurance_amount));
    }

    private BankEntitiesDTO<IndividualEntity_simple> findByUniqueServices(String unique_services) {
        return new BankEntitiesDTO<>(individualRepository_simple.findAllByUniqueServicesContains(unique_services));
    }

    private BankEntitiesDTO<IndividualEntity_simple> sortByRating() {
        return new BankEntitiesDTO<>(individualRepository_simple.findByOrderByRating());
    }

    private BankEntitiesDTO<IndividualEntity_simple> sortByPopularity() {
        return new BankEntitiesDTO<>(individualRepository_simple.findByOrderByPopularity());

    }
    public IndividualEntity_simple findByName(String name) {
        return individualRepository_simple.findByNameIgnoreCase(name).orElseThrow(RuntimeException::new);
    }
    public BankEntitiesDTO<IndividualEntity_simple> findAll() {
        return new BankEntitiesDTO<>(individualRepository_simple.findAll());
    }
}

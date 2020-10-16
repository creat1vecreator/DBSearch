package com.dreamteam.rbsearch.services;

import com.dreamteam.rbsearch.BankEntitiesDTO.BankEntitiesDTO;
import com.dreamteam.rbsearch.form.IndividualForm;
import com.dreamteam.rbsearch.repositories.IndividualRepository_not;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Deprecated
@Service
@RequiredArgsConstructor
public class IndividualService_not {
    private final IndividualRepository_not individualRepositoryNot;

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

        if (individualForm.getCardAnnualServicePrice() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardAnnualServicePrice(
                            individualForm.getCardAnnualServicePrice()
                    ),
                    true
            );
        }

        if (individualForm.getDepositRate() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByDepositRate(
                            individualForm.getDepositRate()
                    ),
                    true
            );
        }

        if (individualForm.getCardCashback() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardCashback(
                            individualForm.getCardCashback()
                    ),
                    true
            );
        }

        if (individualForm.getCardValidity() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardValidity(
                            individualForm.getCardValidity()
                    ),
                    true
            );
        }

        if (individualForm.getCreditInterestRate() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditInterestRate(
                            individualForm.getCreditInterestRate()
                    ),
                    true
            );
        }

        if (individualForm.getCreditTerm() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditTerm(
                            individualForm.getCreditTerm()
                    ),
                    true
            );
        }

        if (individualForm.getCreditAmount() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditAmount(
                            individualForm.getCreditAmount()
                    ),
                    true
            );
        }

        if (individualForm.getInsuranceAmount() >= 0) {
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

        return bankEntitiesDTO;
    }

    private BankEntitiesDTO<IndividualEntity> findByTransferType(List<String> transfer_type) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByTransferTypesIn(transfer_type));
    }

    private BankEntitiesDTO<IndividualEntity> findByTransferAuto(Boolean transfer_auto) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByTransferAutoEquals(transfer_auto));
    }

    private BankEntitiesDTO<IndividualEntity> findByTransferCurrency(List<String> transfer_currency) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByTransferCurrencyIn(transfer_currency));
    }

    private BankEntitiesDTO<IndividualEntity> findByPaymentMethod(List<String> payment_method) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByPaymentMethodIn(payment_method));
    }

    private BankEntitiesDTO<IndividualEntity> findByPaymentAims(List<String> payment_aims) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByPaymentAimsServicesIn(payment_aims));
    }

    private BankEntitiesDTO<IndividualEntity> findByPaymentAuto(Boolean payment_auto) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByPaymentAutoEquals(payment_auto));
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositRate(Float deposit_rate) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByDepositRateGreaterThan(deposit_rate));
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositAim(List<String> deposit_aim) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByDepositAimIn(deposit_aim));
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositCurrency(List<String> deposit_currency) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByDepositCurrencyIn(deposit_currency));
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositAddition(List<String> deposit_additions) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByDepositAdditionalConditionsIn(deposit_additions));
    }

    private BankEntitiesDTO<IndividualEntity> findByConsultation(List<String> consultation) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByConsultationIn(consultation));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardFreeService(Boolean card_free_service) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByCardFreeServiceEquals(card_free_service));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardTypes(List<String> card_types) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByCardTypesIn(card_types));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardCategories(List<String> card_categories) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByCardCategoriesIn(card_categories));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardAnnualServicePrice(Integer card_annual_service_price) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByCardAnnualServicePriceLessThan(card_annual_service_price));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardCashback(Float card_cashback) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByCardCashbackGreaterThan(card_cashback));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardDesign(Boolean card_design_to_choose) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByCardDesignToChooseEquals(card_design_to_choose));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardValidity(Integer card_validity) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByCardValidityGreaterThan(card_validity));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditAim(List<String> credit_aim) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByCreditAimIn(credit_aim));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditInterestRate(Float credit_interest_rate) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByCreditInterestRateLessThan(credit_interest_rate));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditTerm(Integer credit_term) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByCreditTermGreaterThan(credit_term));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditEarlyPayment(Boolean credit_early_payment) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByCreditEarlyPaymentEquals(credit_early_payment));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditAmount(Integer credit_amount) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByCreditAmountGreaterThan(credit_amount));
    }

    private BankEntitiesDTO<IndividualEntity> findByInsuranceAim(List<String> insurance_aim) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByInsuranceAimIn(insurance_aim));
    }

    private BankEntitiesDTO<IndividualEntity> findByInsuranceAmount(Integer insurance_amount) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByInsuranceAmountGreaterThan(insurance_amount));
    }

    private BankEntitiesDTO<IndividualEntity> findByUniqueServices(List<String> unique_services) {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAllByUniqueServicesIn(unique_services));
    }

    private BankEntitiesDTO<IndividualEntity> sortByRating() {
        return new BankEntitiesDTO<>(individualRepositoryNot.findByOrderByRating());
    }

    private BankEntitiesDTO<IndividualEntity> sortByPopularity() {
        return new BankEntitiesDTO<>(individualRepositoryNot.findByOrderByPopularity());

    }
    public IndividualEntity findByName(String name) {
        return individualRepositoryNot.findByNameIgnoreCase(name).orElseThrow(RuntimeException::new);
    }
    public BankEntitiesDTO<IndividualEntity> findAll() {
        return new BankEntitiesDTO<>(individualRepositoryNot.findAll());
    }
}
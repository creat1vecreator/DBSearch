package com.dreamteam.rbsearch.services;

import com.dreamteam.rbsearch.BankEntitiesDTO.BankEntitiesDTO;
import com.dreamteam.rbsearch.entities.IndividualEntity;
import com.dreamteam.rbsearch.form.IndividualForm;
import com.dreamteam.rbsearch.repositories.IndividualRepository;
import lombok.*;
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

        if (individualForm.getCard_annual_service_price() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardAnnualServicePrice(
                            individualForm.getCard_annual_service_price()
                    ),
                    true
            );
        }

        if (individualForm.getDeposit_rate() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByDepositRate(
                            individualForm.getDeposit_rate()
                    ),
                    true
            );
        }

        if (individualForm.getCard_cashback() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardCashback(
                            individualForm.getCard_cashback()
                    ),
                    true
            );
        }

        if (individualForm.getCard_validity() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardValidity(
                            individualForm.getCard_validity()
                    ),
                    true
            );
        }

        if (individualForm.getCredit_interest_rate() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditInterestRate(
                            individualForm.getCredit_interest_rate()
                    ),
                    true
            );
        }

        if (individualForm.getCredit_term() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditTerm(
                            individualForm.getCredit_term()
                    ),
                    true
            );
        }

        if (individualForm.getCredit_amount() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditAmount(
                            individualForm.getCredit_amount()
                    ),
                    true
            );
        }

        if (individualForm.getInsurance_amount() >= 0) {
            bankEntitiesDTO.addBankEntityList(
                    findByInsuranceAmount(
                            individualForm.getCredit_amount()
                    ),
                    true
            );
        }


        if (!individualForm.getTransfer_types().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByTransferType(
                            individualForm.getTransfer_types()
                    ),
                    true
            );
        }

        if (individualForm.getTransfer_auto() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByTransferAuto(
                            individualForm.getTransfer_auto()
                    ),
                    true
            );
        }

        if (!individualForm.getTransfer_currency().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByTransferCurrency(
                            individualForm.getTransfer_currency()
                    ),
                    true
            );
        }

        if (!individualForm.getPayment_method().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByPaymentMethod(
                            individualForm.getPayment_method()
                    ),
                    true
            );
        }

        if (!individualForm.getPayment_aims_services().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByPaymentAims(
                            individualForm.getPayment_aims_services()
                    ),
                    true
            );
        }

        if (individualForm.getPayment_auto() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByPaymentAuto(
                            individualForm.getPayment_auto()
                    ),
                    true
            );
        }

        if (individualForm.getDeposit_aim().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByDepositAim(
                            individualForm.getDeposit_aim()
                    ),
                    true
            );
        }

        if (!individualForm.getDeposit_currency().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByDepositCurrency(
                            individualForm.getDeposit_currency()
                    ),
                    true
            );
        }

        if (!individualForm.getDeposit_additional_conditions().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByDepositAddition(
                            individualForm.getDeposit_additional_conditions()
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

        if (individualForm.getCard_free_service() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardFreeService(
                            individualForm.getCard_free_service()
                    ),
                    true
            );
        }

        if (!individualForm.getCard_types().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardTypes(
                            individualForm.getCard_types()
                    ),
                    true
            );
        }

        if (!individualForm.getCard_categories().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardCategories(
                            individualForm.getCard_categories()
                    ),
                    true
            );
        }

        if (individualForm.getCard_design_to_choose() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCardDesign(
                            individualForm.getCard_design_to_choose()
                    ),
                    true
            );
        }

        if (!individualForm.getCredit_aim().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditAim(
                            individualForm.getCredit_aim()
                    ),
                    true
            );
        }

        if (individualForm.getCredit_early_payment() != null) {
            bankEntitiesDTO.addBankEntityList(
                    findByCreditEarlyPayment(
                            individualForm.getCredit_early_payment()
                    ),
                    true
            );
        }

        if (!individualForm.getInsurance_aim().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByInsuranceAim(
                            individualForm.getInsurance_aim()
                    ),
                    true
            );
        }

        if (!individualForm.getUnique_services().isEmpty()) {
            bankEntitiesDTO.addBankEntityList(
                    findByUniqueServices(
                            individualForm.getUnique_services()
                    ),
                    true
            );
        }

        return bankEntitiesDTO;
    }

    private BankEntitiesDTO<IndividualEntity> findByTransferType(List<String> transfer_type) {
        return new BankEntitiesDTO<>(individualRepository.findAllByTransferTypesIn(transfer_type));
    }

    private BankEntitiesDTO<IndividualEntity> findByTransferAuto(Boolean transfer_auto) {
        return new BankEntitiesDTO<>(individualRepository.findAllByTransferAutoEquals(transfer_auto));
    }

    private BankEntitiesDTO<IndividualEntity> findByTransferCurrency(List<String> transfer_currency) {
        return new BankEntitiesDTO<>(individualRepository.findAllByTransferCurrencyIn(transfer_currency));
    }

    private BankEntitiesDTO<IndividualEntity> findByPaymentMethod(List<String> payment_method) {
        return new BankEntitiesDTO<>(individualRepository.findAllByPaymentMethodIn(payment_method));
    }

    private BankEntitiesDTO<IndividualEntity> findByPaymentAims(List<String> payment_aims) {
        return new BankEntitiesDTO<>(individualRepository.findAllByPaymentAimsServicesIn(payment_aims));
    }

    private BankEntitiesDTO<IndividualEntity> findByPaymentAuto(Boolean payment_auto) {
        return new BankEntitiesDTO<>(individualRepository.findAllByPaymentAutoEquals(payment_auto));
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositRate(Float deposit_rate) {
        return new BankEntitiesDTO<>(individualRepository.findAllByDepositRateLessThan(deposit_rate));
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositAim(List<String> deposit_aim) {
        return new BankEntitiesDTO<>(individualRepository.findAllByDepositAimIn(deposit_aim));
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositCurrency(List<String> deposit_currency) {
        return new BankEntitiesDTO<>(individualRepository.findAllByDepositCurrencyIn(deposit_currency));
    }

    private BankEntitiesDTO<IndividualEntity> findByDepositAddition(List<String> deposit_additions) {
        return new BankEntitiesDTO<>(individualRepository.findAllByDepositAdditionalConditionsIn(deposit_additions));
    }

    private BankEntitiesDTO<IndividualEntity> findByConsultation(List<String> consultation) {
        return new BankEntitiesDTO<>(individualRepository.findAllByConsultationIn(consultation));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardFreeService(Boolean card_free_service) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCardFreeServiceEquals(card_free_service));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardTypes(List<String> card_types) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCardTypesIn(card_types));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardCategories(List<String> card_categories) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCardCategoriesIn(card_categories));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardAnnualServicePrice(Integer card_annual_service_price) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCardAnnualServicePriceLessThan(card_annual_service_price));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardCashback(Float card_cashback) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCardCashbackLessThan(card_cashback));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardDesign(Boolean card_design_to_choose) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCardDesignToChooseEquals(card_design_to_choose));
    }

    private BankEntitiesDTO<IndividualEntity> findByCardValidity(Integer card_validity) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCardValidityLessThan(card_validity));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditAim(List<String> credit_aim) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCreditAimIn(credit_aim));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditInterestRate(Float credit_interest_rate) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCreditInterestRateLessThan(credit_interest_rate));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditTerm(Integer credit_term) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCreditTermLessThan(credit_term));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditEarlyPayment(Boolean credit_early_payment) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCreditEarlyPaymentEquals(credit_early_payment));
    }

    private BankEntitiesDTO<IndividualEntity> findByCreditAmount(Integer credit_amount) {
        return new BankEntitiesDTO<>(individualRepository.findAllByCreditAmountLessThan(credit_amount));
    }

    private BankEntitiesDTO<IndividualEntity> findByInsuranceAim(List<String> insurance_aim) {
        return new BankEntitiesDTO<>(individualRepository.findAllByInsuranceAimIn(insurance_aim));
    }

    private BankEntitiesDTO<IndividualEntity> findByInsuranceAmount(Integer insurance_amount) {
        return new BankEntitiesDTO<>(individualRepository.findAllByInsuranceAmountLessThan(insurance_amount));
    }

    private BankEntitiesDTO<IndividualEntity> findByUniqueServices(List<String> unique_services) {
        return new BankEntitiesDTO<>(individualRepository.findAllByUniqueServicesIn(unique_services));
    }

    private BankEntitiesDTO<IndividualEntity> sortByRating() {
        return new BankEntitiesDTO<>(individualRepository.findByOrderByRating());
    }

    private BankEntitiesDTO<IndividualEntity> sortByPopularity() {
        return new BankEntitiesDTO<>(individualRepository.findByOrderByPopularity());

    }
    public IndividualEntity findByName(String name) {
        return individualRepository.findByName(name).orElseThrow(RuntimeException::new);
    }
    public BankEntitiesDTO<IndividualEntity> findAll() {
        return new BankEntitiesDTO<>(individualRepository.findAll());
    }
}

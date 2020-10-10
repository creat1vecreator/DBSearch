package com.dreamteam.rbsearch.services;

import com.dreamteam.rbsearch.BankEntitiesDTO.BankEntitiesDTO;
import com.dreamteam.rbsearch.entities.IndividualEntity;
import com.dreamteam.rbsearch.form.IndividualForm;
import com.dreamteam.rbsearch.repositories.IndividualRepository;
import lombok.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IndividualService {
    private final IndividualRepository individualRepository;

    public BankEntitiesDTO<IndividualEntity> find(IndividualForm individualForm) {
        BankEntitiesDTO<IndividualEntity> bankEntitiesDTO = new BankEntitiesDTO<>();

        if (individualForm.getPrice() > 0) {
            bankEntitiesDTO.addBankEntityList(
                    findAllByPriceLessThan(
                            individualForm.getPrice()
                    ),
                    false
            );
        }
        if (!(individualForm.getApp().isBlank())) {
            bankEntitiesDTO.addBankEntityList(
                    findByApp(
                            individualForm.getApp()
                    ),
                    true
            );
        }

        return bankEntitiesDTO;
    }

    private BankEntitiesDTO<IndividualEntity> findByApp(String app) {
        return new BankEntitiesDTO<>(individualRepository.findAllByAppContaining(app));
    }

    private BankEntitiesDTO<IndividualEntity> findAllByPriceLessThan(Integer price) {
        return new BankEntitiesDTO<>(individualRepository.findAllByPriceLessThan(price));
    }

    public IndividualEntity findByName(String name) {
        return individualRepository.findByName(name).orElseThrow(RuntimeException::new);
    }
    public BankEntitiesDTO<IndividualEntity> findAll() {
        return new BankEntitiesDTO<>(individualRepository.findAll());
    }
}

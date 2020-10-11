package com.dreamteam.rbsearch.services;

import com.dreamteam.rbsearch.BankEntitiesDTO.BankEntitiesDTO;
import com.dreamteam.rbsearch.entities.LegalEntityEntity;
import com.dreamteam.rbsearch.form.LegalEntityForm;
import com.dreamteam.rbsearch.repositories.LegalEntityRepository;
import lombok.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LegalEntityService {
    private final LegalEntityRepository legalEntityRepository;

    public BankEntitiesDTO<LegalEntityEntity> find(LegalEntityForm legalEntityForm) {
        BankEntitiesDTO<LegalEntityEntity> bankEntitiesDTO = new BankEntitiesDTO<>();

        if (legalEntityForm.getPrice() > 0) {
            bankEntitiesDTO.addBankEntityList(
                    findAllByPriceLessThan(
                            legalEntityForm.getPrice()
                    ),
                    false
            );
        }

        return bankEntitiesDTO;
    }

    private BankEntitiesDTO<LegalEntityEntity> findAllByPriceLessThan(Integer price) {
        return new BankEntitiesDTO<>(legalEntityRepository.findAllByPriceLessThan(price));
    }

    public LegalEntityEntity findByName(String name) {
        return legalEntityRepository.findByName(name).orElseThrow(RuntimeException::new);
    }
    public BankEntitiesDTO<LegalEntityEntity> findAll() {
        return new BankEntitiesDTO<>(legalEntityRepository.findAll());
    }
}

package com.dreamteam.rbsearch.services;

import com.dreamteam.rbsearch.BankEntitiesDTO.BankEntitiesDTO;
import com.dreamteam.rbsearch.entities.CorporationEntity;
import com.dreamteam.rbsearch.form.CorporationForm;
import com.dreamteam.rbsearch.repositories.CorporationRepository;
import lombok.*;
import org.springframework.stereotype.Service;

@Deprecated
@Service
@RequiredArgsConstructor
public class CorporationService {
    private final CorporationRepository corporationRepository;

    public BankEntitiesDTO<CorporationEntity> find(CorporationForm corporationForm) {
        BankEntitiesDTO<CorporationEntity> bankEntitiesDTO = new BankEntitiesDTO<>();

        if (corporationForm.getPrice() > 0) {
            bankEntitiesDTO.addBankEntityList(
                    findAllByPriceLessThan(
                            corporationForm.getPrice()
                    ),
                    false
            );
        }

        return bankEntitiesDTO;
    }

    private BankEntitiesDTO<CorporationEntity> findAllByPriceLessThan(Integer price) {
        return new BankEntitiesDTO<>(corporationRepository.findAllByPriceLessThan(price));
    }

    public CorporationEntity findByName(String name) {
        return corporationRepository.findByName(name).orElseThrow(RuntimeException::new);
    }
    public BankEntitiesDTO<CorporationEntity> findAll() {
        return new BankEntitiesDTO<>(corporationRepository.findAll());
    }
}

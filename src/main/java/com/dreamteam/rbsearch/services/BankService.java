package com.dreamteam.rbsearch.services;

import com.dreamteam.rbsearch.BankEntitiesDTO.BankEntitiesDTO;
import com.dreamteam.rbsearch.form.BankForm;
import com.dreamteam.rbsearch.repositories.BankEntityRepo;
import lombok.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BankService {
    private final BankEntityRepo bankEntityRepo;

    public BankEntitiesDTO find(BankForm bankForm) {
        BankEntitiesDTO bankEntitiesDTO = new BankEntitiesDTO();

        if (bankForm.getPrice() > 0) {
            bankEntitiesDTO.addBankEntityList(
                    findAllByPriceLessThan(
                            bankForm.getPrice()
                    ),
                    false
            );
        }
        if (!(bankForm.getApp().isBlank())) {
            bankEntitiesDTO.addBankEntityList(
                    findByApp(
                            bankForm.getApp()
                    ),
                    true
            );
        }

        return bankEntitiesDTO;
    }

    private BankEntitiesDTO findByApp(String app) {
        return new BankEntitiesDTO(bankEntityRepo.findAllByAppContaining(app));
    }

    private BankEntitiesDTO findAllByPriceLessThan(Integer price) {
        return new BankEntitiesDTO(bankEntityRepo.findAllByPriceLessThan(price));
    }

    public BankEntitiesDTO findAll() {
        return new BankEntitiesDTO(bankEntityRepo.findAll());
    }
}

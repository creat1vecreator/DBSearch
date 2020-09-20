package com.dreamteam.rbsearch.services;

import com.dreamteam.rbsearch.BankEntitiesDTO.BankEntitiesDTO;
import com.dreamteam.rbsearch.form.BankForm;
import com.dreamteam.rbsearch.repositories.EntityRepo;
import lombok.*;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class BankService {
    private Integer price;
    private String app;
    private EntityRepo entityRepo;

    private BankEntitiesDTO bankEntitiesDTO;

    public BankEntitiesDTO findById(Long id) {
        bankEntitiesDTO = new BankEntitiesDTO();
        bankEntitiesDTO.addBankEntity(entityRepo.findById(id).orElseThrow(RuntimeException::new));
        return bankEntitiesDTO;
    }

    public BankEntitiesDTO findByPriceAndApp(BankForm bankForm) {
        price = Integer.parseInt(bankForm.getPrice());
        app = bankForm.getApp();
        bankEntitiesDTO  = new BankEntitiesDTO(entityRepo.findByPriceAndApp(
                price,
                app
        ));
        return bankEntitiesDTO;
    }

    public BankEntitiesDTO findByApp(BankForm bankForm) {
        app = bankForm.getApp();
        bankEntitiesDTO = new BankEntitiesDTO(entityRepo.findByApp(
                app
        ));
        return bankEntitiesDTO;
    }

    public BankEntitiesDTO findAll() {
        bankEntitiesDTO = new BankEntitiesDTO(entityRepo.findAll());
        return bankEntitiesDTO;
    }
}

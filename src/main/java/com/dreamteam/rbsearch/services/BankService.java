package com.dreamteam.rbsearch.services;

import com.dreamteam.rbsearch.BankEntitiesDTO.BankEntitiesDTO;
import com.dreamteam.rbsearch.entities.BankEntity;
import com.dreamteam.rbsearch.form.BankForm;
import com.dreamteam.rbsearch.repositories.BankEntityRepo;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BankService {
    private Integer price;
    private String app;

    BankEntityRepo bankEntityRepo;
    BankEntitiesDTO bankEntitiesDTO;

    public BankEntitiesDTO findById(Long id) {
        bankEntitiesDTO = new BankEntitiesDTO();
        bankEntitiesDTO.addBankEntity(bankEntityRepo.findById(id).orElseThrow(RuntimeException::new));
        return bankEntitiesDTO;
    }

    public BankEntitiesDTO findByPriceAndApp(BankForm bankForm) {
        price = Integer.parseInt(bankForm.getPrice());
        app = bankForm.getApp();
        bankEntitiesDTO  = new BankEntitiesDTO(bankEntityRepo.findByPriceAndApp(
                price,
                app
        ));
        return bankEntitiesDTO;
    }

    public BankEntitiesDTO findByApp(BankForm bankForm) {
        app = bankForm.getApp();
        bankEntitiesDTO = new BankEntitiesDTO(bankEntityRepo.findByApp(
                app
        ));
        return bankEntitiesDTO;
    }

    public List<BankEntity> findAll() {
        List<BankEntity> bankEntities = bankEntityRepo.findAll();
        bankEntities.forEach(System.out::println);
        bankEntitiesDTO = new BankEntitiesDTO(
//                bankEntityRepo.findAll()
        );
        return bankEntitiesDTO.getBankEntities();
    }
}

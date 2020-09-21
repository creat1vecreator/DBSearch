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
    private static final String DEFAULT_APP = "Android, iOS";

    private final BankEntityRepo bankEntityRepo;

//    public BankEntitiesDTO findById(Long id) {
//        bankEntitiesDTO = new BankEntitiesDTO();
//        bankEntitiesDTO.addBankEntity(bankEntityRepo.findById(id).orElseThrow(RuntimeException::new));
//        return bankEntitiesDTO;
//    }
//
//    public BankEntitiesDTO findByPriceAndApp(BankForm bankForm) {
//        price = Integer.parseInt(bankForm.getPrice());
//        app = bankForm.getApp();
//        bankEntitiesDTO  = new BankEntitiesDTO(bankEntityRepo.findByPriceAndApp(
//                price,
//                app
//        ));
//        return bankEntitiesDTO;
//    }

    public BankEntitiesDTO find(BankForm bankForm) {
        BankEntitiesDTO bankEntitiesDTO = new BankEntitiesDTO();

        if (bankForm.getPrice() > 0) {
            bankEntitiesDTO.addBankEntityList(
                    findAllByPriceLessThan(
                            bankForm.getPrice()
                    )
            );
        }
        if (!(bankForm.getApp().equals("") || (bankForm.getApp().equals(DEFAULT_APP)))) {
            bankEntitiesDTO.addBankEntityList(
                    findByApp(
                            bankForm.getApp()
                    )
            );
        }

        bankEntitiesDTO.trim();
        return bankEntitiesDTO;
    }

    private BankEntitiesDTO findByApp(String app) {
        return new BankEntitiesDTO(bankEntityRepo.findByApp(app));
    }

    private BankEntitiesDTO findAllByPriceLessThan(Integer price) {
        return new BankEntitiesDTO(bankEntityRepo.findAllByPriceLessThan(price));
    }

    public BankEntitiesDTO findAll() {
        BankEntitiesDTO bankEntitiesDTO = new BankEntitiesDTO(
                bankEntityRepo.findAll()
        );
        bankEntitiesDTO.getBankEntities().forEach(System.out::println);
        return bankEntitiesDTO;
    }
}

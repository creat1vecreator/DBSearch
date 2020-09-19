package com.dreamteam.rbsearch.services;

import com.dreamteam.rbsearch.BankEntityDTO.BankEntityDTO;
import com.dreamteam.rbsearch.repositories.EntityRepo;
import com.dreamteam.rbsearch.entities.BankEntity;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
@NoArgsConstructor
public class BankService {

    private Integer price;

    private String app;

    private EntityRepo entityRepo;

    public BankEntity findById(Long id) {
        return entityRepo.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<BankEntity> findByPriceAndApp(BankEntityDTO bankEntityDTO) {
        price = bankEntityDTO.getPrice();
        app = bankEntityDTO.getApp();
        return entityRepo.findByPriceAndApp(price, app);

    }

}

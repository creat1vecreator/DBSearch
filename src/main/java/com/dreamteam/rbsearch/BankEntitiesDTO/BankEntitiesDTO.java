package com.dreamteam.rbsearch.BankEntitiesDTO;

import com.dreamteam.rbsearch.entities.BankEntity;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankEntitiesDTO {
    private List<BankEntity> bankEntities;

    public void addBankEntity(BankEntity bankEntity) {
        bankEntities.add(bankEntity);
    }
}

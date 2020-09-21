package com.dreamteam.rbsearch.BankEntitiesDTO;

import com.dreamteam.rbsearch.entities.BankEntity;
import lombok.*;

import java.util.*;

@Data
@AllArgsConstructor
public class BankEntitiesDTO {
    private List<BankEntity> bankEntities;

    public BankEntitiesDTO() {
        this.bankEntities = new ArrayList<>();
    }

    public void addBankEntity(BankEntity bankEntity) {
        bankEntities.add(bankEntity);
    }

    public void addBankEntityList(BankEntitiesDTO bankEntitiesDTO) {
        this.bankEntities.addAll(bankEntitiesDTO.getBankEntities());
    }

    public void trim() {
        this.bankEntities = new ArrayList<>(new HashSet<>(this.bankEntities));
    }
}

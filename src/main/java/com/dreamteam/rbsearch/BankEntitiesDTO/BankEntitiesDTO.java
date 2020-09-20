package com.dreamteam.rbsearch.BankEntitiesDTO;

import com.dreamteam.rbsearch.entities.BankEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BankEntitiesDTO {
    private List<BankEntity> bankEntities;

    public void addBankEntity(BankEntity bankEntity) {
        bankEntities.add(bankEntity);
    }
}

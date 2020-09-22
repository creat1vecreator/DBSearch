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

    public void addBankEntityList(BankEntitiesDTO bankEntitiesDTO, boolean deleteRepeating) {
        if (deleteRepeating) {
            addBankEntityListDeleteRepeating(bankEntitiesDTO);
        } else {
            addBankEntityListDonNotDeleteRepeating(bankEntitiesDTO);
        }
    }

    private void addBankEntityListDeleteRepeating(BankEntitiesDTO bankEntitiesDTO) {
        this.bankEntities.removeIf(bankEntity -> !bankEntitiesDTO.getBankEntities().contains(bankEntity));
    }

    private void addBankEntityListDonNotDeleteRepeating(BankEntitiesDTO bankEntitiesDTO) {
        this.bankEntities.addAll(bankEntitiesDTO.getBankEntities());
    }
}

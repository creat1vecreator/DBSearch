package com.dreamteam.rbsearch.BankEntitiesDTO;

import com.dreamteam.rbsearch.entities.BaseEntity;
import lombok.*;

import java.util.*;

@Data
@AllArgsConstructor
public class BankEntitiesDTO<T extends BaseEntity> {
    private List<T> bankEntities;

    public BankEntitiesDTO() {
        this.bankEntities = new ArrayList<>();
    }

    public void addBankEntityList(BankEntitiesDTO<T> bankEntitiesDTO, boolean deleteRepeating) {
        if (deleteRepeating) {
            addBankEntityListDeleteRepeating(bankEntitiesDTO);
        } else {
            addBankEntityListDonNotDeleteRepeating(bankEntitiesDTO);
        }
    }

    private void addBankEntityListDeleteRepeating(BankEntitiesDTO<T> bankEntitiesDTO) {
        this.bankEntities.removeIf(individualEntity -> !bankEntitiesDTO.getBankEntities().contains(individualEntity));
    }

    private void addBankEntityListDonNotDeleteRepeating(BankEntitiesDTO<T> bankEntitiesDTO) {
        this.bankEntities.addAll(bankEntitiesDTO.getBankEntities());
    }
}

package com.dreamteam.rbsearch.services;

import com.dreamteam.rbsearch.repositories.EntityRepo;
import com.dreamteam.rbsearch.entities.BankEntity;
import lombok.*;
import org.springframework.stereotype.Service;

@Data
@Service
@NoArgsConstructor
public class BankService {

    EntityRepo entityRepo;

    public BankEntity findById(Long id) {
        return entityRepo.findById(id).orElseThrow(RuntimeException::new);
    }

}

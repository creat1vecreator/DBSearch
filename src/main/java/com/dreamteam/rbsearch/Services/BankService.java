package com.dreamteam.rbsearch.Services;

import com.dreamteam.rbsearch.Repositories.EntityRepo;
import com.dreamteam.rbsearch.Entities.BankEntity;
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

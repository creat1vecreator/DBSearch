package com.example.demo.Services;

import com.example.demo.Entities.BankEntity;
import com.example.demo.Repositories.EntityRepo;
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

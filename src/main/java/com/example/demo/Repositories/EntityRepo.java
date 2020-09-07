package com.example.demo.Repositories;

import com.example.demo.Entities.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EntityRepo extends JpaRepository<BankEntity, Long> {

    Optional<BankEntity> findById(Long id);

}

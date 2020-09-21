package com.dreamteam.rbsearch.repositories;

import com.dreamteam.rbsearch.entities.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BankEntityRepo extends JpaRepository<BankEntity, Long> {

    Optional<BankEntity> findById(Long id);

//    List<BankEntity> findByPriceAndApp(Integer price, String app);

    List<BankEntity> findAllByPriceLessThan(Integer price);

    List<BankEntity> findByApp(String app);
}

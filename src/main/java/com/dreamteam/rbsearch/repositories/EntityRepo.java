package com.dreamteam.rbsearch.repositories;

import com.dreamteam.rbsearch.entities.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.awt.*;
import java.util.List;
import java.util.Optional;

@Repository
public interface EntityRepo extends JpaRepository<BankEntity, Long> {

    Optional<BankEntity> findById(Long id);

    List<BankEntity> findByPriceAndApp(Integer price, String app);

}

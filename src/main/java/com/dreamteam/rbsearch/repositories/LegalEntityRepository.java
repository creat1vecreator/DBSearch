package com.dreamteam.rbsearch.repositories;

import com.dreamteam.rbsearch.entities.LegalEntityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LegalEntityRepository extends JpaRepository<LegalEntityEntity, Long> {

    Optional<LegalEntityEntity> findById(Long id);

    List<LegalEntityEntity> findAllByPriceLessThan(Integer price);

    Optional<LegalEntityEntity> findByName(String name);
}

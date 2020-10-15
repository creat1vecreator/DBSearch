package com.dreamteam.rbsearch.repositories;

import com.dreamteam.rbsearch.entities.CorporationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Deprecated
@Repository
public interface CorporationRepository extends JpaRepository<CorporationEntity, Long> {

    Optional<CorporationEntity> findById(Long id);

    List<CorporationEntity> findAllByPriceLessThan(Integer price);

    Optional<CorporationEntity> findByName(String name);
}

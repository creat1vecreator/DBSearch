package com.dreamteam.rbsearch.repositories;

import com.dreamteam.rbsearch.entities.IndividualEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IndividualRepository extends JpaRepository<IndividualEntity, Long> {

    Optional<IndividualEntity> findById(Long id);

    List<IndividualEntity> findAllByPriceLessThan(Integer price);

    List<IndividualEntity> findAllByAppContaining(String app);

    Optional<IndividualEntity> findByName(String name);
}

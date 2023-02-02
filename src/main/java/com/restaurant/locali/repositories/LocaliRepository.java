package com.restaurant.locali.repositories;

import com.restaurant.locali.entities.LocaliEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocaliRepository extends JpaRepository<LocaliEntity, Integer> {

}

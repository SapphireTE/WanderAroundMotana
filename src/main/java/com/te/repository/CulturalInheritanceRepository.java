package com.te.repository;

import com.te.domain.CulturalInheritance;
import org.springframework.data.repository.CrudRepository;

public interface CulturalInheritanceRepository extends CrudRepository<CulturalInheritance, Long> {
    CulturalInheritance findByCategoryIgnoreCase(String category);
}
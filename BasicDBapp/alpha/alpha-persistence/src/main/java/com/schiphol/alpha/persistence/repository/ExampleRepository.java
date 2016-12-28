package com.schiphol.alpha.persistence.repository;

import com.schiphol.alpha.persistence.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository extends JpaRepository<Sample, Long> {
}

package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.County;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountyRepository extends JpaRepository<County,Long> {
}

package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.MemberType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberTypeRepository extends JpaRepository<MemberType,Long> {
}
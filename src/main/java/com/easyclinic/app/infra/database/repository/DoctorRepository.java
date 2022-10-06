package com.easyclinic.app.infra.database.repository;

import com.easyclinic.app.infra.database.jpa.DoctorJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorJpa, Long> {

}

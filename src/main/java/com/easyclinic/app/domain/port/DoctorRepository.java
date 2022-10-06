package com.easyclinic.app.domain.port;

import com.easyclinic.app.domain.entity.Doctor;

import java.util.Optional;

public interface DoctorRepository {
    Optional<Doctor> findById(Long id);
    void save(Doctor order);
}

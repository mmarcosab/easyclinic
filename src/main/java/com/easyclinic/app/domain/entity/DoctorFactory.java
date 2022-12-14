package com.easyclinic.app.domain.entity;

import java.time.LocalDate;

public interface DoctorFactory {

    Doctor createDoctor(
        String name,
        String cpf,
        LocalDate birthDate,
        String rg,
        Address address
    );

}

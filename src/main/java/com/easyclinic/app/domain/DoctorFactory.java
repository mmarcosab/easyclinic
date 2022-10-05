package com.easyclinic.app.domain;

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

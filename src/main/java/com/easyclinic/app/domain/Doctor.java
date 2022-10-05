package com.easyclinic.app.domain;

import java.time.LocalDate;

public class Doctor implements Person {

    private String name;
    private String cpf;
    private LocalDate birthDate;
    private String rg;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getCpf() {
        return this.cpf;
    }

    @Override
    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getRg() {
        return this.rg;
    }

    @Override
    public CommonAddress getAddress() {
        //TODO implement
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        //TODO implement
        return false;
    }

    @Override
    public String toString() {
        //TODO implement
        return null;
    }
}

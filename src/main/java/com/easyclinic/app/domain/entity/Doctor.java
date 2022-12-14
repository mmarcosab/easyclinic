package com.easyclinic.app.domain.entity;

import java.time.LocalDate;

public class Doctor implements Person {

    private Long id;
    private String name;
    private String cpf;
    private LocalDate birthDate;
    private String rg;
    private String crm;

    private Doctor() {

    }
    protected Doctor(final Long id, final String name, final String cpf, final LocalDate birthDate, final String rg, final String crm) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.rg = rg;
        this.crm = crm;
    }

    @Override
    public Long getId() {
        return this.id;
    }
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

    public String getCrm(){
        return this.crm;
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

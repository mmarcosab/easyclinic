package com.easyclinic.app.infra.database.jpa;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "doctor")
public class DoctorJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String cpf;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    private String rg;
    private String crm;
    @Embedded
    private AddressJpa address;

    private DoctorJpa() {

    }

    public DoctorJpa(String name, String cpf, LocalDate birthDate, String rg, String crm, AddressJpa address) {
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.rg = rg;
        this.crm = crm;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getRg() {
        return rg;
    }

    public String getCrm() {
        return crm;
    }

    public AddressJpa getAddress() {
        return address;
    }
}

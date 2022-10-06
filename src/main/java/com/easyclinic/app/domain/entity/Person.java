package com.easyclinic.app.domain.entity;

import java.time.LocalDate;
public interface Person {
    Long getId();
    String getName();
    String getCpf();
    LocalDate getBirthDate();
    String getRg();
    Address getAddress();
}

package com.easyclinic.app.domain;

import java.time.LocalDate;
public interface Person {
    String getName();
    String getCpf();
    LocalDate getBirthDate();
    String getRg();
    Address getAddress();
}

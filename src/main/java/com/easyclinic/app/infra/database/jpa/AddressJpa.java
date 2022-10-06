package com.easyclinic.app.infra.database.jpa;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AddressJpa {

    private String street;
    private String number;
    private String city;
    @Column(name = "postal_code")
    private String postalCode;

    private AddressJpa() {

    }

    public AddressJpa(String street, String number, String city, String postalCode) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }
}

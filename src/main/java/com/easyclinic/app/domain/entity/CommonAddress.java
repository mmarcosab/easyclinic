package com.easyclinic.app.domain.entity;

public class CommonAddress implements Address {

    private String street;
    private String number;
    private String city;
    private String postalCode;

    private CommonAddress() {

    }

    public CommonAddress(String street, String number, String city, String postalCode) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String getStreet() {
        return this.street;
    }

    @Override
    public String getNumber() {
        return this.number;
    }

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public String getPostalCode() {
        return this.postalCode;
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

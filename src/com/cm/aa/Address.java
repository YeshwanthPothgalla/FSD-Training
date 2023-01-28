package com.cm.aa;

import java.util.Scanner;

public class Address {
    String streetName;
    String addressLine1;
    String addressLine2;
    String city;
    String state;
    String zipCode;
    String Country;

    public String getCountry() {
        return Country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public void setCountry(String country) {
        Country = country;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(String zipCode) {

        this.zipCode = zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }



}

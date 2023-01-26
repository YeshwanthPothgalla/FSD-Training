package com.cm;

public class Theater {
    public String name;
    public Address address = new Address();
    public String getZipCode(){
        return address.zipCode;
    }
    public Theater(String name, String city){
        this.name = name;

        address.city = city;
    }

    public Address getAddress() {
        return address;
    }

}

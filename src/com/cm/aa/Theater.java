package com.cm.aa;

import java.util.ArrayList;

public class Theater {
    public String name;
    public Address address = new Address();
    private int numberofScreens;
    protected String manager;

    ArrayList<AbstractScreen> screens = new ArrayList<>();
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
    public Theater()
    {
        RegularScreen r1 = new RegularScreen(1);
        RegularScreen r2 = new RegularScreen(2);

        UltraScreen u1 = new UltraScreen(11);

        screens.add(r1);
        screens.add(r2);
        screens.add(u1);
    }

    public boolean reserve(int screenNumber, int row, int col, ViewerTypeEnum viewertype)
    {

        return false;
    }

}

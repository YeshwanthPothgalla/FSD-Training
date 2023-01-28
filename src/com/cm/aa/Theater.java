package com.cm.aa;

import java.util.ArrayList;
import java.util.HashMap;

public class Theater {
    public String name;
    public Address address = new Address();
    private int numberofScreens;
    protected String manager;

    ArrayList<AbstractScreen> screens = new ArrayList<>();

    HashMap<Integer, AbstractScreen> screenMap = new HashMap<>();




    public String getZipCode()
    {
        return address.zipCode;
    }
    public Theater(String name, String city)
    {

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

        addScreen(r1);
        addScreen(r2);
        addScreen(u1);

        //screens.add(r1);
        //screens.add(r2);
        //screens.add(u1);

        //screenMap.put(u1.getScreenNumber(), u1);
        //screenMap.put(2, r1);
    }

    private void addScreen(AbstractScreen screen){
        // screens.add(screen);
        screenMap.put(screen.getScreenNumber(), screen);
    }
    public boolean reserve(int screenNumber, int row, int col)
    {
        boolean status = false;

        AbstractScreen screen = screenMap.get(screenNumber);
        if (screen != null) {
            if (screen.isAvailable(row, col)){
                screen.reserve(row, col);
                status = true;
            }

            else{
                System.out.println("Seat is not available " + "screenNumber");
            }
        }

        else{
            System.out.println(" Failed to find Screen " + screenNumber);
        }

        return status;
    }

//    public boolean reserve(int screenNumber, ViewerTypeEnum viewerType)
//    {
////        if(ViewerTypeEnum.valueOf(viewerType) != null)
////        {
////
////        }
////        else
////        {
////
////        }
////        boolean status = false;
//
//        return status;
//    }
    public boolean reserve(int screenNumber, String viewerType)
    {
        if(ViewerTypeEnum.valueOf(viewerType) != null)
        {

        }
        else
        {

        }
        boolean status = false;

        return status;
    }
}

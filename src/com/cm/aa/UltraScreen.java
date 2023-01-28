package com.cm.aa;

public class UltraScreen extends AbstractScreen implements Recliner,DineIn{


    public UltraScreen(int screenNumber) {
        super(screenNumber);
        // TODO Auto-generated method stub
    }

    @Override
    public String getScreenDetails(){
        // TODO Auto-generated method stub
        return  "UltraScreen with Sofa";
    }

    @Override
    public boolean temperatureControlled() {
        // TODO Auto-generated method stub
        return false;
    }
}

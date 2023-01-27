package com.cm.aa;

public class UltraScreen extends AbstractScreen implements Recliner{


    public UltraScreen(int screenNumber) {
        super(screenNumber);
    }

    @Override
    public String getScreenDetails(){
        // TODO Auto-generated method stub
        return  "UltraScreen with Sofa";
    }

    @Override
    public boolean temperatureControlled() {
        return false;
    }
}

package com.cm.aa;

import java.util.ArrayList;

public abstract class AbstractScreen {

    public abstract String getScreenDetails();

    public int auditorium;

    protected int[][] seats;

    ArrayList<String> reservedSeats = new ArrayList<>();

    protected boolean isAvailable(int row, int col) {
        return reservedSeats.contains("" + row + "" + col);
    }

    protected void reserve(int row, int col){
        reservedSeats.add("" + row + "" + col);

    }
    public AbstractScreen(int screenNumber){
        this.auditorium = screenNumber;

    }
    protected boolean is3D;
}

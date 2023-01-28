package com.cm.aa;

import java.util.ArrayList;

public abstract class AbstractScreen {

    public abstract String getScreenDetails();

    public int screenNumber;
    public int numberofRows;
    public int numberofCols;


    public int auditorium;

    protected ArrayList<specialSeat> specialSeats;

    ArrayList<String> reservedSeats = new ArrayList<>();

    protected boolean isAvailable(int row, int col) {
        return reservedSeats.contains("" + row + "" + col);
    }

    protected void reserve(int row, int col){
        reservedSeats.add("" + row + "" + col);

    }
    public AbstractScreen(int screenNumber, int row, int col, ints specialSeatRow, int specialSeatCol){
        this.screenNumber = screenNumber;

        this.numberofRows = rows;
        this.numberofCols = cols;

        for(int i=1; i<specialSeat(specialSeat, i));
        specialSeats.add(seat);
    }
    protected boolean is3D;

    public int getScreenNumber(){
        return ScreenNumber;

    }
}

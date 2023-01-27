package com.util;

import java.util.HashMap;
import java.util.Hashtable;

public class SalesCalculator extends Calculator{
    //private final static float pricewithTax= 1.085f;

    static HashMap<String, Float> stateTaxes = new HashMap<>();
    static Hashtable<String, Float> stateTaxesTable = new Hashtable<>();

    static {
            stateTaxes.put("TX", 1.085f);
            stateTaxes.put("NY", 1.09f);
        }
    public static double totalPrice(int a, int b){
        double result = multiply(a, b, stateTaxes.get("TX"));
        return result;
    }
    public static double totalPrice(int a, int b, String state){

        double result = multiply(a, b, stateTaxes.get(state));
        return result;
    }
}
// Tax for Newyork NY - .09
// Tax for texas TX - .85


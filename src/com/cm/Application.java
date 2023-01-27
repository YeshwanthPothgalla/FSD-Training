package com.cm;

import com.cm.aa.Theater;
import com.cm.aa.ViewerTypeEnum;
import com.util.Calculator;
import com.util.SalesCalculator;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        System.out.println("welcome to"+" "+ args[0]+" "+ args[1]);
        String state =args[2];

        Theater t1 = new Theater("AMC", "Irving");
        t1.getAddress().setCountry("USA");
        t1.reserve(1,5, 20, ViewerTypeEnum.STUDENT);
        System.out.println("Welcome to "+ t1.name+" "+t1.getAddress().getCity()+" "+ t1.getAddress().getCountry());

       int[] data = new int[5];
       data[1] = 40;
       data[4] = 50;
       int [] d1 ={1,2,3,4};
       ArrayList<Integer> values = new ArrayList<>();

        values.add(1);
        values.add(20);
        values.add(1);
        values.add(20);



        System.out.println(" contains : "+ values.contains(10));

        System.out.println(" Arrays ize: "+ values.size());

        System.out.println(Calculator.multiply(d1));

        System.out.println(SalesCalculator.multiply(d1));

        System.out.println(SalesCalculator.totalPrice(5, 10));

        System.out.println(SalesCalculator.totalPrice(5, 10, state));


        }
}

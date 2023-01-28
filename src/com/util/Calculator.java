package com.util;
import java.util.Scanner;

public class Calculator {
public static double multiply(int a, int b, float c){
    return (float) (a * b * c);
}
public static long multiply(int a, int b){
    return (a * b);
}
public static long multiply(int[] numbers){
    long result = 1;
    for(int i = 0; i< numbers.length; i++){
        result = result * numbers[i];
    }
    return result;
}
}




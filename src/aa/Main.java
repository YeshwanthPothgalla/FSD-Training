package aa;

import com.cm.Theater;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to"+" "+ args[0]+" "+ args[1]);
        Theater t1 = new Theater("AMC", "Irving");
        t1.getAddress().setCountry("USA");
        System.out.println("Welcome to "+ t1.name+" "+t1.getAddress().getCity()+" "+ t1.getAddress().getCountry());


        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the theater name: \n");
        //String theaterName = sc.nextLine();
        //System.out.println("Welcome to "+theaterName);
    }
}
package com.company;

public class Circle {
private static final double Pi = 3.1415;


   public static void area(int a){
    System.out.printf("%.4f",Pi*( a * a));
       System.out.println(" ");
}
public static void circumference(int a){
    System.out.printf("%.4f",Pi * 2 * a);
}

}

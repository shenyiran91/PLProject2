package shen.ui;

import java.util.Scanner;

public class Console {

    private static Scanner sc = new Scanner(System.in);

    public static void displayLine(){
        System.out.println();
    }
    public static void display(String s){
        System.out.print(s);
    }
    public static void displayLine(String s){
        System.out.println(s);
    }
    public static String getString(String prompt){
        System.out.print(prompt);
        String s = sc.nextLine();
        return s;
    }
    public static double getdouble(String prompt){
        System.out.print(prompt);
        double s = sc.nextDouble();
        return s;
    }

    public static String gettype(String type){
        System.out.print(type);
        String t = sc.nextLine();
        return t;
    }

}

package shen.ui;

import java.util.Scanner;
import shen.business.Customer;
import shen.business.Employee;

public class Console {

    private static Scanner sc = new Scanner(System.in);

    public static void displayLine(){
        System.out.println();
    }
    public static void displayLine(String s){
        System.out.println(s);
    }
    public static String getString(String prompt){
        System.out.print(prompt);
        String s = sc.nextLine();
        return s;
    }

    public static String gettype(String type){
        String t = sc.nextLine();
        return t;
    }
    public static String getCFName(String prompt){
        System.out.print(prompt);
        String FName = sc.nextLine();
        Customer c = new Customer();
        c.setFirstName(FName);

    }

    public static String getCLName(String prompt){
        System.out.print(prompt);
        String LName = sc.nextLine();
        Customer c = new Customer();
        c.setLastName(LName);
    }

    public static String getCEAdd(String prompt){
        System.out.print(prompt);
        String Eadd = sc.nextLine();
        Customer c = new Customer();
        c.setEmailAdd(Eadd);
    }

    public static String getEFName(String prompt){
        System.out.print(prompt);
        String FName = sc.nextLine();
        Employee e = new Employee();
        e.setFirstName(FName);
    }

    public static String getELName(String prompt){
        System.out.print(prompt);
        String LName = sc.nextLine();
        Employee e = new Employee();
        e.setLastName(LName);
    }

    public static String getEEAdd(String prompt){
        System.out.print(prompt);
        String Eadd = sc.nextLine();
        Employee e = new Employee();
        e.setEmailAdd(Eadd);
    }
    public static String getCNum(String prompt){
        System.out.print(prompt);
        String Cnum = sc.nextLine();
        Customer c = new Customer();
        c.setCustomerNum(Cnum);
    }
    public static String getSSN(String prompt){
        System.out.print(prompt);
        String SSN = sc.nextLine();
        Employee e = new Employee();
        e.setSSN(SSN);
    }
    public static void displayCText(){
        System.out.print("You entered: " + "\n" +c.getDisplayText());
    }
    public static void displayEText(){
        System.out.print("You entered: " + "\n" +e.getDisplayText());
    }
}

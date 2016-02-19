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


    public static void displayCustomer (){
        System.out.print("Enter first name: ");
        String FName = sc.nextLine();
        Customer c = new Customer();
        c.setFirstName(FName);

        System.out.print("Enter last name: ");
        String LName = sc.nextLine();
        c.setLastName(LName);

        System.out.print("Enter email Address: ");
        String Eadd = sc.nextLine();
        c.setEmailAdd(Eadd);

        System.out.print("Enter Customer umber: ");
        String Cnum = sc.nextLine();
        c.setCustomerNum(Cnum);

        System.out.print("You entered: " + "\n" +c.getDisplayText());
    }



    public static void displayEmpolyee (){
        System.out.print("Enter first name: ");
        String FName = sc.nextLine();
        Employee e = new Employee();
        e.setFirstName(FName);

        System.out.print("Enter last name: ");
        String LName = sc.nextLine();
        e.setLastName(LName);

        System.out.print("Enter email Address: ");
        String Eadd = sc.nextLine();
        e.setEmailAdd(Eadd);

        System.out.print("Social security number: ");
        String SSN = sc.nextLine();
        e.setSSN(SSN);

        System.out.print("You entered: " + "\n" +e.getDisplayText());
    }

}

package shen.ui;


public class PersonApp {
    public static void main(String args[]){
        // display a welcome message

        Console.displayLine("Welcome to the Person Tester application");
        Console.displayLine();

        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            String type = Console.gettype("Create customer or employee? (c/e): ");
            while (type.equalsIgnoreCase("c")){
                Console.getCFName("Enter first name: ");
                Console.getCLName("Enter last name: ");
                Console.getCEAdd("Enter email Address: ");
                Console.getCNum("Enter Customer umber: ");
                Console.displayLine();
                Console.displayCText();

            }
            while (type.equalsIgnoreCase("e")){
                Console.getEFName("Enter first name: ");
                Console.getELName("Enter last name: ");
                Console.getEEAdd("Enter email Address: ");
                Console.getSSN("Social security number: ");
                Console.displayLine();
                Console.displayEText();
            }

            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
    }
}

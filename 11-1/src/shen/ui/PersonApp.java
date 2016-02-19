package shen.ui;


public class PersonApp {
    public static void main(String args[]){
        // display a welcome message

        Console.displayLine("Welcome to the Person Tester application");
        Console.displayLine();

        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            String type = Console.gettype("Create customer or employee? (c/e): ");
            Console.displayLine();
            if (type.equalsIgnoreCase("c")){
                Console.displayCustomer();
                Console.displayLine();
            }
            else if (type.equalsIgnoreCase("e")){
                Console.displayEmpolyee();
                Console.displayLine();
            }
            Console.displayLine();
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
    }
}

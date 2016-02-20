package shen.ui;

import shen.account.interfaces.*;
import shen.business.*;

public class AccountApp {

  public static void main(String[] args) {

    CheckingAccount account = new CheckingAccount();

    Console.displayLine("Welcome to the Account Calculator");
    Console.displayLine();

    Console.display("Starting Balance\nChecking: ");
    Console.display(account.getBalanceFormatted());
    Console.displayLine("\n");

    Console.displayLine("Enter the transactions for the month");
    Console.displayLine();

    String cont = "y";
    String choice;

    while (cont.equalsIgnoreCase("y")){
      choice = Console.gettype("Withdrawal or deposit? (w/d): ");
      double amount = Console.getdouble("Amount: ");
      String na = Console.gettype("");
      Console.displayLine();

      if(choice.equalsIgnoreCase("w")){
        if(amount > account.getBalance()){
          Console.displayLine("Error, insufficient funds.");
          Console.displayLine();
        }
        else{
          Transactions.withdraw(account, amount);
        }
      }
      else if(choice.equalsIgnoreCase("d")){
        if(amount > 10000){
          Console.displayLine("Error, Cannot deposit more than $10,000.");
          Console.displayLine();
        }
        else{
          Transactions.deposit(account, amount);
        }
      }
      
      cont = Console.gettype("Continue? (y/n): ");
      Console.displayLine();

    }

    Console.display("Monthly Fees\nChecking fee: ");
    Console.display(account.getMonthlyFeeFormated());
    Console.displayLine("\n");

    account.subtractMonthlyFee();

    Console.display("Final Balance\nChecking: ");
    Console.display(account.getBalanceFormatted());
    Console.displayLine("\n");

  }

}

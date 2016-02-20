package shen.business;

import java.text.*;
import shen.account.interfaces.*;

public class Account implements Withdrawable, Balanceable, Depositable {

  private double balance;

  public Account(){
    balance = 1000.0;
  }

  public double getBalance(){
    return balance;
  }

  public void setBalance(double amount){
    this.balance = amount;
  }

  public void deposit(double amount){
    balance = balance + amount;
  }

  public void withdraw(double amount){
    balance = balance - amount;
  }

  public String getBalanceFormatted(){
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    String formattedBalance = formatter.format(balance);
    return formattedBalance;
  }
    
}

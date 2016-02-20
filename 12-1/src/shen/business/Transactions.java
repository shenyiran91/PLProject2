package shen.business;

import shen.account.interfaces.*;

/**
 * Created by yiranshen on 2/16/16.
 */
public class Transactions {

  public static void deposit(Depositable account, double amount){
    account.deposit(amount);
  }
  public static void withdraw(Withdrawable account, double amount) {
    account.withdraw(amount);
  }

}

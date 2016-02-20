package shen.business;

import java.text.*;

/**
 * Created by yiranshen on 2/16/16.
 */
public class CheckingAccount extends Account{

  private double monthlyFee;

  public CheckingAccount(){
    super();
    this.monthlyFee = 1.0;
  }

  public void subtractMonthlyFee(){
    this.setBalance(this.getBalance()-this.monthlyFee);
  }
  public void setMonthlyFee(double monthlyFee){
    this.monthlyFee = monthlyFee;
  }
  public double getMonthlyFee(){
    return this.monthlyFee;
  }
  public String getMonthlyFeeFormated(){
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    String formattedFee = formatter.format(this.monthlyFee);
    return formattedFee;
  }

    


}

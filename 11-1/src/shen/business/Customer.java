package shen.business;

public class Customer extends Person {

    private String CustomerNum;

    public Customer() {
        super();
        CustomerNum = "";
    }

    public void setCustomerNum(String CustomerNum) {
        this.CustomerNum = CustomerNum;
    }

    public String getCustomerNum() {
        return CustomerNum;
    }

    @Override
    public String getDisplayText() {
        return super.toString() + "Customer number :  " + getCustomerNum();
    }
}

package shen.business;


public class Employee extends Person {

    private String SSN;

    public Employee() {
        super();
        SSN = "";
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getSSN() {
        return SSN;
    }

    @Override
    public String getDisplayText() {
        return super.toString() + "Social security number :  " + getSSN();
    }
}
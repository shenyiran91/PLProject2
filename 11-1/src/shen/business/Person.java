package shen.business;

public abstract class Person {

    private String Type;
    private String FirstName;
    private String LastName;
    private String EmailAdd;

    public Person() {
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setEmailAdd(String EmailAdd) {
        this.EmailAdd = EmailAdd;
    }

    public String getEmailAdd() {
        return EmailAdd;
    }

    @Override
    public String toString() {
        return "Name :  " + getFirstName() +" "+ getLastName() + "\n"
                +"Email :  " + getEmailAdd()+ "\n";
    }

    public abstract String getDisplayText();
}
package DBEx.Entity.concretes;

import DBEx.Entity.abstacts.Customers;

import java.time.LocalDate;

public class IndividualCustomer extends Customers {
    private int customerID;
    private String firstName;
    private String lastName;
    private String tcID;

    public IndividualCustomer(int customerID, String firstName, String lastName, String tcID) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tcID = tcID;
        setCustomerNumber(customerID);
        setId(Integer.parseInt("1".concat(Integer.toString(customerID))));
    }

    public IndividualCustomer() {
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTcID() {
        return tcID;
    }

    public void setTcID(String tcID) {
        this.tcID = tcID;
    }

    public void addTradeInfo(LocalDate localDate){

    }


}

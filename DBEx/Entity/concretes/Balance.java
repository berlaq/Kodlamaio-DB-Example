package DBEx.Entity.concretes;

import DBEx.Entity.abstacts.Customers;

public class Balance extends Customers {

    private int id;
    private int customerID;
    private String date;
    private double amount;

    public Balance(int id, int customerID, String date, double amount) {
        this.id = id;
        this.customerID = customerID;
        this.date = date;
        this.amount = amount;

    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

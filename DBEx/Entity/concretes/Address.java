package DBEx.Entity.concretes;

import DBEx.Entity.abstacts.Customers;

public class Address extends Customers {
    private int id;
    private int customerID;
    private String addressDetail;

    public Address(int id, int customerID, String addressDetail) {
        this.id = id;
        this.customerID = customerID;
        this.addressDetail = addressDetail;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }
}

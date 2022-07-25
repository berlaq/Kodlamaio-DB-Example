package DBEx.Entity.concretes;

import DBEx.Entity.abstacts.Customers;

public class CompanyCustomer extends Customers {
    private int companyCustomerID;
    private String title;
    private int taxNo;

    public CompanyCustomer(int companyCustomerID, String title, int taxNo) {
        this.companyCustomerID = companyCustomerID;
        this.title = title;
        this.taxNo = taxNo;
        setCustomerNumber(companyCustomerID);
        setId(Integer.parseInt("2".concat(Integer.toString(companyCustomerID))));
    }

    public int getCompanyCustomerID() {
        return companyCustomerID;
    }

    public void setCompanyCustomerID(int companyCustomerID) {
        this.companyCustomerID = companyCustomerID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(int taxNo) {
        this.taxNo = taxNo;
    }
}

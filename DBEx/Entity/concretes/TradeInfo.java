package DBEx.Entity.concretes;

public class TradeInfo extends IndividualCustomer {

    private int id;
    private int realCustomerNumber;
    private String startDate;

    public TradeInfo(int id, int realCustomerNumber, String startDate) {
        this.id = id;
        this.realCustomerNumber = realCustomerNumber;
        this.startDate = startDate;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getRealCustomerNumber() {
        return realCustomerNumber;
    }

    public void setRealCustomerNumber(int realCustomerNumber) {
        this.realCustomerNumber = realCustomerNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}

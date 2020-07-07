package inherpolyex;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    double bonusRate;
    double salesRate;
    int bonusPoint;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRate = 0.01;
        salesRate = 0;
        bonusPoint = 0;

    }

    public String showCustomerInfo(){
        return (this.customerName + "'s grade is " + this.customerGrade + " and has " + bonusPoint + " points.");
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRate;
        return price - (int)(price * salesRate);
    }
}

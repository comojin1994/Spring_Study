package inherpolyex;

public class VIPCustomer extends Customer {

    private int agentID;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);

        this.agentID = agentID;

        bonusPoint = 0;
        bonusRate = 0.05;
        salesRate = 0.1;
    }

    @Override
    public String showCustomerInfo() {
        return (this.customerName + "'s grade is " + this.customerGrade + " and has " + bonusPoint + " points." + " Agent ID is " + this.agentID);
    }
}

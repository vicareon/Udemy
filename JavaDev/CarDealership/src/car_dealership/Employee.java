package car_dealership;

public class Employee {
    String name, id;

    public static void handleCustomer(Customer customer, boolean finance, Vehicle vehicle){
        if(finance){
            runCreditHistory(Customer customer, double amount)
        }
        else if (vehicle.getPrice() <= customer.cashOnHand){
            processTransaction(Customer customer, Vehicle vehicle)
        }
        else{
            bring more money
        }
    }
}
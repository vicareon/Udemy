package car_dealership;

public class Customer {
    private String name, address;
    private double cashOnHand;

    //construtor
    public Customer(String name, String address, double cashOnHand) {
        this.name = name;
        this.address = address;
        this.cashOnHand = cashOnHand;
    }

    //getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address += " Dealership City";
        this.address = address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        cashOnHand += 500;
        this.cashOnHand = cashOnHand;
    }

    //métodos

    //método do cliente que compra o carro e utiliza os métodos do empregado
    public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance){
        employee.handleCustomer(this, finance, vehicle);
    }
}

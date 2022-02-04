package car_dealership;

public class Employee {
    private String name;

    //construtor
    public Employee(String name) {
        this.name = name;
    }

    //getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //métodos

    /*método do empregado para passar a compra do cliente com o veículo e se vai financiá-lo.
    Tem 4 saídas diferentes: se vai financiar, se não vai financiar, se não tem dinheiro suficiente ou se o veículo desejado já foi vendido.*/
    public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle){
        if(vehicle.isStatus()){
            if(finance){
                double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
                runCreditHistory(customer, loanAmount);
                processTransaction(customer, vehicle);
            }
            else if (vehicle.getPrice() <= customer.getCashOnHand()){
                processTransaction(customer, vehicle);
            }
            else{
                System.out.println("Error: insufficient funds.");
            }
        }
        else{
            System.out.println("Sorry, this vehicle is not available for purchase.");
        }
    }

    //método que fala o nome do cliente e o tanto que pegou emprestado do banco
    public void runCreditHistory(Customer customer, double loanAmount){
        System.out.println("A loan in the value of U$" + loanAmount +
                "has been approved for the customer " + customer.getName() +
                ".");
    }

    //método que vende o carro para o cliente e marca como indisponível
    public void processTransaction(Customer customer, Vehicle vehicle){
        customer.setCashOnHand(customer.getCashOnHand() - vehicle.getPrice());
        vehicle.setStatus(false);
        System.out.println("Congratulations customer " + customer.getName()
                + " for being the owner of a brand new " + vehicle.getBrand()
                + " " + vehicle.getModel() + "! Thank you for choosing us.");
    }
}
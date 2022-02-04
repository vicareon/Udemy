package car_dealership;

public class Dealership {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tom", "123 Street", 13500);
        Vehicle vehicle1 = new Vehicle("Fiat", "500", 7350);
        Employee employee1 = new Employee("Carla");

        //primeiro teste com sucesso sem financiamento
        customer1.purchaseCar(vehicle1, employee1, false);

        //segundo teste com sucesso com financiamento
        Customer customer2 = new Customer("Julia", "Sky Avenue", 975);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 3200);

        customer2.purchaseCar(vehicle2, employee1, true);

        //terceiro teste sem sucesso falta de dinheiro
        Customer customer3 = new Customer("Daniel", "Ping Pong Street", 200);
        Vehicle vehicle3 = new Vehicle("Ford", "Corsa", 500);

        customer3.purchaseCar(vehicle3, employee1, false);

        //quarto teste com carro que já foi vendido
        customer2.purchaseCar(vehicle1, employee1, true);
    }
}

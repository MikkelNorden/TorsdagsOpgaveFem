package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer("John", "Johnson", "john0210");
        Customer customer2 = new Customer("Jack", "Jackson", "jack0210");
        Customer customer3 = new Customer("Jock", "Jockson", "jock0210");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        printCustomers(customers);
    }

    static void printCustomers(ArrayList customers){
        for(Object customer: customers){
            System.out.println(customer);
        }
    }
}
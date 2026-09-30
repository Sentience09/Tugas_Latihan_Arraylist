import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers; 

    public Bank() {
        customers = new ArrayList<Customer>(); 
    }

    public void addCustomer(String f, String l) {
        customers.add(new Customer(f, l)); 
    }

    public int getNumOfCustomers() {
        return customers.size();
    }

    public Customer getCustomer(int index) {
        return customers.get(index);
    }
}
package exception.customer_management_system;




import java.util.HashMap;
import java.util.Map;

public class CustomerManagementSystem {
    private Map<Integer, Customer> customers = new HashMap<>();

    // Add customer
    public void addCustomer(Customer customer) {
        if (customers.containsKey(customer.getId())) {
            throw new InvalidCustomerDataException("Customer with ID " + customer.getId() + " already exists!");
        }
        customers.put(customer.getId(), customer);
        System.out.println("✅ Customer added: " + customer);
    }

    // Update customer
    public void updateCustomer(int id, String newName, String newEmail) throws CustomerNotFoundException {
        Customer customer = customers.get(id);
        if (customer == null) {
            throw new CustomerNotFoundException("Customer with ID " + id + " not found.");
        }
        customer.setName(newName);
        customer.setEmail(newEmail);
        System.out.println("✏️ Customer updated: " + customer);
    }

    // Delete customer
    public void deleteCustomer(int id) throws CustomerNotFoundException {
        if (!customers.containsKey(id)) {
            throw new CustomerNotFoundException("Cannot delete. Customer with ID " + id + " not found.");
        }
        Customer removed = customers.remove(id);
        System.out.println("🗑️ Customer deleted: " + removed);
    }

    // Display all
    public void displayCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers available.");
        } else {
            System.out.println("\n📋 Customer Records:");
            customers.values().forEach(System.out::println);
        }
    }
}

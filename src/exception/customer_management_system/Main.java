package exception.customer_management_system;




public class Main {
    public static void main(String[] args) {
        CustomerManagementSystem cms = new CustomerManagementSystem();

        try {
            // Add customers
            cms.addCustomer(new Customer(1, "Alice", "alice@example.com"));
            cms.addCustomer(new Customer(2, "Bob", "bob@example.com"));

            // Try invalid customer data
            try {
                cms.addCustomer(new Customer(3, "", "invalidEmail"));
            } catch (InvalidCustomerDataException e) {
                System.out.println("⚠️ Data Validation Error: " + e.getMessage());
                e.printStackTrace(); // Logging
            }

            // Update customer
            cms.updateCustomer(1, "Alice Smith", "alice.smith@example.com");

            // Try updating non-existing customer
            try {
                cms.updateCustomer(99, "Ghost", "ghost@example.com");
            } catch (CustomerNotFoundException e) {
                System.out.println("❌ Update Error: " + e.getMessage());
                e.printStackTrace(); // Logging
            }

            // Delete customer
            cms.deleteCustomer(2);

            // Try deleting non-existing customer
            try {
                cms.deleteCustomer(100);
            } catch (CustomerNotFoundException e) {
                System.out.println("❌ Delete Error: " + e.getMessage());
                e.printStackTrace(); // Logging
            }

            // Display customers
            cms.displayCustomers();

        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}

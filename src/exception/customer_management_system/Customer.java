package exception.customer_management_system;


public class Customer {
    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        if (name == null || name.isEmpty()) {
            throw new InvalidCustomerDataException("Customer name cannot be empty!");
        }
        if (email == null || !email.contains("@")) {
            throw new InvalidCustomerDataException("Invalid email address!");
        }
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new InvalidCustomerDataException("Customer name cannot be empty!");
        }
        this.name = name;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new InvalidCustomerDataException("Invalid email address!");
        }
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer { ID=" + id + ", Name='" + name + "', Email='" + email + "' }";
    }
}


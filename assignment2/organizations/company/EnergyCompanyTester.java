package assignment2.organizations.company;

public class EnergyCompanyTester {
    public static void main(String[] args) {
        // Create an EnergyCompany instance
        EnergyCompany energyCompany = new EnergyCompany("ABC Energy");
        energyCompany.setEmail("info@abcenergy.com");
        energyCompany.setPhoneNumber("1234567890");
        energyCompany.setAddress("123 Main St, City");

// Create Customer instances
        Customer customer1 = new Customer("John", "Doe", "1234567890", "C001", "456 Oak St, City");
        Customer customer2 = new Customer("Jane", "Smith", "0987654321", "C002", "789 Elm St, City");

// Add customers to the energy company
        energyCompany.addCustomer(customer1);
        energyCompany.addCustomer(customer2);

// Access customer information
        System.out.println("Customer 1 ID: " + customer1.getCustomerID());
        System.out.println("Customer 2 Address: " + customer2.getAddress());
    }
}

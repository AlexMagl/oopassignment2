package assignment2.organizations.company;

import assignment2.commons.Person;

public class Customer extends Person {
    private String customerID;
    private String address;

    public Customer(String name, String surname, String personalNumber, String customerID, String address) {
        super(name, surname, personalNumber);
        this.customerID = customerID;
        this.address = address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getAddress() {
        return address;
    }
}
package assignment2.organizations.company;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;
import assignment2.commons.Person;

import java.util.ArrayList;
import java.util.List;

public class EnergyCompany extends Organization implements Contactable {
    private String companyName;
    private String email;
    private String phoneNumber;
    private String address;
    private List<Customer> customers;

    public EnergyCompany(String companyName) {
        this.companyName = companyName;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public boolean removeCustomer(Customer customer) {
        return customers.remove(customer);
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
package drivers.aspectQns2;


import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private List<Customer> customerList = new ArrayList<> ();

    @Override
    public void registerCustomer(Customer customer) {
        customerList.add(customer);
        System.out.println("Customer registered successfully!");
    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public void printAllCustomers() {
        System.out.println("List of all the customers:");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void updateCustomer(Customer customer) {
        int index = customerList.indexOf(customer);
        if (index != -1) {
            customerList.set(index, customer);
            System.out.println("Customer updated successfully!");
        } else {
            System.out.println("Customer not found!");
        }
    }

    @Override
    public Customer getCustomerById(String customerId) {
        return null;
    }

    @Override
    public Customer searchCustomerById(int id) throws Exception {
        for (Customer customer : customerList) {
            if (customer.getCustomerId () == id) {
                return customer;
            }
        }
        throw new Exception ("Customer not found with id " + id);
    }

    @Override
    public Customer getCustomerByName(String name) {
        for (Customer customer : customerList) {
            if (customer.getCustomerName ().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }
}

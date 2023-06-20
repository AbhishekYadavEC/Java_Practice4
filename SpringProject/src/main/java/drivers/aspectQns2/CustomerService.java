package drivers.aspectQns2;

import model.Customer;

import java.util.List;

public interface CustomerService {
    public void registerCustomer(Customer customer);
    public List<Customer> getAllCustomers();

    void printAllCustomers();

    public void updateCustomer(Customer customer);
    public Customer getCustomerById(String customerId);

    Customer searchCustomerById(int id) throws Exception;

    public Customer getCustomerByName(String customerName);
}

package daocustomer;

import model.Customer;

import java.util.List;

public interface CustomerDao {
     boolean insertCustomer(Customer customer);

    Customer searchCustomer(int CustomerId);

    int getCustomerId(String customerName, int houseno);

    List<Customer> getAllCustomers();

    boolean deleteCustomer(int customerId);

    boolean updateCustomer(Customer c);
}

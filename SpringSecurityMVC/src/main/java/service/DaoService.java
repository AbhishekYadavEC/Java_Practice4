package service;

import model.Customer;
import model.Loan;

import java.util.List;

public interface DaoService {

    boolean registerCustomer(Customer customer);
    Customer searchCustomer(int customerId);

    boolean insertLoan(List<Loan> list);

    String searchLoan(int loanapplicationNo);

    int getCustomerId(String name, int houseno);

    List<Customer> getAllCustomers();

    void deleteCustomer(int customerId);

    void updateCustomer(Customer c);
}

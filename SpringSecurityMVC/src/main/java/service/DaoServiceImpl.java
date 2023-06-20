package service;

import daoLoan.LoanDaoImpl;
import daocustomer.CustomerDaoImpl;
import model.Customer;
import model.Loan;

import java.util.List;

public class DaoServiceImpl implements DaoService{
    CustomerDaoImpl customerDao= new CustomerDaoImpl();
    LoanDaoImpl loanDao= new LoanDaoImpl();
    @Override
    public boolean registerCustomer(Customer customer) {
        return customerDao.insertCustomer(customer);
    }

    @Override
    public Customer searchCustomer(int customerId) {
        return customerDao.searchCustomer(customerId);
    }

    @Override
    public boolean insertLoan(List<Loan> list) {
        return loanDao.insertLoan(list);
    }

    @Override
    public String searchLoan(int loanapplicationNo) {
        return loanDao.searchLoan(loanapplicationNo);
    }

    @Override
    public int getCustomerId(String name, int houseno) {
        return customerDao.getCustomerId(name,houseno);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    @Override
    public void deleteCustomer(int customerId) {
       if(customerDao.deleteCustomer(customerId))
       {
           System.out.println("customer deleted");
       }
       else
       {
           System.out.println("customer not found");
       }
    }

    @Override
    public void updateCustomer(Customer c) {
        if(customerDao.updateCustomer(c))
        {
            System.out.println("customer updated");
        }
        else
        {
            System.out.println("something went wrong");
        }
    }
}

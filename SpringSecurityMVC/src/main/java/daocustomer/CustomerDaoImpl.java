package daocustomer;

import connection.ConnectionClass;
import daoLoan.LoanDaoImpl;
import model.Customer;
import model.Loan;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    Connection connection = ConnectionClass.getConnection();

    @Override
    public boolean insertCustomer(Customer c) {
        String query = "insert into customer_16915(gender,fullname,nationality,DateofBirth,OccuptionType,TotalWorkExperience,organizationName,HouseNo,Country,State,City) values(?,?,?,?,?,?,?,?,?,?,?) ";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, c.getGender());
            preparedStatement.setString(2, c.getFullname());
            preparedStatement.setString(3, c.getNationality());
            preparedStatement.setDate(4, Date.valueOf(c.getDateOfBirth()));
            preparedStatement.setString(5, c.getOccupationType());
            preparedStatement.setInt(6, c.getTotalWorkExperience());
            preparedStatement.setString(7, c.getOrganizationName());
            preparedStatement.setInt(8, c.getHouseNo());
            preparedStatement.setString(9, c.getCountry());
            preparedStatement.setString(10, c.getState());
            preparedStatement.setString(11, c.getCity());
            preparedStatement.executeQuery();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Customer searchCustomer(int CustomerId) {

        String getCustomerQuery = "select c.*,l.* from loanCustomer_16915 l, customer_16915 c where c.customerid = " + CustomerId + "";

        Customer customer = new Customer();

        try (PreparedStatement preparedStatement = connection.prepareStatement(getCustomerQuery)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            int count = 0;
            while (resultSet.next()) {
                if (count == 0) {
                    customer.setGender(resultSet.getString(2));
                    customer.setFullname(resultSet.getString(3));
                    customer.setNationality(resultSet.getString(4));
                    customer.setDateOfBirth(resultSet.getDate(5).toLocalDate());
                    customer.setOccupationType(resultSet.getString(6));
                    customer.setTotalWorkExperience(Integer.parseInt(resultSet.getString(7)));
                    customer.setOrganizationName(resultSet.getString(8));
                    customer.setHouseNo(Integer.parseInt(resultSet.getString(9)));
                    customer.setCountry(resultSet.getString(10));
                    customer.setState(resultSet.getString(11));
                    customer.setCity(resultSet.getString(12));
                }
                Loan currLoan = new Loan();
                currLoan.setLoanApplicationNo(resultSet.getInt(13));
                currLoan.setProductType(resultSet.getString(14));
                currLoan.setProduct(resultSet.getString(15));
                currLoan.setLoanAmountRequested(Integer.parseInt(resultSet.getString(16)));
                currLoan.setTenure(resultSet.getInt(17));
                currLoan.setRate(Integer.parseInt(resultSet.getString(18)));
                currLoan.setAgreementDate(resultSet.getDate(19).toLocalDate());
                currLoan.setCustomerId(resultSet.getInt(20));
                currLoan.setInstallmentDueDate(resultSet.getDate(21).toLocalDate());

                customer.setLoan(currLoan);

                count++;
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return customer;
    }

    @Override
    public int getCustomerId(String customerName, int houseno) {
        int customerID = -1;
        String query = "select customerId from customer_16915 where fullname='" + customerName + "'and houseno=" + houseno + "";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                customerID = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerID;
    }

    @Override
    public List<Customer> getAllCustomers() {

        String query = "select * from customer_16915 ";

        Customer customer = new Customer();
        List<Customer> list= new ArrayList<>();

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                customer.setGender(resultSet.getString(2));
                customer.setFullname(resultSet.getString(3));
                customer.setNationality(resultSet.getString(4));
                customer.setDateOfBirth(resultSet.getDate(5).toLocalDate());
                customer.setOccupationType(resultSet.getString(6));
                customer.setTotalWorkExperience(Integer.parseInt(resultSet.getString(7)));
                customer.setOrganizationName(resultSet.getString(8));
                customer.setHouseNo(Integer.parseInt(resultSet.getString(9)));
                customer.setCountry(resultSet.getString(10));
                customer.setState(resultSet.getString(11));
                customer.setCity(resultSet.getString(12));
                list.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean deleteCustomer(int customerId) {

        LoanDaoImpl loanDao= new LoanDaoImpl();

        String getCustomerQuery = "delete.jsp  from  customer_16915 where customerid = " + customerId+ "";

        try(PreparedStatement preparedStatement= connection.prepareStatement(getCustomerQuery))
        {
            preparedStatement.executeQuery();
            loanDao.deleteLoan(customerId);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean updateCustomer(Customer c) {

        int customerId=getCustomerId(c.getFullname(),c.getHouseNo());
        if(deleteCustomer(customerId))
        {
            insertCustomer(c);
            return true;
        }
        return false;
    }
}

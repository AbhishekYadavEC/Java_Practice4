package daoLoan;

import connection.ConnectionClass;
import model.Loan;

import java.sql.*;
import java.util.List;

public class LoanDaoImpl implements LoanDao {
    Connection connection = ConnectionClass.getConnection();

    //insert Database in loan details by customer
    @Override
    public boolean insertLoan(List<Loan> loan) {
        for (Loan e : loan) {
            String query = "insert into  loanCustomer_16915 values(?,?,?,?,?,?,?,?,?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1,e.getLoanApplicationNo());
                preparedStatement.setString(2, e.getProductType());
                preparedStatement.setString(3, e.getProduct());
                preparedStatement.setInt(4, e.getLoanAmountRequested());
                preparedStatement.setInt(5, e.getTenure());
                preparedStatement.setInt(6, e.getRate());
                System.out.println("inside");
                preparedStatement.setDate(7, Date.valueOf(e.getAgreementDate()));
                preparedStatement.setInt(8, e.getCustomerId());
                preparedStatement.setDate(9, Date.valueOf(e.getInstallmentDueDate()));
                preparedStatement.executeQuery();
            } catch (SQLException s) {
                s.printStackTrace();
                return false;
            }
        }
        return true;
    }

    @Override
    public String searchLoan(int loanapplicationNo) {
        String query="select customerid,fullname from customer_16915 where customerid = (select customerid from loanCustomer_16915 where loanapplicationno ="+loanapplicationNo+")";
        String result="" ;

        try(PreparedStatement preparedStatement= connection.prepareStatement(query))
        {
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next())
            {
                result="Customer Id is : "+resultSet.getString(1)+" &  Customer Name is : "+resultSet.getString(2);
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return result;
    }

    //Delete loan detalis by given customerId

    @Override
    public boolean deleteLoan(int customerId) {
        Connection connection = ConnectionClass.getConnection();

        String getCustomerQuery = "delete.jsp  from  loanCustomer_16915 where customerid = " + customerId+ "";

        try(PreparedStatement preparedStatement= connection.prepareStatement(getCustomerQuery))
        {
            preparedStatement.executeQuery();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}

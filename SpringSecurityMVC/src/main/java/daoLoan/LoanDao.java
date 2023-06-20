package daoLoan;

import model.Loan;

import java.util.List;

public interface LoanDao {
     boolean insertLoan(List<Loan> loan);

    String searchLoan(int loanapplicationNo);

     boolean deleteLoan(int customerId);
}

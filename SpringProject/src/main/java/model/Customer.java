package model;

import org.example.LoanAgreement;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Customer {
    private int customerId;
    private String customerName;
    private double monthlyIncome;
    private String profession;
    private String designation;
    private String companyName;
    private Address address;
    private LoanAgreement loanAgreementDtls;
    private LocalDate dateOfBirth;
    private int age;

public Customer(){

}
    public Customer(int customerId, String customerName, double monthlyIncome, String profession, int age) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.monthlyIncome = monthlyIncome;
        this.profession = profession;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LoanAgreement getLoanAgreementDtls() {
        return loanAgreementDtls;
    }

    public void setLoanAgreementDtls(LoanAgreement loanAgreementDtls) {
        this.loanAgreementDtls = loanAgreementDtls;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", monthlyIncome=" + monthlyIncome +
                ", profession='" + profession + '\'' +
                ", designation='" + designation + '\'' +
                ", companyName='" + companyName + '\'' +
                ", address=" + address +
                ", loanAgreementDtls=" + loanAgreementDtls +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

}

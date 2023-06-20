package model;

import java.time.LocalDate;

public class Loan {
    private int loanApplicationNo;
    private String productType;
    private String product;
    private int loanAmountRequested;
    private int tenure;
    private int rate;
    private LocalDate AgreementDate;

    private LocalDate InstallmentDueDate;
    private int customerId;

    public LocalDate getInstallmentDueDate() {
        return InstallmentDueDate;
    }

    public void setInstallmentDueDate(LocalDate installmentDueDte) {
        InstallmentDueDate = installmentDueDte;
    }



    public int getLoanApplicationNo() {
        return loanApplicationNo;
    }

    public void setLoanApplicationNo(int loanApplicationNo) {
        this.loanApplicationNo = loanApplicationNo;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getLoanAmountRequested() {
        return loanAmountRequested;
    }

    public void setLoanAmountRequested(int loanAmountRequested) {
        this.loanAmountRequested = loanAmountRequested;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public LocalDate getAgreementDate() {
        return AgreementDate;
    }

    public void setAgreementDate(LocalDate agreementDate) {
        AgreementDate = agreementDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanApplicationNo=" + loanApplicationNo +
                ", productType='" + productType + '\'' +
                ", product='" + product + '\'' +
                ", loanAmountRequested=" + loanAmountRequested +
                ", tenure=" + tenure +
                ", rate=" + rate +
                ", AgreementDate=" + AgreementDate +
                ", InstallmentDueDate=" + InstallmentDueDate +
                ", customerId=" + customerId +
                '}';
    }
}

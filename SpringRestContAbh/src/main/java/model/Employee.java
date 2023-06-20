package model;


import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;


public class Employee {
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Emp Name must be only alphabets")
    private String empName;
    private String qualification;
    @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$", message = "Date of Joining is in the format – DD/MM/YYYY")
    private LocalDate dateOfJoining;
    @Email(message = "Email validation failed")
    private String emailAddress;
    @Size(min = 10, max = 10, message = "Contact Number’s length should be 10")
    private long contactNumber;
    private String designation;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

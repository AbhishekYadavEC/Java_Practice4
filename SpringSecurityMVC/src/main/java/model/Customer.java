package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String gender;
    private String fullname;

    private String nationality;
    private LocalDate dateOfBirth;
    private String occupationType;
    private int TotalWorkExperience;
    private String organizationName;
    private int HouseNo;
    private String country;

    private String state;
    private String city;

    private List<Loan> loan;

    public List<Loan> getLoan() {
        return loan;
    }

    public void setLoan(Loan currloan) {
        if(loan==null)
        {
            loan= new ArrayList<>();
        }
        loan.add(currloan);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getOccupationType() {
        return occupationType;
    }

    public void setOccupationType(String occupationType) {
        this.occupationType = occupationType;
    }

    public int getTotalWorkExperience() {
        return TotalWorkExperience;
    }

    public void setTotalWorkExperience(int totalWorkExperience) {
        TotalWorkExperience = totalWorkExperience;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public int getHouseNo() {
        return HouseNo;
    }

    public void setHouseNo(int houseNo) {
        HouseNo = houseNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "gender='" + gender + '\'' +
                ", fullname='" + fullname + '\'' +
                ", nationality='" + nationality + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", occupationType='" + occupationType + '\'' +
                ", TotalWorkExperience=" + TotalWorkExperience +
                ", organizationName='" + organizationName + '\'' +
                ", HouseNo=" + HouseNo +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", loan=" + loan +
                '}';
    }
}

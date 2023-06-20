package model;


import java.util.List;
import java.util.Set;

public class User {
    private String name;
    private int userId;

    private String address;
    private Set<String > emailAddress;
    private Address address1;



    private List<Long> phoneNumbers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public Set<String> getEmailAddress() {
        return emailAddress;
    }

    public List<Long> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Long> phoneNumbers){
        this.phoneNumbers=phoneNumbers;

    }

    public void setEmailAddress(Set<String>emailAddress ){
        this.emailAddress=emailAddress;
    }
    public  User(){

    }

    /*public User(String name, int userId, String address, Set<String> emailAddress, Address address1, List<Long> phoneNumbers) {
        this.name = name;
        this.userId = userId;
        this.address = address;
        this.emailAddress = emailAddress;
        this.address1 = address1;
        this.phoneNumbers = phoneNumbers;
    }*/

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userId=" + userId +
                ", address='" + address + '\'' +
                ", emailAddress=" + emailAddress +
                ", address1=" + address1 +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
    public void init(){
        System.out.println ("Inside init Method" );
    }
    public void destroy(){
        System.out.println ("Inside Destroy Method" );
    }
}

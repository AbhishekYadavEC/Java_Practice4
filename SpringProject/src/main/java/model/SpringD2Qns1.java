package model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Set;

public class SpringD2Qns1 {
    private List<String> phoneNumber;
    private Set<String > emailAddress;

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Autowired
    public Set<String> getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(Set<String> emailAddress) {
        this.emailAddress = emailAddress;
    }

    //Check Validation Of Phone Number
    @PostConstruct
    public void init(){
        for(int i=0;i<phoneNumber.size ();i++){
            String phoneNumberList=phoneNumber.get (i);
            if(!phoneNumberList.startsWith ("+91")){
               phoneNumber.set (i,"+91"+ phoneNumberList);
            }

        }

    }
    @PreDestroy
    public void destroy(){
        phoneNumber.clear ();
        emailAddress.clear ();
    }

    @Override
    public String toString() {
        return "SpringD2Qns1{" +
                "phoneNumber=" + phoneNumber +
                ", emailAddress=" + emailAddress +
                '}';
    }
}

package com.userregistrationsystem;
public class user {
    private String firstName;
    private String  lastName;
    private String  emailAddress;
    private String mobileNo;

    private String password;

    public user()
    {

    }
    public String getMobileNo()
    {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo)
    {
        this.mobileNo = mobileNo;
    }
    public user(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public user(String emailAddress)
    {
        this.emailAddress=emailAddress;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getEmailAddress()
    {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public void setPassword(String password)
    {
        this.password=password;
    }

    public String getPassword()
    {
        return password;
    }

}

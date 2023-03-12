package com.userregistrationsystem;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationValidation {
    public void getName()
    {
        UserRegistrationValidation user=new UserRegistrationValidation();
        user userDetails=new user();
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the first name");
        userDetails.setFirstName(scanner.nextLine());

        System.out.println(" please enter the last name");
        userDetails.setLastName(scanner.nextLine());

        Pattern p=Pattern.compile("([A-Z][a-z]{2,})");
        Matcher matcherFirstName=p.matcher(userDetails.getFirstName());
        boolean matchFirstName=matcherFirstName.matches();
        Matcher matcherLastName=p.matcher(userDetails.getLastName());
        boolean matchLastName=matcherLastName.matches();

        if(!matchFirstName || !matchLastName)
        {
            System.out.println("Please enter first letter in capital " +
                                "and minimum 3 characters");
            user.getName();
        }
    }
    public void getEmailId()
    {
        UserRegistrationValidation user=new UserRegistrationValidation();
        user userDetails=new user();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Password");
        userDetails.setEmailAddress(scanner.nextLine());

        Pattern p=Pattern.compile("([a-zA-Z0-9\\.]+@[a-z]+\\.[a-z]{2,3}+([\\.][a-z]{2})?)");
        Matcher matcher=p.matcher(userDetails.getEmailAddress());
        boolean matchPassword=matcher.matches();

        if(!matchPassword)
        {
            System.out.println("Please enter correct password");
            user.getEmailId();
        }
    }

    public void getPassword()
    {
        UserRegistrationValidation user=new UserRegistrationValidation();
        user userDetails=new user();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the Password");
        userDetails.setPassword(scanner.nextLine());

        Pattern p=Pattern.compile("((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])).{8,}");
        Matcher m=p.matcher(userDetails.getPassword());
        boolean matchPassword=m.matches();
        if(!matchPassword) {
            System.out.println("Please enter correct password with  minimum 8 characters and password " +
                                "must contain 1 Upper Case , one numeric value");
            user.getPassword();
        }
    }
    public void getMobileNumber()
    {
        UserRegistrationValidation user=new UserRegistrationValidation();
        user userDetails=new user();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the Mobile number ");
        userDetails.setMobileNo(scanner.nextLine());

        Pattern pattern=Pattern.compile("([0-9]{2}+\\s[0-9]{10})");
        Matcher matcher=pattern.matcher(userDetails.getMobileNo());
        boolean matchPassword=matcher.matches();

        if(!matchPassword)
        {
            System.out.println("Please enter correct mobile no");
            user.getMobileNumber();
        }
    }

    public static void main(String[] args)
    {
        UserRegistrationValidation user = new UserRegistrationValidation();
        user.getName();
        user.getEmailId();
        user.getMobileNumber();
    }
}
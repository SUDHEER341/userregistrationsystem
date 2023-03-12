package com.userregistrationsystem;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidation {

    public void firstName()
    {
        UserRegistrationValidation user=new UserRegistrationValidation();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first name");
        user userDetails=new user(scanner.nextLine());
        Pattern pattern=Pattern.compile("([A-Z]{1}[a-z]{2,})");
        Matcher matcher=pattern.matcher(userDetails.firstName);
        boolean found=matcher.matches();
        if(!found) {
            System.out.println("Please enter first letter in capital and minimum 3 characters");
            user.firstName();
        }
    }

    public void lastName()
    {
        UserRegistrationValidation user=new UserRegistrationValidation();
        Scanner scanner=new Scanner(System.in);
        System.out.println("PleaseEnter the Last name");
        user userDetails=new user(scanner.nextLine());
        Pattern pattern=Pattern.compile("([A-Z]{1}[a-z]{2,})");
        Matcher matcher=pattern.matcher(userDetails.firstName);
        boolean found=matcher.matches();
        if(!found)
        {
            System.out.println("Please enter first letter of last name caps and minimum 3 characters");
            user.lastName();
        }
    }
    public static void main(String[] args)
    {
        UserRegistrationValidation user=new UserRegistrationValidation();
        user.firstName();
        user.lastName();
    }
}
package com.userregistrationsystem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidateFirstName {

    public void firstName(){
        UserRegistrationValidateFirstName user=new UserRegistrationValidateFirstName();
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the first name");
        user userDetails=new user(scanner.nextLine());
        Pattern p=Pattern.compile("([A-Z]{1}[a-z]{2,})");
        Matcher matcher=p.matcher(userDetails.firstName);
        boolean found=matcher.matches();

        if(!found) {

            System.out.println("Please enter first  letter in capital letter and minimun 3 characters");
            user.firstName();
        }
    }



    public static void main(String[] args) {
        UserRegistrationValidCheck user=new UserRegistrationValidCheck();
        user.getFirstName();
    }
}

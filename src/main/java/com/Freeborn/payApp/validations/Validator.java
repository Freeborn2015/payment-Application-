package com.Freeborn.payApp.validations;

import org.springframework.stereotype.Component;

@Component
public class Validator {
    public static boolean isValidEmail(String email){
    return email.contains("@");
}
    public static boolean isValidPassword(String password){
        return password.matches("[a-zA-Z0-9%*]{8,20}");

    }
//    public static boolean isValidPhoneNumber(String phoneNumber){
//        return phoneNumber.length()==11;
//    }
}

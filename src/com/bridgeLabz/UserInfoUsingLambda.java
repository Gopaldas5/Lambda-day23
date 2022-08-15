package com.bridgeLabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInfoUsingLambda {
    IFirstName firstName = (str)->{
        Pattern pattern = Pattern.compile("^([A-Z]{1}+)[A-Za-z]{2,}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    };
    ILastName lastName = (str)->{
        Pattern lastname1 = Pattern.compile("^([A-Z]{1}+)[A-Za-z]{2,}$");
        Matcher matcher = lastname1.matcher(str);
        return matcher.matches();
    };
    MobileNumber mobileNumber = (mobile_num)->{
        Pattern mobileNumber = Pattern.compile("^([0-9]{2}+)[ ]([6-9]{1,1}+)([0-9]{9,9})$");
        Matcher matcher = mobileNumber.matcher(mobile_num);
        return matcher.matches();
    };
    IPassword password = (passwordRegex) ->{
        Pattern password1 = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        Matcher matcher = password1.matcher(passwordRegex);
        return matcher.matches();
    };

    public static void main(String[] args) {

        UserInfoUsingLambda userInfoUsingLambda = new UserInfoUsingLambda();
        System.out.println("first Name is :- "+userInfoUsingLambda.firstName.isFirstName("Gopal"));
        System.out.println("Last name is :- "+userInfoUsingLambda.lastName.isLastName("Das"));
        System.out.println("Mobile number is :- "+userInfoUsingLambda.mobileNumber.isMobileNumber("91 8758664787"));
        System.out.println("Last name is :- "+userInfoUsingLambda.password.isPassword("G@343u873"));
    }
}

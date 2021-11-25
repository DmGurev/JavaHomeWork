package com.pb.gurev.hw8;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Auth {

    private String login = "login ";
    private String password = "password";

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || !login.matches("[a-zA-Z0-9]{5,20}")) {
            throw new WrongLoginException("Login length must be between 5 and 20 symbols, contains only letters and numbers");
        }
        if (password == null || !password.matches("[a-zA-Z0-9_]{5,}")) {
            throw new WrongPasswordException("Password length must be >= 5 symbols, contains only letters, numbers and symbol \"_\"");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password not confirmed");
        }
        this.login = login;
        this.password = password;
    }
    public void signIn(String login, String password) throws WrongLoginException, WrongPasswordException {
//        if (!this.login.equals(login)|| !this.password.equals(password)){
//            throw new WrongLoginException("User not found");
//        }
        if (!this.login.equals(login)) {
            throw new WrongLoginException("User not found");
        }
        if (!this.password.equals(password)) {
            throw new WrongLoginException("User not found");
        }
    }
}


//        if (Pattern.matches("[A-Za-z0-9]{5,20}", login)) {
//            System.out.println("Вы ввели логин с учетом требований. Ваш логин:   " + login);
//            this.login = login;
//        }else if (!Pattern.matches("[A-Za-z0-9]{5,20}", login))  {
//        throw new  WrongLoginException ("Не выполнены требования к логину (5-20 латинских символов - строчных и заглавных букв и цифр"); }
//       // WrongLoginException ex1 = new WrongLoginException();
//        ////////////////////////////////////////////////////////////////////////////////////////////////////
//
//            String login2 = scan.nextLine();
//            Pattern pattern2 = Pattern.compile("[A-Za-z_]{5,}");
//            Matcher matcher2 = pattern.matcher(password);
//            //Scanner scan = new Scanner(System.in);
//            password = scan.nextLine();
//            System.out.println("Введите пароль. Требования: не менее 5 символов (латинские буквы и цифры, нижнее подчеркивание)");
//
//            if (Pattern.matches("[A-Za-z0-9_]{5,}", password)) {
//                System.out.println("Вы ввели пароль с учетом требований. Ваш логин:   " + password)}
//                this.password = password;
//            } else if (!Pattern.matches("[A-Za-z0-9_]{5,}", password));
//            throw new WrongPasswordException(password);
//            WrongPasswordException ex2 = new WrongPasswordException();
//    }
//    public static void SignIn (String login, String password) throws WrongLoginException {
//        if (!login.equals(login)&&!password.equals(login)){
//            throw new  WrongLoginException(login);}
//        else {
//            System.out.println("Добро пожаловать!");
//        }
//    }
//}




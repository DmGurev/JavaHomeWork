package com.pb.gurev.hw8;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auth{
    private String login;
    private String password;

    public void SignUp(){

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Pattern pattern = Pattern.compile("[A-Za-z0-9]{5,20}");
        Matcher matcher = pattern.matcher(login);
        Scanner scan = new Scanner(System.in);
        login = scan.nextLine();
        System.out.println("Введите логин. Требования: 5-20 символов (латинских букв и цифр)");

        if (Pattern.matches("[A-Za-z0-9]{5,20}", login)) {
            System.out.println("Вы ввели логин с учетом требований. Ваш логин:   " + login);
            this.login = login;
        }else if (!Pattern.matches("[A-Za-z0-9]{5,20}", login)) ;
        throw new  WrongLoginException;
       // WrongLoginException ex1 = new WrongLoginException();
        ////////////////////////////////////////////////////////////////////////////////////////////////////

            String login2 = scan.nextLine();
            Pattern pattern2 = Pattern.compile("[A-Za-z_]{5,}");
            Matcher matcher2 = pattern.matcher(password);
            //Scanner scan = new Scanner(System.in);
            password = scan.nextLine();
            System.out.println("Введите пароль. Требования: не менее 5 символов (латинские буквы и цифры, нижнее подчеркивание)");

            if (Pattern.matches("[A-Za-z0-9_]{5,}", password)) {
                System.out.println("Вы ввели пароль с учетом требований. Ваш логин:   " + password);
                this.password = password;
            } else if (!Pattern.matches("[A-Za-z0-9_]{5,}", password));
            throw new WrongPasswordException(password);
            WrongPasswordException ex2 = new WrongPasswordException();
    }
    public static void SignIn (String login, String password) throws WrongLoginException {
        if (!login.equals(login)&&!password.equals(login)){
            throw new  WrongLoginException(login);}
        else {
            System.out.println("Добро пожаловать!");
        }
    }
}




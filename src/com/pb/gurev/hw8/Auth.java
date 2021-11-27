package com.pb.gurev.hw8;


import java.util.regex.Pattern;

public class Auth {

    String login;
    String password;

    public Auth(String login, String password) {
       // this.login = login;
     //  this.password = password;
    }

    public void signUp(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (!Pattern.matches("[a-zA-Z_0-9] {5,20}", login)) {
            throw new WrongLoginException("Логин не соответвует требованиям");

        } else {

        }
        if (!Pattern.matches("[a-zA-Z_0-9] {5,}", password)) {
            throw new WrongPasswordException("Password does not meet requirements!");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password does not match!");   //не совпадает
        } else {
            this.login = login;
            this.password = password;
            System.out.println("Registration successful! Welcome to the site!");
        }
    }

    public void signIn(String log, String pass)
            throws WrongLoginException, WrongPasswordException {
        System.out.println("Enter login:");
        System.out.println("Enter password:");

        if (!login.equals(log) || !password.equals(pass)) {
            throw new WrongLoginException("Wrong password or login");
        } else {
            System.out.println("Welcome to the site!");
        }
    }
}

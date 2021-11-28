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
            throw new WrongPasswordException("Пароль не соответствует требованям   ");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли Не совпадают");
        } else {
            this.login = login;
            this.password = password;
            System.out.println("Регистрация успешная");
        }
    }

    public void signIn(String log, String pass)
            throws WrongLoginException, WrongPasswordException {
        System.out.println("Введите логин:");
        System.out.println("Введите пароль:");

        if (!login.equals(log) || !password.equals(pass)) {
            throw new WrongLoginException("Неправильный логин/пароль");
        } else {
            System.out.println("Вы зашли на сайт");
        }
    }
}

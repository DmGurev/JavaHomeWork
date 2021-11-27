package com.pb.gurev.hw8;
import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Зарегистрируйтесь на сайте");
        System.out.println("Введите логин:");

        String login = scan.nextLine();
        System.out.println("Введите пароль:");
        String password = scan.nextLine();
        System.out.println("Регистрация успешная");

        System.out.println("Введите логин:");
        System.out.println("Введите пароль:");
        String confirmPassword = scan.nextLine();

        Auth auth = new Auth(login, password);


        try {
            auth.signUp(login, password, confirmPassword);
        } catch (WrongLoginException e1) {
            System.out.println("Пароль и логин не соотетствуют  " + e1);
        } catch (WrongPasswordException e2) {
            System.out.println("Пароль и логин не соотетствуют  " + e2);
        }

        try {
            auth.signIn(login, password);
        }catch (WrongLoginException e1) {
            System.out.println("Пароль и логин не соотетствуют" + e1 + "Введите логин/пароль:");
        }catch (WrongPasswordException e2) {
            System.out.println("Пароль и логин не соотетствуют" + e2 + "Введите логин/пароль:");
        }
    }

}
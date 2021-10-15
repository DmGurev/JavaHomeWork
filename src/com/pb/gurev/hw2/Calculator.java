package com.pb.gurev.hw2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int x;
        int y;
        int ans;
        char num;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите значение operand1: ");
        x = reader.nextInt();
        System.out.print("Введите значение operand2: ");
        y = reader.nextInt();
        System.out.print("Введите символ математического действия (+, -, *, /): ");
        String sign = reader.next();
        switch (sign) {
            case "+":
                System.out.println(+(x + y));
                break;
            case "-":
                ans = x - y;
                System.out.println(+(x - y));
                break;
            case "*":
                ans = x * y;
                System.out.println(+(x * y));
                break;
            case "/": {
                if (y == 0) {
                    System.out.println("Ошибка! На НОЛЬ делить нельзя!");
                } else if (y > 0) ans = x / y;
                System.out.println(+(x / y));
                break;
            }
            default:
                System.out.println("Ошибка! Выберете корректные арифметические символы");
        }
    }
}






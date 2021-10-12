package com.pb.gurev.hw2;
import java.util.Scanner;
public class Calculator {
        public static void main(String[] args) {
            int x;
            int y;
            int ans;
            char sign;
            Scanner reader = new Scanner(System.in);
            System.out.print("Введите значение operand1: ");
            x = reader.nextInt();
            System.out.print("Введите значение operand2: ");
            y = reader.nextInt();
            System.out.print("\nEnter an operator (+, -, *, /): ");
            sign = reader.next().charAt(0);
            switch(sign) {
                case '+': ans = x + y;
                    break;
                case '-': ans = x - y;
                    break;
                case '*': ans = x * y;
                    break;
                case '/': ans = x / y;
                    break;
                default:  System.out.printf("Error! Enter correct operator");
                    return;


            }
            System.out.print("\nРезультат операции:\n");
            System.out.printf(x + " " + sign + " " + y + " = " + ans);
        }
}


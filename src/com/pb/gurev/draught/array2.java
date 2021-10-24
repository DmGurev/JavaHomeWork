package com.pb.gurev.draught;
import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        System.out.println("Введите 10 целых чисел (Массив)");
    Scanner input = new Scanner(System.in);
    int array [] = new int [10];
    for (int i = 0; i<array.length; i++)
    {array [i] = input.nextInt();}

    int sum = 0;
    for (int num: array){
    sum = sum+num;}
        System.out.println("Cумма элеметов массива равна: " + sum);
    }
}



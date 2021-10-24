package com.pb.gurev.hw3;
import java.util.Arrays;
//import java.util.Scanner;
public class Array {
    private static int і;
    public static void main(String[] args) {
       //Scanner input = new Scanner(System.in);
        System.out.println("Введите массив");
        int  [] x = {20, 2, 2, 2, 2};
       // System.out.println("Сумма элементов массива:" + sum);
        int sum = Arrays.stream(x).sum();
        for (int i = 0; i < x.length; i++);
        sum += x[і];
        System.out.println("Сумма элементов массива:" + sum);
        int count;
        do{
            count = 0;
        for (int i = 0; i < x.length-1; i++){
               if (x[i] > x[i+1]){
                   int temp = x [i];
                   x[i] = x[i+1];
                   x [i+1] = temp;
                   count++;
               }
            }
        } while (count > 0);
        System.out.println();
        for (int num : x){
            System.out.print(num + " ");

        }
    }
}



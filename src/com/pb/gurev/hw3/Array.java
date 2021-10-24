package com.pb.gurev.hw3;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.print("Введите 10 целых чисел (Массив)");
        Scanner input = new Scanner(System.in);
        int array [] = new int [10];
        for (int i = 0; i<array.length; i++)
        {array [i] = input.nextInt();}

        int sum = 0;
        for (int num: array){
            sum = sum+num;}
        System.out.println("Cумма элементов массива равна:" +sum);

        int count;
        do{
            count = 0;
            for (int i = 0; i<array.length-1; i++){
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        } while (count>0);
        System.out.print("Сортировка от меньшего к большему"+ Arrays.toString(array));
    }
}

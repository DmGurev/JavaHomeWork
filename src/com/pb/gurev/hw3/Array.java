package com.pb.gurev.hw3;

import com.sun.org.apache.xerces.internal.impl.xs.util.XInt;

import javax.swing.*;

public class Array {
    public static void main(String[] args) {

        int[] x ={88, 12, 18, 36, 95, 1, 53, 69, 44, 15};
        for (int num : x){
            System.out.print(num + ",");
        }
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
            System.out.println(num + ",");
        }
    }
}



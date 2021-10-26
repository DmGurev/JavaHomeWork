package com.pb.gurev.draught;
import java.util.Scanner;

public class UpperCase3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] tests = new String;
        String[] tests = scanner.nextLine();{
            System.out.println();}

           // s = scanner.nextLine();
        }
      //  tests
        for (String s : ) {
            System.out.println(toUp(s));
        }
    }

    static String toUp(String s){
        char[] arr = s.toCharArray();
        boolean inWord = false;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] >= 97 && arr[i] <= 122) {
                if (inWord) {
                    continue;
                }
                arr[i] -= 32;
                inWord = true;
            } else {
                inWord = false;
            }
        }
        return new String(arr);
    }
}
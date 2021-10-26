package com.pb.gurev.draught;

import java.util.Scanner;

public class UPPERCASE {
    public static void main(String[] args) {
        System.out.println ("Введите слово/фразу:");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String s = "";
        char ch;
        for(int i = 0; i<str.length(); i++)
        {
            ch=str.charAt(i);
            if (ch>=65 && ch<=90)
            {
                s+= (char) (ch + 32);
            }
            else if (ch>=97 && ch<=122)
            {
                s+=(char) (ch-32);
            }
            else
            {
                s+=ch;
            }
        }
        System.out.println("результат ");
        System.out.println(s);
    }
}




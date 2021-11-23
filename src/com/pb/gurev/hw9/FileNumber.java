package com.pb.gurev.hw9;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.*;
import java.io.File;
import java.util.Scanner;

public class FileNumber {
    public static void main(String[] args) throws Exception {
        File myObj = new File("C://Users//Дмитрий//IdeaProjects//JavaHomeWork" +
                "//src//com//pb//gurev//hw9//numbers.txt");
        try {
            if (myObj.createNewFile()) {
                System.out.println("Файл  " + myObj.getName() + "   создан");
            } else {
                System.out.println("Файл " + myObj.getName() + " создан ранее");
            }
        } catch (IOException e) {
            System.out.println("Обнаружена ошибка1");
            e.printStackTrace();
        }
        try {
                Writer Writer = new FileWriter("C://Users//Дмитрий//IdeaProjects//JavaHomeWork" +
                        "//src//com//pb//gurev//hw9//odd-numbers.txt");
                int[][] array = new int[10][10];
            for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = ((int) (Math.random() * 99 + 1));
                System.out.println(array[i][j] + " ");
                Writer.write(array[i][j] + " ");
            }
        Writer.write("\n");
                Writer.close();}
        } catch (IOException e) {
            System.out.println("Обнаружена ошибка2");
        }
        try {
            //File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Обнаружена ошибка3");
            e.printStackTrace();
        }
    }
    public static void createOddNumbersFile() throws IOException {
        try (Scanner in = new Scanner(new File("numbers.txt"))) {
            PrintWriter pw = new PrintWriter(new File("odd-numbers.txt.txt"));
            System.out.println("Вывод чисел , с учетом замены на ноль:");
            while (in.hasNextLine()) {
                Scanner line = new Scanner(in.nextLine());
                while (line.hasNextInt()) {
                    int digit = line.nextInt();
                    if ( digit % 2 == 0) {
                        System.out.println("0");
                        digit = 0;
                    } else
                        System.out.println( digit + " ");
                    pw.println( digit + " ");
                }
                line.close();
                pw.println();
            }
            System.out.println();
        } catch (IOException ioException) {
            System.out.println("Файл не записан" + ioException);
        }
    }
}






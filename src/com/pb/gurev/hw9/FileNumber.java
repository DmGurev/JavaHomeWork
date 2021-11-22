package com.pb.gurev.hw9;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FileNumber {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("numbers.txt");
        try {
            File myObj = new File("C://Users//Дмитрий//IdeaProjects//JavaHomeWork//numbers.txt");
            if (myObj.createNewFile()) {
                System.out.println("Файл  " + myObj.getName() + "   создан");
            } else {
                System.out.println("Файл " + myObj.getName() + " создан ранее");
            }
        } catch (IOException e) {
            System.out.println("Обнаружена ошибка");
            e.printStackTrace();
        }

        try {
                Writer Writer = new FileWriter("C://Users//Дмитрий//IdeaProjects//JavaHomeWork//numbers.txt");
                int[][] array = new int[10][10];
            for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int u = 0; u < array.length; u++) {
                array[i][u] = ((int) (Math.random() * 99 + 1));
                System.out.println(array[i][u] + " ");
                Writer.write(array[i][u] + " ");
            }
            Writer.write("\n");
        }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}



//            myWriter.close();
////            System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
              //  Writer.write("\n");


//            Writer Writer = new FileWriter("C://Users//Дмитрий//IdeaProjects//JavaHomeWork//numbers.txt");
//            int[][] array = new int[10][10];
//            for (int i = 0; i < array.length; i++,
//                    System.out.println()) {
//                for (int u = 0; u < array.length; u++) {
//                    array[i][u] = ((int) (Math.random() * 99 + 1));
//                    System.out.println(array[i][u] + " ");
//                    Writer.write(array[i][u] + " ");
//                }
//              Writer.write("\n");
//            }
//            writer.write("Some test 123");
//            writer.newLine();
//            writer.write("Other string 456");
//        } catch (Exception ex) {
//            System.out.println("Error with file write: " + ex);
//        }
//            System.out.println("Write to file \"" + path.toAbsolutePath() + "\" done!");
//
//
//            // read from file
//            System.out.println("Read text from file \"" + path.toAbsolutePath() + "\":");
//            try (BufferedReader reader = Files.newBufferedReader(path)) {
//
//                System.out.println("----------------------------------");
//                String line;
//                while((line = reader.readLine()) != null) {
//                    System.out.println(line);
//                }
//                System.out.println("----------------------------------");
//
//            } catch (Exception ex) {
//                System.out.println("Error with file read: " + ex);
//            }
//            System.out.println("Read from file done!");


//            myWriter.write("Files in Java might be tricky, but it is fun enough!");
//            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();

//        String fileSeparator = System.getProperty("file.separator");
//        String absoluteFilePath = fileSeparator + "Users" +  fileSeparator + "Дмитрий" + fileSeparator +
//                "IdeaProjects" + fileSeparator +  "JavaHomeWork" +  fileSeparator  +  "src" + fileSeparator
//                + "com" + fileSeparator  + "pb" +  fileSeparator +  "gurev"  +  fileSeparator  +  "hw9"
//                +  fileSeparator  + "numbers.txt";
//
//        File file = new File(absoluteFilePath);
//        if(file.createNewFile()){
//            System.out.println(absoluteFilePath + " Файл создан");
//        } else {
//            System.out.println("Файл " + absoluteFilePath + " уже существует");
//       }
//        Path path = Paths.get("numbers.txt");
//
//        // write to file
//        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
//            writer.write("Some test 123");
//            writer.newLine();
//        //    writer.write("Other string 456");
//        } catch (Exception ex) {
//            System.out.println("Error with file write: " + ex);
//        }
//        System.out.println("Write to file \"" + path.toAbsolutePath() + "\" done!");
//
//
//        // read from file
//        System.out.println("Read text from file \"" + path.toAbsolutePath() + "\":");
//        try (BufferedReader reader = Files.newBufferedReader(path)) {
//
//            System.out.println("----------------------------------");
//            String line;
//            while((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//            System.out.println("----------------------------------");
//
//        } catch (Exception ex) {
//            System.out.println("Error with file read: " + ex);
//        }
//        System.out.println("Read from file done!");
//    }
//}
//
//
//
//
//        Scanner scanner = new Scanner(file);
//        String line = scanner.nextLine();
//        String [] numberString = line.split(" *");
//        int [] numbers = new int[6];
//        int counter = 0;
//
//        for (String number : numberString) {
//            numbers [counter++] = Integer.parseInt(number);
//        }
//        System.out.println(Arrays.toString(numbers));
//        scanner.close();
//    }
//}
//
////
 //Writer Writer = new FileWriter("C://Users//Дмитрий//IdeaProjects//JavaHomeWork//numbers.txt");
//            int[][] array = new int[10][10];
//            for (int i = 0; i < array.length; i++,
//                    System.out.println()) {
//                for (int u = 0; u < array.length; u++) {
//                    array[i][u] = ((int) (Math.random() * 99 + 1));
//                    System.out.println(array[i][u] + " ");
//                    Writer.write(array[i][u] + " ");
//                }
//              //  Writer.write("\n");
//            }

//
//
//
////
////
////}
////
////
////        try {
////            BufferedWriter writer = new BufferedWriter(new CreateNumbersFile(myFile));
////            CreateNumbersFile writer  = new CreateNumbersFile (new File);
////            writer.write ("[0-99]");
////            writer.close();
////        }catch (IOException ex){
////            ex.printStackTrace();
////        }


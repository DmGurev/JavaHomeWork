package com.pb.gurev.draught;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperCase2 {
    public static void main (String [] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String stringln= reader.readLine();
    String[] words= stringln.split(" ");
    for (int i=0; i<words.length; i++){
        words[i]=Character.toUpperCase( words[i].charAt(0))+words[i].substring(1);
    }
    for (int i=0; i<words.length; i++){
    System.out.print(words[i] + " ");
    }
    reader.close();
}
}


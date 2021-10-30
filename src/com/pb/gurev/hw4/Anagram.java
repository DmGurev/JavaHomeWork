package com.pb.gurev.hw4;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Фраза первая: ");
        String first = in.nextLine().toUpperCase();


        System.out.print("Фраза вторая: ");
        String second = in.nextLine().toUpperCase();

        String result = isAnagram(first, second);
        System.out.println(result);
    }
    private static String isAnagram(String first, String second) {
        if (first == null || second == null || first.equals("") || second.equals("") || !first.matches("[А-Яа-я,. ]+")
                || !second.matches("[А-Яа-я,. ]+")) {
            return "Не анаграмма";
        }
        String answer = "";

        String st = first.replaceAll("[,. ]+", "");
        String nd = second.replaceAll("[,. ]+", "");

        if (st.equals("") || nd.equals("")) {
            return "Анаграмма";
        }

        char[] arraySt = st.toCharArray();
        char[] arrayNd = nd.toCharArray();
        Arrays.sort(arraySt);
        Arrays.sort(arrayNd);

        if (Arrays.equals(arraySt, arrayNd)) {
            answer = "Анаграмма";
        } else {
            answer = "Не анаграмма";
        }
        return answer;
    }
}
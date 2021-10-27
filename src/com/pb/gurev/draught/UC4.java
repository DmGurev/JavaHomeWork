package com.pb.gurev.draught;
public class UC4 {
    public static String getUp1stLetter (String input) {
        String [] tmpArr = input.split(" ");
        String result = "";
        for (int i = 0; i < tmpArr.length; i++) {
            if (tmpArr[i].length() > 1) {
                char oldFirst = tmpArr[i].charAt(0);
                result += tmpArr[i].substring(0,1).toUpperCase() + tmpArr[i].substring(1,tmpArr[i].length()) + " ";
            }
        }
        return result;
    }
    public static void main(String [] args) {
        String ss = "напишите фразу";
        System.out.println(ss);
        System.out.println(getUp1stLetter(ss));
    }
}
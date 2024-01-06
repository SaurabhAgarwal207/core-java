package com.saurabh.strings;

public class StringAllDigit {
    public static void main(String[] args) {
        String str = "123456";
        boolean flag = false;
        char arr[] = str.toCharArray();
        for (char c : arr) {
            if (!Character.isDigit(c)) {
                flag = true;
                break;
            }
        }
        if (flag == false)
            System.out.println("String contains all digits");
        else
            System.out.println("String contains other characters which are not digits");
    }
}

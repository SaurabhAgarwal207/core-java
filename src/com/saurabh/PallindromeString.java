package com.saurabh;

public class PallindromeString {
    public static void main(String[] args) {
        String str = "nitin";
        boolean flag = false;
        char[] arr = str.toCharArray();
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                flag = true;
                break;
            }
        }
        if (flag == false)
            System.out.println("String is pallindrome");
        else
            System.out.println("String is not pallindrome");

    }
}

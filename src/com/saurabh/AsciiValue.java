package com.saurabh;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch=scan.next().charAt(0);
        System.out.println("Ascii of "+ch+" is : "+(int)ch);
    }
}

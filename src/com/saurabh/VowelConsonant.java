package com.saurabh;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch=scan.next().charAt(0);
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||
                ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println(ch+ " is vowel");
        else
            System.out.println(ch+" is consonant");
    }
}

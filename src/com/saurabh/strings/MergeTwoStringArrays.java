package com.saurabh.strings;

public class MergeTwoStringArrays {
    public static void main(String[] args) {
        String arr1[]= {"abc","def"};
        String arr2[]= {"ghi","jkl"};
        String arr3[] = new String[arr1.length+arr2.length];
        int i=0,j=0;
        while(i<arr1.length){
            arr3[i]=arr1[i];
            i++;
        }
        while(i<arr3.length){
            arr3[i]=arr2[j];
            i++;
            j++;
        }
        for(String s: arr3)
            System.out.print(s+" ");
    }
}

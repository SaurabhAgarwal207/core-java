package com.saurabh;

import java.util.Arrays;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        //input array
        int a[]={10,20,30,30,10,40,50};
        //inbuilt sort method
        Arrays.sort(a);
        //new array of same length as input
        int[] temp = new int[a.length];
        int j=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                temp[j++]=a[i];
            }
        }
        //adding last element of array
        temp[j++]=a[a.length-1];
        //printing new array
        for(int i=0;i<j;i++){
            System.out.println(temp[i]);
        }
    }
}

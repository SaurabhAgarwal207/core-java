package com.saurabh.strings;

public class LargestElementArray {
    public static void main(String[] args) {
        int arr[]={10,40,20,60,80,50};
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest element in array is :"+max);
    }
}

package com.saurabh.strings;

import java.util.Arrays;

public class TwoEqualArrays {
    public static void main(String[] args) {
        int arr[]={10,20,40,30,};
        int arr2[]={40,30,20,10};
        boolean flag=false;
        if(arr.length!=arr2.length){
            flag=true;
        }
        else{
            Arrays.sort(arr);
            Arrays.sort(arr2);
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=arr2[i]){
                    flag=true;
                    break;
                }
            }
        }
        if(flag==true){
            System.out.println("Arrays are not equal");
        }
        else{
            System.out.println("Arrays are equal");
        }

    }
}

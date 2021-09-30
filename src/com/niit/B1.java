package com.niit;

public class B1 {
    public static void main(String[] args) {
        int arr[] = new int[]{
                2,3,4,1,0,3,4,5,6
        };
        int tmp = 0;

        for (int i = 0; i <  arr.length-1; i++) {
            for (int j=i;j< arr.length;j++){
                if(arr[i] < arr[j]){
                    //swap vị trí
                    tmp= arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

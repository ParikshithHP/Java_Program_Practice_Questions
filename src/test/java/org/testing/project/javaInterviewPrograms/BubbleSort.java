package org.testing.project.javaInterviewPrograms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int arr[] = {6,4,2,3,5,8,7,9,1,13,12,15,14};

        for(int i=0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

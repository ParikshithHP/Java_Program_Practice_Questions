package org.testing.project.javaInterviewPrograms;

import java.util.Arrays;

public class DuplicateElementsInAnArray {
    public static void main(String[] args){
        //using brut force method with for loop
        int arr[] = {1,2,3,4,5,6,3,3,2,7,8,6,9,5,5};

        System.out.print("Duplicate Elements found:");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+",");
                }
            }
        }
    }
}

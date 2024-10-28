package org.testing.project.javaInterviewPrograms;

import java.util.Arrays;

public class DuplicateElementsInAnArrayUsingSorting {
    public static void main(String[] args) throws Exception {
        int arr[] ={1,2,3,4,5,6,3,7,8,4,9,7};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("Duplicate Found:"+arr[i]);
            }
        }

    }
}

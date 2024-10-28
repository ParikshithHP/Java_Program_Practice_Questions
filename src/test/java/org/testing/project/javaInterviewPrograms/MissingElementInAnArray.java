package org.testing.project.javaInterviewPrograms;

public class MissingElementInAnArray {
    public static void main(String[] args){
        // it should be a sorted array and linear array
        int arr[] = {1,2,3,4,6,7,8,9,10};
        int actualSum = 0;
        int expectedSum=0;
        for(int i=0;i<arr.length;i++){
            actualSum=actualSum+arr[i];
        }
        for(int i=arr[0];i<=arr[arr.length-1];i++){
            expectedSum = expectedSum+i;
        }
        System.out.println("Missing element in an array is:"+(expectedSum-actualSum));
    }
}

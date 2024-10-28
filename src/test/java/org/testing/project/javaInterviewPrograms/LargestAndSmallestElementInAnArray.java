package org.testing.project.javaInterviewPrograms;

public class LargestAndSmallestElementInAnArray {
    public static void main(String[] args){
        int arr[] ={5,4,3,2,1,6,7,8,9};
        int smallest = arr[0];
        int largest = arr[0];
        for(int i : arr){
            if(i<smallest){
                smallest=i;
            }else if(i>largest){
                largest=i;
            }
        }
        System.out.println("smallest element is:"+smallest+" and largest element is:"+largest);
    }
}

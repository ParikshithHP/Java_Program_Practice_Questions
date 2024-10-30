package org.testing.project.javaInterviewPrograms;

public class SecondLargestInArray {

    public static void main(String[] args) {
        int arr[] = {54, 2, 32, 75, 98, 76, 89, 54, 54};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }
        System.out.println("Second largest element in an array is : " + second);
    }
}

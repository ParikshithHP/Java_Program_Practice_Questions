package org.testing.project.javaInterviewPrograms;

public class CountofDigitsInNum {
    public static void main(String[] args) throws Exception {
        //count the number of digits in a number
        int num =123456789;
        int count =0;
        while (num!=0){
            num = num/10;
            count ++;
        }
        System.out.println("total number of digits in a number is:"+count);
    }
}

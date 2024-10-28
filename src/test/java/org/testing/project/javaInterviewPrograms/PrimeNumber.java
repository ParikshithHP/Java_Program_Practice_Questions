package org.testing.project.javaInterviewPrograms;

import javax.swing.plaf.IconUIResource;

public class PrimeNumber {
    public static void main(String[] args) throws Exception {
        int num = 5;
        int count =0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("is a prime number");
        }else{
            System.out.println("its not a prime number");
        }
    }
}

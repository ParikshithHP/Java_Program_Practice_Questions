package org.testing.project.javaInterviewPrograms;

public class FactorialUsingRecursion {
    static int isFactorial(int n){
        if(n<=1)
            return 1;
        else
        return n*isFactorial(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("factorian of:"+n+" is "+isFactorial(n));
    }
}

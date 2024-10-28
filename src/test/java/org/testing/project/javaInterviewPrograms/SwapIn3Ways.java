package org.testing.project.javaInterviewPrograms;

public class SwapIn3Ways {
    void main(){



        int a = 10;
        int b = 20;


        int temp = a;
        a=b;
        b=temp;

//        a = a+b;
//        b= a-b;
//        a=a-b;


        a=a*b;
        b=a/b;
        a=a/b;

        //xor operator

        a=a^b;
        b=a^b;
        a=a^b;


        a=a+b-(a=b);



        System.out.println(a+" "+b);
    }
}

package org.testing.project.javaInterviewPrograms;

public class LargestOf3Numbers {
    public static void main(String[] args) throws Exception {
        int a=1;
        int b=2;
        int c=3;
        //1
        if(a>b&&a>c){
            System.out.println(a+" is greatest");
        }else if(b>a&&b>c){
            System.out.println(a+" is greatest");
        }else{
            System.out.println(c+" is greatest");
        }
        //2 ternary operator
        int largest1= a>b?a:b;
        int largest2 = c>largest1?c:largest1;
        System.out.println(largest2);
        //3
        int largest =c>(a>b?a:b)?c:largest1;
        System.out.println(largest);
    }
}

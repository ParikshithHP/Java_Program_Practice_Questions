package org.testing.project.javaInterviewPrograms;

public class PalindromeNumber {
    public static void main(String[] args){
        int num = 123454321;
        int actualnum = 123454321;
        int revNum =0;
        while(num!=0){
            revNum = revNum*10+num%10;
            num=num/10;
        }
        if(revNum==actualnum){
            System.out.println("is palindrome number");
        }else{
            System.out.println("is not a palindrome number" + revNum+" "+num);
        }
    }
}

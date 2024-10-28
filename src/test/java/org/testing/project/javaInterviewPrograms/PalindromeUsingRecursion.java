package org.testing.project.javaInterviewPrograms;

public class PalindromeUsingRecursion {

    public boolean isRecursion(String str){
        if(str.isEmpty()){
            return false;
        }
        if(str.length()<=1){
            return true;
        }

        String first = str.substring(0,1);
        String last = str.substring(str.length()-1,str.length());
        if (!first.equals(last)) {
            return false;
        }else{
            return isRecursion(str.substring(1,str.length()-1));
        }
    }
    public static void main(String[] args){
        PalindromeUsingRecursion obj = new PalindromeUsingRecursion();
        if(obj.isRecursion("malayalam")){
            System.out.println("is palindrome");
        }else {
            System.out.println("Not a palindrome");
        }

    }
}

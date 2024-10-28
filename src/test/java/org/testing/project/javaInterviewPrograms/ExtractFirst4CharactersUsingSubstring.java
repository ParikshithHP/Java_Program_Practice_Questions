package org.testing.project.javaInterviewPrograms;

public class ExtractFirst4CharactersUsingSubstring {
    public static void main(String[] args){
        String str = "parikshith shetty";

        System.out.println(str.substring(0,4));// first 4 characters
        System.out.println(str.substring(str.length()-4,str.length()));//last4 characters in a string

    }
}

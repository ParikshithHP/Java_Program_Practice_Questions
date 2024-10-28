package org.testing.project.javaInterviewPrograms;

public class ReverseAStringSentence {
    public static void main(String[] args){
        String str ="im a java programming person";
        String arr[] = str.split("\\s");
        String revSentence = "";
        for(int i=arr.length-1;i>=0;i--){
            revSentence = revSentence + arr[i] + " ";
        }
        System.out.println(revSentence);
    }
}

package org.testing.project.javaInterviewPrograms;

public class ReverseSentenceWords {
    public static void main(String[] args){
        String str ="im a java programming person";
        String arr[] = str.split("\\s");
        String revword = "";
        for(String s:arr){
            String rev ="";
            for(int i=s.length()-1;i>=0;i--){
                rev = rev+s.charAt(i);
            }
            revword = revword + rev + " ";
        }
        System.out.println(revword);
    }
}

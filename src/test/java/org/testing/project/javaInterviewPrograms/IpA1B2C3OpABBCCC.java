package org.testing.project.javaInterviewPrograms;

public class IpA1B2C3OpABBCCC {
    public static void main(String[] args) throws Exception {
        String input = "A1B2C3";
        String output ="";

        for(int i=0;i<input.length();i=i+2){
            char ch = input.charAt(i);
            int count = input.charAt(i+1)-'0';

            for(int j=0;j<count;j++){
                output+= ch;
            }
        }
        System.out.println(output);
    }
}

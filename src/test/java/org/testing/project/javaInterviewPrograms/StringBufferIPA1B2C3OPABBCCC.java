package org.testing.project.javaInterviewPrograms;

import org.checkerframework.checker.index.qual.PolyUpperBound;

public class StringBufferIPA1B2C3OPABBCCC {
    public static void main(String[] args) throws Exception {
        String input = "A1B2C3";
        StringBuilder output = new StringBuilder();
        for(int i=0;i<input.length();i+=2){
            char ch = input.charAt(i);
            int charCount= Character.getNumericValue(input.charAt(i+1));
            for(int j=0;j<charCount;j++){
                output.append(ch);
            }
        }
        System.out.println(output);
    }
}

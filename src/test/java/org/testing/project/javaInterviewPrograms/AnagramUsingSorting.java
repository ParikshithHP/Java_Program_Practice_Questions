package org.testing.project.javaInterviewPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramUsingSorting {
    public static void main(String[] args){
        String str ="silent";
        String str1 = "listen";
        char arr[] = str.toCharArray();
        char arr1[] = str1.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr);
        if(Arrays.equals(arr,arr1)){
            System.out.println("is anagram");
        }else{
            System.out.println("is not anagram");
        }
    }
}

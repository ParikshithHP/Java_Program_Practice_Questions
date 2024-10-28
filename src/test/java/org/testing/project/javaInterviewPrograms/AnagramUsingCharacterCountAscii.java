package org.testing.project.javaInterviewPrograms;

public class AnagramUsingCharacterCountAscii {

    public boolean anagram(String str,String str1){

        if(str.length()!=str1.length()){
            return false;
        }

        int[] charCount = new int[256];
        for(int i=0;i<str.length();i++){
            charCount[str.charAt(i)]++;
            charCount[str1.charAt(i)]--;
        }

        for(int count:charCount){
            if(count!=0){
                return false;
            }
        }
        return true;// if no 0 found
    }
    public static void main(String[] args){
        AnagramUsingCharacterCountAscii obj = new AnagramUsingCharacterCountAscii();
        System.out.println(obj.anagram("silent","listen"));
        if(obj.anagram("silent", "listen")){
            System.out.println("is anagram");
        }else{
            System.out.println("not anagram");
        }
    }
}

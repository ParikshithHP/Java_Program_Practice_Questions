package org.testing.project.javaInterviewPrograms;

public class ReverseStrings3ways {
    public static void main(String[] args){
        String str = "parikshith";
        String rev = "";

        //1
//        for(int i=str.length()-1;i>=0;i--){
//            rev = rev+str.charAt(i);
//        }
//        System.out.println(rev);

        //2
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

        //3 character array

        char[] arr = str.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            rev = rev + arr[i];

        }
        System.out.println(rev);
    }
}

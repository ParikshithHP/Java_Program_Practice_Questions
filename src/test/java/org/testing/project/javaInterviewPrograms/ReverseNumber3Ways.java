package org.testing.project.javaInterviewPrograms;

public class ReverseNumber3Ways {
    public static void main(String[] args){
        int num = 124345;
        int rev =0;

        //1
        while(num!=0){
            rev = rev*10 + num%10;
            num=num/10;
        }
        System.out.println(rev);


        //2
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        System.out.println(sb.reverse());

        //3
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.append(num).reverse());
    }
}

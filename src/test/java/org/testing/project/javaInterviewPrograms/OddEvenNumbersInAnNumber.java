package org.testing.project.javaInterviewPrograms;

public class OddEvenNumbersInAnNumber {
    public static void main(String[] args) throws Exception {
        int num =12345678;
        int evenCount = 0;
        int oddCount =0;
        while(num!=0){
            int sum=0;
            sum = sum+num%10;
            num = num/10;
            if (sum % 2 == 0) {
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("odd num is:"+oddCount+" Even num is:"+evenCount);
    }
}
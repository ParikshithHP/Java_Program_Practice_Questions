package org.testing.project.javaInterviewPrograms;

public class ThirdLargestInArray {
    public static void main(String[] args) throws Exception {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int first =0;
        int second = 0 ;
        int third = 0;
        for(int i:arr){
            if(i>first) {
                third = second;
                second = first;
                first = i;
            }else if(i<third&&i>second){
                third=i;
            }
        }
        System.out.println("Third greatest element in an array is:"+third);
    }
}

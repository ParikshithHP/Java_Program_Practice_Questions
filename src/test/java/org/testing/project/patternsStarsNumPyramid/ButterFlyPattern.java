package org.testing.project.patternsStarsNumPyramid;

public class ButterFlyPattern {
    public static void main(String[] args){
        /*
         *              BUTTERFLY pattern
         *
         *              *      *
         *              **    **
         *              ***  ***
         *              ********
         *              ********
         *              ***  ***
         *              **    **
         *              *      *
         */


        int n=5;
        for(int row=0;row<2*n;row++){
            int colsNum = row>5?2*n-row:row;
            for(int col=1;col<=colsNum;col++){
                System.out.print("*");
            }
            for(int sp=colsNum;sp<n;sp++){
                System.out.print("  ");
            }
            for(int col=1;col<=colsNum;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

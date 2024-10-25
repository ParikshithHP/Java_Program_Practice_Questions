package org.testing.project.patternsStarsNumPyramid;

public class CubeStar {
    public static void main(String[] args){
        /*
         * * * *
         * * * *
         * * * *
         * * * *
         */

        for(int row=4;row>0;row--){
            for(int j=0;j<4;j++){
                System.out.print("* ");// to print the stars
            }
            System.out.println();//spaces
        }
    }
}

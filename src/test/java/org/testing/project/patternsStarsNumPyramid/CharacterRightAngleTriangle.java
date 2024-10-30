package org.testing.project.patternsStarsNumPyramid;

public class CharacterRightAngleTriangle {
    public static void main(String[] args){
        // A
        // BB
        // CCC
        // DDDD
        // EEEEE


        int n=5;
        char ch ='A';
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}

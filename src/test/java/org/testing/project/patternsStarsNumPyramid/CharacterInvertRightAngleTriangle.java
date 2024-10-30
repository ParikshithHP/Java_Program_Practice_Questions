package org.testing.project.patternsStarsNumPyramid;

public class CharacterInvertRightAngleTriangle {
    public static void main(String[] args){
        // ABCDE
        // ABCD
        // ABC
        // AB
        // A

        int n=5;
        for(int row=1;row<=n;row++){
            char ch ='A';
            for(int col=row;col<=n;col++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

package org.testing.project.patternsStarsNumPyramid;

public class NumberStarPyramid {
    void main(){
        /*
        -----------------------
                     1
                   1   2
                 1   2   3
               1   2   3   4
             1   2   3   4   5
        -----------------------

        */
        int n=5;
        for(int row=0;row<=n;row++){
            for(int sp=n;sp>row;sp--){
                System.out.print("  ");
            }
            for(int col=1;col<=row;col++){
                System.out.print(col+"   ");
            }
            System.out.println();
        }
    }
}

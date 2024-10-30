package org.testing.project.patternsStarsNumPyramid;

public class HollowRectangle {
    public static void main(String[] args) throws Exception {

    /*
                HOLLOW RECTANGLE pattern
                        *****
                        *   *
                        *   *
                        *****

    */
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for(int col=1;col<=n;col++){
                if((row==1||col==1)||(col==n||row==n)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

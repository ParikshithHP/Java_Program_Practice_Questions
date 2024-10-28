package org.testing.project.patternsStarsNumPyramid;

public class PyramidStar {

    public static void main(String[] args){
        // Equilateral Triangle

/*
-------------------
        *
      *   *
    *   *   *
  *   *   *   *
*   *   *   *   *
-------------------
*/

        int n=5;
        for(int row=0;row<=n;row++){
            for(int sp=n;sp>row;sp--){
                System.out.print("  ");
            }
            for(int col=0;col<row;col++){
                System.out.print("*   ");
            }
            System.out.println();
        }







    }
}

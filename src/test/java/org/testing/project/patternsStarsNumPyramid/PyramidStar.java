package org.testing.project.patternsStarsNumPyramid;

public class PyramidStar {

    public static void main(String[] args){
        // Equilateral Triangle

/*
------------------------------------------
        *                       1
      *   *                   1   2
    *   *   *               1   2   3
  *   *   *   *           1   2   3   4
*   *   *   *   *       1   2   3   4   5
------------------------------------------
*/

        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print("*");
            }
            System.out.print();
        }







    }
}

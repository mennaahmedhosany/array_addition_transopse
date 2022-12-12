/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additionandtranspose_matrix;

import java.util.Scanner;

/**
 *
 * @author ORIGINAL
 */
public class Additionandtranspose_matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        Scanner input=new Scanner(System.in);
         int [][] fristmatrix =
        {
        {1,3,4},
        {3,4,5},
        {5,6,7}};
         int [][] secondmatrix=
         {{4,5,6},
          {5,6,7},
          {6,7,8} };
         int product[][]=new int [3][3];
         int transpose[][]=new int[3][3];
              for(int raw=0; raw<fristmatrix.length;raw++)
        {
              for(int col=0; col<fristmatrix[0].length;col++)
          {
              for(int k=0; k<fristmatrix[0].length;k++)
              {
               product[raw][col]+= fristmatrix[raw][k]*secondmatrix[k][col] ; 
              }
              System.out.println(product[raw][col]);
          }
        }
              
       for(int raw=0; raw<product.length;raw++)
       {
       for(int col=0; col<product[0].length;col++)
       {
           transpose [col][raw]=product[raw][col];
       }
       }
       for(int raw=0; raw<product.length;raw++)
       {
       for(int col=0; col<product[0].length;col++)
       {
            System.out.println(transpose[raw][col]);   
       }
       }
    }
    
}

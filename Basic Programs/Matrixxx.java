package Sakthi;

import java.util.Arrays;
import java.util.Scanner;

public class Matrixxx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row:-");
        int r=sc.nextInt();
        System.out.print("Enter col:-");
        int c=sc.nextInt();
      int mat[][]=new int[r][c];
      for(int i=0;i< mat.length;i++){
          for (int j=0;j< mat[i].length;j++){
              mat[i][j]=sc.nextInt();
          }
      }
      int vv=0;
      int zz=c-1;
      for(int i=0;i< mat.length;i++){
          for(int j=0;j<mat[i].length;j++){
              if(j==vv&&i==vv) {
                  System.out.print(mat[j][zz] + " ");
                  vv++;
                  if(j==zz){
                      zz--;
                  }
              }
              else if(j==zz){
                  System.out.print(mat[i][i]+" ");
                  zz--;
              }
              else{
                  System.out.print(mat[i][j]+" ");
              }

          }
          System.out.println();
      }
//      for (int i=0;i< mat.length;i++){
//          System.out.println(Arrays.toString(mat[i]));
//      }
//        for (int []k:mat) {
//            System.out.println(Arrays.toString(k));
//
//        }

    }
}

//1 2 3
//4 5 6
//7 8 9
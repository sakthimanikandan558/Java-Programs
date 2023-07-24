package Sakthi;

import java.util.Scanner;

public class Skillrack2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]mat=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int s=sc.nextInt();
        int e=sc.nextInt();
        int i=0;
        int j=0;
        int row=s-1;
        int col=e-1;
        int t=0;
        while(row<r&&col<c){
            toSum(i,j,row,col,mat);
            if(col+e<c){
                //i=row+1;
                j=col+1;
                col=col+e;
                //row=row+e;

            }
        }

    }

    static void toSum(int i,int j,int row,int col,int mat[][]) {
        int sum=0;
        for(int x=i;x<=row;x++){
            for(int y=j;y<=col;y++){
                sum+=mat[x][y];
            }
        }
        System.out.print(sum+" ");

    }
}

package Sakthi;
import java.util.Scanner;
public class SkillRack4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]mat=new int[r][c];
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if(mat[i][j]==0){
                    int d=isZero(mat,i,j,r,c);
                    if(d==1)
                        count++;
                }
            }
        }
        System.out.print(count);
    }
    public static int isZero(int mat[][],int h,int p,int r,int c){
        for(int i=0;i<c;i++){
            if(i!=p&&mat[h][i]==0){
                return 0;
            }
        }
        for(int i=0;i<r;i++){
            if(i!=h&&mat[i][p]==0){
                return 0;
            }
        }
        return 1;
    }
}

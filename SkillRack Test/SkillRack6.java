package SRack;

import java.util.Scanner;

public class SkillRack6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[]val=str.split(",");
        int len=val.length;
        if(len==3){
            System.out.println(val[0]);
            System.out.println(val[1]+" "+val[2]);
            return;
        }
        int h=3,v=3,res=0;
        while(h!=len){
            if(h+v==len){
                res=h;
            }
            h=h+v;
            v++;
        }
        int n=len-res;
        String [][]mat=new String[n][n];
        int x=-1,y=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>x){
                    mat[j][i]=val[y];
                    y++;
                }
            }
            x++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=null)
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

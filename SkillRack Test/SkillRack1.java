package SRack;
import java.util.Scanner;
public class SkillRack1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String []val=str.split("\\s");
        int max=Integer.parseInt(val[0]);
        int min=Integer.parseInt(val[0]);
        for(int i=1;i<val.length;i++){
            int k=Integer.parseInt(val[i]);
            if(k>max){
                max=k;
            }
            if(k<min){
                min=k;
            }
        }
        int []hash=new int[max+1];
        for(int i=0;i<val.length;i++){
            int h=Integer.parseInt(val[i]);
            hash[h]++;
        }
        int res=0;
        for(int i=min;i<max+1;i++){
            if(hash[i]>0){
                res++;
            }
        }
        System.out.print(res);
    }
}

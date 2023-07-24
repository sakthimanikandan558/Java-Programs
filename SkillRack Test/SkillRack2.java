package SRack;
import java.util.Scanner;
public class SkillRack2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String []val=str.split("\\s");
        float res=0;
        for(int i=0;i< val.length-2;i++){
            if(i==0) {
                int n1 = Integer.parseInt(val[i]);
                int n2 = Integer.parseInt(val[i + 1]);
                int n3 = Integer.parseInt(val[i + 2]);
                float tot=(n1+n2+n3)/3;
                res=tot;
            }
            else{
                int n1 = Integer.parseInt(val[i]);
                int n2 = Integer.parseInt(val[i + 1]);
                int n3 = Integer.parseInt(val[i + 2]);
                float tot=(n1+n2+n3)/3;
                if(tot<res){
                    res=tot;
                }
            }
            //System.out.print(res);
        }
        System.out.printf("%.2f",res);
    }
}

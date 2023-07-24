package SRack;
import java.util.Scanner;
public class SkillRack3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String [] val=str.split("\\s");
        int []a=new int[val.length];
        int kk=0;
        for(String s:val){
            a[kk++]=Integer.parseInt(s);
        }
        int b=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int m1=a[i]*a[j];
                for(int k=0;k<a.length;k++){
                    for(int l=k+1;l<a.length;l++){
                        int m2=0;
                        if(k!=i&&k!=j&&l!=i&&l!=j){
                            m2=a[k]*a[l];
                        }
                        if(m1==m2){
                            System.out.print(m2);
                            b++;
                            break;
                        }
                    }
                    if(b!=0){
                        break;
                    }
                }
                if(b!=0){
                    break;
                }
            }
            if(b!=0){
                break;
            }
        }
    }
}

package SRack;
import java.util.Scanner;
public class SkillRack7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[]str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.println(findC(str[i]));
        }
    }
    private static int findC(String s) {
        int c=s.length(),fact=s.length()-1;
        int con=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                con++;
            }
        }
        int k=fact-con,res,t=1,v=1;
        for(int i=0;i<k;i++){
            t=t*v;
            v++;
        }
        c=c+t;
        return c;
    }
}

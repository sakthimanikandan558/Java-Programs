package Sakthi;
import java.util.Arrays;
import java.util.Scanner;
public class SkillRackTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String []val=str.split("[+-]");
        int tot=0;
        int hh=1;
        tot=tot+Integer.parseInt(val[0]);
        //System.out.print(Arrays.toString(val));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)=='+'){
                tot=tot-Integer.parseInt(val[hh]);
                hh++;
            }
            if(str.charAt(i)=='-'){
                tot=tot+Integer.parseInt(val[hh]);
                hh++;
            }
        }
        System.out.print(tot);
    }
}

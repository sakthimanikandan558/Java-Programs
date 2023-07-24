package Sakthi;

import java.util.Scanner;

public class FindSub{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1="manager";
        String str2="agegomanage";
        String gg= String.valueOf(str2.charAt(0));
        //System.out.print(gg);
        int t=0;
        int hh=1;
        int v=2;
        for(int i=2;i<str2.length();i++) {
            String re=str2.substring(t,i);
            //gg = gg + String.valueOf(str2.charAt(i));
            if(str1.contains(re)){
                v++;
                hh++;
            }
            else if(hh!=1){
                System.out.print(str2.substring(t,hh));
                t=i;
                hh=1;
            }


        }
    }
}

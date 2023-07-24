package Sakthi;

import java.util.ArrayList;
import java.util.Scanner;

public class SkillRack1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //sc.nextLine();
        int r=sc.nextInt();
        int c=sc.nextInt();
        String []val=str.split("\\s");
        ArrayList<Character> list=new ArrayList<>();
        for(String s:val) {
            char ch=s.charAt(s.length()-1);
            String  ss=s.substring(0, s.length()-1);
            int n=Integer.parseInt(ss);
            for(int i=0;i<n;i++){
                list.add(ch);
            }
        }
        int hh=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               System.out.print(list.get(hh++)+" ");
            }
            System.out.println();
        }
    }
}

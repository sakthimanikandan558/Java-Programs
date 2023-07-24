package Sakthi;

import java.util.Scanner;

public class Skillrack3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String []val=str.split("\\s");
        for(int i=0;i<str.length();i++){
            for(int j=0;j< val.length;j++){
                if(i<val[j].length()){
                    System.out.print(val[j].charAt(i));
                }
            }
            System.out.print(" ");
        }
    }
}

package Sakthi;

import java.util.Arrays;
import java.util.Scanner;

public class Splitfun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(Arrays.toString(str.split(("[?<=aeiouAEIOU]"))));
        //System.out.println(Arrays.toString(str.split("(?<=[aeiou])")));

    }
}

package Sakthi;

import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
      //  Scanner sc=new Scanner(System.in)
        fun(6,4,4,3,2,1,7);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

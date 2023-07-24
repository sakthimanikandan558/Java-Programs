package recursion;

import java.util.Scanner;

public class ZeroCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=count(n);
        System.out.println(res);
    }
    public static int count(int n){
        return helper(n,0);
    }
    public static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int k=n%10;
        if(k==0){
            return helper(n/10,++c);
        }
        return helper(n/10,c);
    }
}

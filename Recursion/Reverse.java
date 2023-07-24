package recursion;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        toRev(n);
        System.out.println(rev);
    }
    static int rev=0;
    public static void toRev(int n){
        if(n==0){
            return;
        }
        int s=n%10;
        rev=rev*10+s;
        toRev(n/10);
    }
}

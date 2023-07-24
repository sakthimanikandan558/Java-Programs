package recursion;
import java.util.Scanner;
public class SumOfDig {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        //int res=findSum(n);
        int res1=findPro(n);
        System.out.println(res1);
    }
    public static int findSum(int n){
        if(n==0){
            return 0;
        }
        return n%10+findSum(n/10);

    }
    public static int findPro(int n){
        if(n==0){
            return 1;
        }
        return n%10*findPro(n/10);

    }
}

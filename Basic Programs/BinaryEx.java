package Sakthi;

import java.util.Scanner;

public class BinaryEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array size:");
        int n=sc.nextInt();
        System.out.print("Enter Array Elements:");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter Target Value:");
        int target=sc.nextInt();
        int res=binaryFun(a,target);
        System.out.println("Target Index is:"+res);

    }
    static int binaryFun(int a[],int t){
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(t>a[mid]){
                start=mid+1;
            }
            else if(t<a[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }


        }
        return -1;

    }

}

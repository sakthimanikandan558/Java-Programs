package SRack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class SkillRack5 {
    public static void main(String[] args) {
        HashMap<String,Integer>hash1=new HashMap<>();
        ArrayList<String>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String str=sc.nextLine();
            String val[]=str.split("\\s");
            hash1.put(val[0],1);
            for(int j=2;j<val.length;j++) {
                list.add(val[j]);
            }
        }
        for(int i=0;i<list.size();i++){
            if(!hash1.containsKey(list.get(i))){
                System.out.print(list.get(i)+" ");
            }
        }
    }
}

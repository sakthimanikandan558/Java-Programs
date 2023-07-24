package SRack;
import java.util.HashSet;
import java.util.Scanner;
public class SkillRack8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashSet<Character>hash=new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!hash.contains(ch)){
                System.out.print(ch);
                hash.add(ch);
            }
            else{
                hash.remove(ch);
            }
        }
    }
}

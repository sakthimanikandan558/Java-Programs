package Sakthi;

public class exHandling {
    public static void main(String[] args) {
        int a=99,b=10;
        try{
            res(a,b);
        }
        catch (ArithmeticException e){
            System.out.println("jjosj");
        }
    }
    public static int res(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }
}

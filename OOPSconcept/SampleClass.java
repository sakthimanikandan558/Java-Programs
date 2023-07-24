package oopconcept;

public class SampleClass {
    static String name="sa";
    int rollno=90;
    int mark=10;
    public static int pop=1;

    public SampleClass(String name, int rollno, int mark) {
        this.name = name;
        this.rollno = rollno;
        this.mark = mark;
        pop++;
    }


//    public void print(){
//        System.out.println();
//    }
    public void printf(){
        System.out.println(this.name);
    }

}

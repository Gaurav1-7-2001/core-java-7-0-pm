package oops.abstraction;

public class ChildClass extends Demoabstract {


    @Override
    public void m1() {
        System.out.println("this m1 method of abstract class . and override int the child class");
    }

    public static void main(String args[]){

        ChildClass obj =new ChildClass();
        obj.m1();
        obj.m2();
    }
}

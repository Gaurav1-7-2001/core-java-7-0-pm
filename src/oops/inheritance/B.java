package oops.inheritance;

public class B  extends A{

    public static void main(String[] args) {

        B obj =new B();
        obj.m1();
        obj.m2();

        System.out.println("Access the data member(name) of the parent class :"+obj.name);
        System.out.println("access the data member (age) of the parent class :"+obj.age);
    }
}

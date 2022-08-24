package oops.INTERFACE.multipleInheritance;


// todo : In class we can make multiple parent (interface only) using keyword =>(implements)
//       if we try to make multiple parent (for class) we have to face diamond Problem

public class MultipleInheritance implements MyInterface1,MyInterface2,MyInterface3,MyInterface4{
    @Override
    public void m1() {
        System.out.println("this is m1");
    }

    @Override
    public void m2() {
        System.out.println("this is m2");
    }

    @Override
    public void m3() {
        System.out.println("this is m3");
    }

    public static void main(String[] args) {

        MultipleInheritance obj =new MultipleInheritance();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}

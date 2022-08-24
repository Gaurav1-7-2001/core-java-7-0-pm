package oops.INTERFACE.multipleInheritance;


//todo : we can access all the method of the interface using keyword :(implement) in the class
public class InheritanceOfInterface implements MyInterface4{
    @Override
    public void m1() {
        System.out.println("this is m1 by interface4 as a child interface");
    }

    @Override
    public void m2() {
        System.out.println( "this is m2 by interface4 as a child interface");
    }

    @Override
    public void m3() {

        System.out.println(" this is m3 by interface4 as a child interface");
    }
}

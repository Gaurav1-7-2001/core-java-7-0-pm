package oops.INTERFACE;

public class ChildImp implements DemoInterface {



    //todo : at the time of overloading of method we cannot change in method signature
    //          only  we can do change inside the method

    // todo : after overriding   we can use only public access modifier

    @Override
    public void m1() {
        System.out.println( " print  method from m1");
    }

    @Override
    public void m2() {
        System.out.println("print method from m2");
    }

    @Override
    public void m3() {
        System.out.println("print method from m3");
    }

    @Override
    public void m4() {

    }

    public static void main(String args[]){

        ChildImp obj = new ChildImp();

        obj.m1();
        obj.m2();
        obj.m3();
    }
}

package oops.INTERFACE;

public class ChildImp implements DemoInterface {


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

    public static void main(String args[]){

        ChildImp obj = new ChildImp();

        obj.m1();
        obj.m2();
        obj.m3();
    }
}

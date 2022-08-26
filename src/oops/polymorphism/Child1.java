package oops.polymorphism;

public class Child1 extends MethodOverriding{

    public void m1(int age ){
        System.out.println(" this is method of CHILD CLASS..."+age);
    }
    public void m2(String name){
        System.out.println("this is method  m2 of child class.."+name);
    }

    public static void main(String[] args) {

        Child obj= new Child();
        obj.m1();

        MethodOverLoading obj1= new MethodOverLoading();
                obj1.m1("gaurav");



    }

}

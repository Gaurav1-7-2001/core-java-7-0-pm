package oops.polymorphism.assign;

import oops.polymorphism.MethodOverriding;

public class Child extends DemoOverriding{

    public void m1(){
        System.out.println(" this is method m1 in child class");
    }
    public void m2(){

        System.out.println("this is method m2 in child class");
    }

    public static void main(String[] args) {

     DemoOverriding obj =new Child();
     obj.m1();
     obj.m2();

     DemoOverriding obj1 =new DemoOverriding();
     obj1.m2();
    obj1.m1();
    obj1.m2();


    }

}

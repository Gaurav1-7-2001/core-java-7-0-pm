package oops.inheritance;

public class A {


    /*
     todo :        1-Encapsulation
               Binding Data member and member function into single unit called encapsulation.

           todo:  2-Inheritance
                  inheritance is a process by which a class can share data member and method with    Child Class

           todo:    class A   <--------- relation(Parent-Child)--------->  class B
                    class B(Child) extends  Class A(Parent)
*/


    String name ="gaurav baghel";
    int age =22;

    public void m1(){

        System.out.println("this is call from m1 method");
    }

    public void m2(){
        System.out.println("this method call from m2 method");
    }
}

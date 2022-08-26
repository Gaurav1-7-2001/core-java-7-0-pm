package oops.polymorphism;

//  todo :=> PolyMorphism :  it's a greek work
//        Poly : Many
//        Morphism: Forms
//      ==>  Same operation is applied on different different data.

public class MethodOverLoading {


//  todo :  Compile time polymorpshism
//         ==> we can achieve compile time polymorphism by MethodOverloading
//         Syntax : access_specifier return_type  method_name (parameter) {CODE..}
//    ==> same method signature but  Overload by changing input parameter
//     ==> Method Overloading will happen in same class

    public void m1(){
        System.out.println("Method without input parameter");
    }

    // overload m1 by changing input parameter
    public void m1(int age){
        System.out.println(" Method with input parameter age ");
    }

    //overload m1 again by changing input parameter
    public void m1(String name){
        System.out.println("Method with input parameter name");
    }

    public static void main(String args[]){

        MethodOverLoading obj =new MethodOverLoading();

       //todo : in compile time polymorphism we already known which method is going to execute
        obj.m1();
        obj.m1(22);
        obj.m1("gaurav");
    }

}

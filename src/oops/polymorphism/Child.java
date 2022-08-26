package oops.polymorphism;

// todo :-> Runtime Polymorphism
//      override same method in child class
//      override : change in method body


//todo : at the time of overloading of method we cannot change in method signature
//          only  we can do change inside the method

// todo : after overriding   we can use only public access modifier


public class Child  extends MethodOverriding{

    // OVER RIDING M1 IN CHILD CLASS
    public void m1(){
        System.out.println("this is method m1 CHILD CLASS..");
    }

    //OVER RIDING M2 IN CHILD CLASS
    public void m2(int age){
        System.out.println("this is method m2 from CHILD CLASS..");
    }

    public static void main(String[] args) {

        //todo : thumb rule is ==>whatever object is getting created it will call that class Method Only

        //parent object
        MethodOverriding obj =new MethodOverriding();
        obj.m1();// it call parent method because we create the object of parent class(MethodOverriding)

        MethodOverriding obj1 =new Child();
        obj1.m2(); // todo : it call Child method because we create the object of Child class(Child) with parent reference variable

        Child obj2 =new Child();
        obj2.m2();
//     todo :we cannot store the parent object in child reference
//      it will give compile time error
//      Child obj2 =new MethodOverriding();
//        obj2.m1();



    }


}

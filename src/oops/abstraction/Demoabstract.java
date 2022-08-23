package oops.abstraction;

public abstract class Demoabstract {


    // todo : abstraction =>hiding internal information

//    todo : SYNTAX => access_modifier abstract return_type Method _Name();

//    todo : abstract class =>A class having atleast one abstract method or declare with abstract keyword

// todo : can be create object of abstract class? NO , we cannot create object of abstract class
//  Reason : if we try to create object and call the abstract method then jvm will not able to find method
//  code which should get executed
//   ==> child class override abstract method and use as per thier requirement



    public abstract void m1(); //abstract method

    public void m2(){
        System.out.println("this is normal method inside  the abstract class");
    }

    public static void main(String args[]){

//    Demoabstract obj =new Demoabstract();
}

}

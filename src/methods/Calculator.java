package methods;

public class Calculator {

    public void sum(){
        int a=3;
        int b=5;
        System.out.println(" Sum of two number is :"+(a+b));
    }

    public void sub(){
        int a=9;
        int b =4;

        System.out.println("Subtract of two number is :"+(a-b));

    }

    public void mul(){
        int a=4;
        int b=3;
        System.out.println(" Multiply of two number is :"+ (a*b));
    }

    public void division(){

        int a=9;
        int b=2;

//        type casting
        double div = (double)a/b;
        System.out.println("Division of two number is :"+div);


    }


    public static void main(String[] args) {

        Calculator obj =new Calculator();
        obj.sum();
        obj.sub();
        obj.mul();
        obj.division();
    }
}

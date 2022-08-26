package oops.polymorphism;

//  todo :-> Runtime Polymorphism
//     override same method in child class
//     override : change in method body

public class   MethodOverriding {

    public void m1(){
        System.out.println("This is m1 method of MethodOverriding clas");
    }
    public void m2(){
        System.out.println("this is m2 method of  method overriding class ");
    }
    private void m3(){
        System.out.println("this is m3 private method ");
    }

    protected void m4(){

        System.out.println("this is protected method m4");
    }
    public static void main(String[] args) {

        MethodOverriding obj =new MethodOverriding();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}

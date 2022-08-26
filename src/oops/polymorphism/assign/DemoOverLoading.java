package oops.polymorphism.assign;

public class DemoOverLoading {

    public void m1(){
        System.out.println("this is empty method");
    }

    //    we use int as return type

    private int  m1(int age ){
        System.out.println("print age"+age);
        return age;
    }




    public static  void m1( byte ch){
        System.out.println("byte"+ch);

    }
    //we use static keyword in m1 method
    public static void m1(int age,int id){

        System.out.println("print age"+age + " id :"+id);
    }




    // we create the object of the class and access all the method
    public static void m1(String name) {
        DemoOverLoading obj = new DemoOverLoading();
        obj.m1();
        obj.m1(22);
        obj.m1(22, 11);

    }


     public static void main(String args[]) {

        DemoOverLoading obj =new DemoOverLoading();
        obj.m1();

        obj.m1("gaurav");

    }

}

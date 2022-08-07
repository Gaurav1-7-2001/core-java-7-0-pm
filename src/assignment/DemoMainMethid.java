package assignment;

public class DemoMainMethid {

    public void message(){

        System.out.println("gaurav");
    }

    public static void main(String s){

        System.out.println("print name:"+s);
    }

    public static void main(int age){


        System.out.println("age is:"+age);
    }

    public static void main(String[] args) {

        DemoMainMethid obj= new DemoMainMethid();

        obj.main(656);
    }

}

package oops.inheritance.assignment;

public class ChildClass extends ParentClass{

    public static void main( String args[]){

        ChildClass obj =new ChildClass();
        obj.study();
        obj.coding();

        System.out.println("print data :"+obj.name);
        System.out.println("print data :"+obj.dept);
    }
}

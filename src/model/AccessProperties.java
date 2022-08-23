package model;

public class AccessProperties {

    public static void main(String[] args) {

//        AccessProperties obj =new AccessProperties();

        Student1 obj1 =new Student1("gaurav","cs" ,100);
        Student1 obj2 =new Student1( "gaurav 1","mechnaical" ,101);

        System.out.println("print data :" +obj1.getName() +" dept :"+obj1.getDept()+ " id :"+obj1.getId());
    }
}

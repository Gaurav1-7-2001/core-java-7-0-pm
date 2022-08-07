package methods;

public class Student {

    String name;
    int id;
    int age;


    //todo : Access_modifier return_type methodName(parameter){code}

    public void studyMethod(){

        System.out.println(" this is study method");
    }

    public void eatMethod(){

        System.out.println("this is a eat method ");
    }

    public void coding(){
        System.out.println("this is coding method");
    }

    public static void main(String[] args) {

        Student obj =new Student();

        obj.studyMethod();
        obj.eatMethod();
        obj.coding();


    }

}

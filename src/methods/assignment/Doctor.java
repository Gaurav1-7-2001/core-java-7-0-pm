package methods.assignment;

public class Doctor {

    String name;
    String dept;
    int id;

    public void checkup(){

        System.out.println("this is a check up method");
    }

    public void eatMethod(){

        System.out.println("this is a eat method");
    }

    public void visitMethod(){

        System.out.println("this is visit method ");
    }

    public static void main(String[] args) {

        Doctor obj =new Doctor();

        obj.eatMethod();
        obj.checkup();
        obj.visitMethod();
    }


}

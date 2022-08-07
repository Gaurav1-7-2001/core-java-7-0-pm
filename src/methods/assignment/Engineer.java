package methods.assignment;

public class Engineer {

    public void studyMethod(){
        System.out.println( "this is a study method");
    }

    public void developer(){

        System.out.println("this is a developer method ");
    }

    public void  repairMethod(){

        System.out.println("this is a repair method");
    }

    public void WriteMethod(){

        System.out.println("this is a write method");
    }

    public static void main(String[] args) {

        Engineer obj = new Engineer();
        obj.developer();
        obj.studyMethod();
        obj.repairMethod();
    }

}

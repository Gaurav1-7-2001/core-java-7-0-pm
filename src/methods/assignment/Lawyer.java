package methods.assignment;

public class Lawyer {

    public void hearingMethod(){

        System.out.println("this is method of hearing method of lawyer.." );
    }

    public void agreement(){

        System.out.println("this is a agreement Method of lawyer");
    }

    public void caseMethod(){

        System.out.println( "this is case method of lawyer");
    }

    public static void main(String[] args) {

        Lawyer obj =new Lawyer();

        obj.agreement();
        obj.hearingMethod();
        obj.caseMethod();

    }
}

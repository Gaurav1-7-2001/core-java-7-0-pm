package class__object.assignment;

public class Engineer {

    String name = "Gaurav Baghel";
    int salary = 70000;
    String work = "Software Developer";
    int id =1;

    public static void main( String args[]){

        Engineer obj1 =new Engineer();

        System.out.println( "Name of Engineer is :" +obj1.name);
        System.out.println( "Salary of Engineer is :" +obj1.salary);
        System.out.println( "Work of Engineer is :" +obj1.work);
        System.out.println(" ID of Engineer is :" +obj1.id);

    }

}

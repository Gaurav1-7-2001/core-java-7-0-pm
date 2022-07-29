package class__object.assignment;

public class Doctor {

    String name= "Dr. Ankit pal";
    int salary =65000;
    String dept ="surgion";
    int id = 1;

    public static void main(String[] args) {


        Doctor obj1 = new Doctor();
        System.out.println(" Name of Doctor is :" +obj1.name);
        System.out.println(" salary of Doctor is :" +obj1.salary);
        System.out.println(" Department of Doctor s :" +obj1.dept);
        System.out.println( " ID of Doctor is :" +obj1.id);
    }


}

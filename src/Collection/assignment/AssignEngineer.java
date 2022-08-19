package Collection.assignment;

import com.sun.xml.internal.org.jvnet.fastinfoset.sax.FastInfosetReader;
import model.Engineer;

import java.util.ArrayList;
import java.util.Scanner;

public class AssignEngineer {

    public ArrayList<Engineer> create_engineer() {

        // todo : ArrayList<DataType> obj_name =new ArrayList();
        ArrayList<Engineer> list = new ArrayList<>();

        String choice = "y";
        while (choice.equals("y")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your name");
            String name = sc.nextLine();

            System.out.println("enter dept ");
            String dept = sc.nextLine();

            System.out.println("enter salary");
            Scanner sc1 = new Scanner(System.in);
            int salary = sc1.nextInt();

            System.out.println("enter id");
            int id = sc1.nextInt();


            //todo : make object  Engineer(Class)
            Engineer eng = new Engineer(name, dept, salary, id);

            list.add(eng);

            System.out.println("press y to continue and press any key to exit:");
            choice =sc.nextLine();
        }

        return list;
    }


    public static void main(String []args){

        AssignEngineer obj =new AssignEngineer();
        ArrayList<Engineer> engineers= obj.create_engineer();

        for (Engineer var:engineers){
            System.out.println("Name :" +var.getName() +" dept :"+var.getDept() +" salary: "+var.getSalary() +"id :"+var.getId());

        }
    }

}

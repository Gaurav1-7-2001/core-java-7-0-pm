package Collection.ArrayList;

import model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeArrayList {

    public ArrayList<Employee> CreateEmployeeArrayList() {

        // todo : collection <datatype> obj_name =new collection()

        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        String choice = "y";
        int i = 0;
        while (choice.equals("y")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter name :");
            String name = sc.nextLine();

            System.out.println(" enter id");
            int id = sc.nextInt();

            System.out.println("enter salary");
            int salary = sc.nextInt();

            System.out.println("enter dept");
            Scanner sc1 = new Scanner(System.in);
            String dept = sc1.nextLine();

//            System.out.println("press y to continue and press any key to exit");
//            Scanner sc2 = new Scanner(System.in);
//            choice = sc2.nextLine();


            // create obj of Employee

            Employee emp1 = new Employee(name, id, salary, dept);


            //add obj in list

            employeeArrayList.add(emp1);


            System.out.println("press y to continue and press any key to exit");
            Scanner sc2 = new Scanner(System.in);
            choice = sc2.nextLine();

        }
            return employeeArrayList;


    }

    public static void main(String[] args) {

        EmployeeArrayList obj =new EmployeeArrayList();
        ArrayList<Employee> emp=obj.CreateEmployeeArrayList();

        //advance loop

        for (Employee var: emp){
            System.out.println("print employee list:"+var.getName() +" Id:"+var.getId() +" Salary :"+var.getSalary() +" dept"+var.getDept());
        }

    }

}

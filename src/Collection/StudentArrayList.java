package Collection;

import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {

    public ArrayList<Student> createStudentArrayList(){

        // todo : collection <Datatype> obj_name = new Collection();

        ArrayList<Student> studentArrayList = new ArrayList<>();

        //Create Student object

        Scanner sc =new Scanner(System.in);
        System.out.println("enter name");
        String name= sc.nextLine();

        System.out.println("enter age");
        int age =sc.nextInt();

        System.out.println("enter section");
        Scanner sc1 =new Scanner(System.in);
        String section =sc1.nextLine();

        Student student = new Student(name,age,section);
        Student student1 = new Student("ram",23,"it");
        Student student2 = new Student("raj",24,"cs");
        Student student3 = new Student("raju", 25,"it");
        Student student4 = new Student(name,age,section);

        // add object in list

        studentArrayList.add(student);
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        return studentArrayList;
    }

    public static void main(String[] args) {

        StudentArrayList obj =new StudentArrayList();
        ArrayList<Student> students =obj.createStudentArrayList();

        //advance loop

        for (Student var : students){
            System.out.println(" print student list:"+var.getName() +" Age :"+var.getAge() +" Section :"+var.getSection() );
        }

    }
}

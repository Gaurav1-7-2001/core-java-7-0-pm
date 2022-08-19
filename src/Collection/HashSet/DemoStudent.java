package Collection.HashSet;

import model.Student;

import java.util.HashSet;

public class DemoStudent {

    //todo :     hash set does not print duplicate value
//                      HashSet : it never stores Duplicates
//                      Every Object has HashCode(having Integer value) : Unique number
//                      HashSet does not mantain insertion order


    public HashSet<Student> create_student(){

        HashSet<Student> details =new HashSet<>();

        //user defined object
        Student std =new Student("gaurav",22,"java developer");
        System.out.println("print hascode of s :"+std.hashCode());

        Student std1 =new Student("baghel sahab",23 ,"microservices developer");
        System.out.println("print hash code of s1 :"+std1.hashCode());

        Student std2 =new Student("samyak" ,22," spring boot");
        System.out.println("print hash code of s2 :"+std2.hashCode());

        Student std3 =new Student("rahul",23,"java developer");
        System.out.println("print hash code of s3 :"+std3.hashCode());

        Student std4 =new Student("gaurav" ,22," spring boot");
        System.out.println("print hash code of s4 :"+std4.hashCode());

        //add the user defined in HashSet
        details.add(std);
        details.add(std1);
        details.add(std2);
        details.add(std3);
        return details;
    }



    public static void main(String[] args) {

        DemoStudent obj =new DemoStudent();

        //call the create_student method and store in a variable
              HashSet<Student> details =obj.create_student();

              //print data by advance loop
        for (Student var: details){
            System.out.println("print data :"+var.getName() +" Age:"+var.getAge() +" section:"+var.getSection());
        }
    }
}

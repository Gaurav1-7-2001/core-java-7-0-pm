package Collection.HashSet;

import model.Student;
import java.util.LinkedHashSet;
public class Linkedhashset {

    //todo :     LinkedHashSet does not print duplicate value
//                      LinkedHashSet : it never stores Duplicates
//                      Every Object has HashCode : Unique number
//                      LinkedHashSet  mantain insertion order


    public LinkedHashSet<Student> createLinkedHashSet(){

    LinkedHashSet<Student> details =new LinkedHashSet<>();

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

        Student std5 =new Student("gaurav" ,22," spring boot");
        System.out.println("print hash code of s5 :"+std5.hashCode());

        //add the user defined in HashSet
        details.add(std);
        details.add(std1);
        details.add(std2);
        details.add(std3);
        details.add(std4);
        details.add(std5);

        return details;

    }

    public static void main(String[] args) {

        Linkedhashset obj =new Linkedhashset();
         LinkedHashSet<Student>details =obj.createLinkedHashSet();

        for (Student var: details){
            System.out.println("print details => "+var.getName() +" Age :"+var.getAge() +" Section :"+var.getSection());
        }

    }
}

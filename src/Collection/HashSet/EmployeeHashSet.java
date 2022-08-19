package Collection.HashSet;

import model.Employee;

import java.util.HashSet;

public class EmployeeHashSet {

    public HashSet<Employee> employeeHashSet(){

        HashSet<Employee> hashSet =new HashSet<>();

        //make object of user defined object
        Employee emp =new Employee("gaurav",100,900000,"java developer");
        System.out.println("hash code of s:"+emp.hashCode());

        Employee emp1 =new Employee("baghel",101,920000,"microsevices devloper");
        System.out.println("hash code of s1 :"+emp1.hashCode());

        Employee emp2 =new Employee("rohit",102, 930000,"Spring boot");
        System.out.println("hash code of s2 :"+emp2.hashCode());

        Employee emp3 =new Employee("gaurav",100 ,940000," developer");
        System.out.println("hash code of s3 :"+emp3.hashCode());

        Employee emp4 =new Employee("gaurav",10,900000,"java developer");
        System.out.println("hash code of s4 :"+emp4.hashCode());
        //add in the hashset
        hashSet.add(emp);
        hashSet.add(emp1);
        hashSet.add(emp2);
        hashSet.add(emp3);
        hashSet.add(emp4);

        return hashSet;
    }

    public static void main(String[] args) {

        EmployeeHashSet obj =new EmployeeHashSet();

         HashSet<Employee> hashSet=obj.employeeHashSet();

         for (Employee var: hashSet){
             System.out.println("print details:"+var.getName() +" id:"+var.getId() +" salary :"+var.getSalary() +" dept:"+var.getDept());
         }
    }
}

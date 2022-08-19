package Collection.hashMap;

import model.Employee;

import java.util.HashMap;

public class EmployeeHashMap {

    public HashMap<Integer, Employee> createEmployeeHashMap(){

//     todo :   HashMap<Integer_key, Employee_value> map =new HashMap<>();

        HashMap<Integer, Employee> map =new HashMap<>();

        //make object of Employee onject

        Employee emp= new Employee("Gaurav",100,9000000,"java developer");
        Employee emp1= new Employee("Sam",101,9000200,"cloud dept");
        Employee emp2= new Employee("Gau1",103 ,940000, "microservices");
        Employee emp3 =new Employee("Gau2" ,103 ,930000,"DEvops");

    //adding in the map

        map.put(0 ,emp);
        map.put(1 ,emp1);
        map.put(2 ,emp2);
        map.put(3 ,emp3);

        return map;

    }

    public static void main(String[] args) {

        EmployeeHashMap obj =new EmployeeHashMap();
        HashMap<Integer,Employee> map=obj.createEmployeeHashMap();

        for (Integer var: map.keySet()){

            System.out.println("printing data :"+map.get(var).getName() +" ID :"+map.get(var).getId() +" Salary :"+map.get(var).getSalary() +" DEpt :"+map.get(var).getDept());
        }
    }
}

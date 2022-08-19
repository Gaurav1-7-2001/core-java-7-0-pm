package Collection.hashMap;

import model.Student;

import java.util.HashMap;

public class StudentHashMap {

    public HashMap<Integer,Student> createStudentHashMap(){

// todo:       HashMap<Integer_key ,Student_value> map =new HashMap<>();

        HashMap<Integer,Student> map=new HashMap<>();

        // making object of user defined object

        Student std0 =new Student("Gaurav ",22,"java developer");
        Student std1 =new Student("baghel",22,"spring boot");
        Student std2 =new Student("Gauravbaghel1", 22, "microservices");
        Student std3 =new Student("Gaurav baghel2" ,22,"coloud");
        Student std4 =new Student("Gaurav ",22,"java developer");

        // todo : adding data in the hashMap =>put(key,value);

        map.put(0,std0);
        map.put(1,std1);
        map.put(2,std2);
        map.put(3,std3);
        map.put(4,std4);
        return map;

           }

    public static void main(String[] args) {

        StudentHashMap obj =new StudentHashMap();
        HashMap<Integer,Student> map=obj.createStudentHashMap();

        for (Integer var: map.keySet()){
            System.out.println("print the data :"+map.get(var).getName() +" Age :"+map.get(var).getAge() +" Section :"+map.get(var).getSection());
        }

    }
}

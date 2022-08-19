package Collection.hashMap;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {


    public void createHashMap(){

    //       todo: HashMap:
    //        Hashmap has very special way of storing object :
    //        key , value
    //          eg. Books
    //        PageNo(key) ,  ChapterName(value)

        //    todo : HashMap<Datatype_key,Datatype_value> object_name =new HashMap<>;
        HashMap<Integer,String>  hashmap =new HashMap<>();


    //add data in hashmap use =>hashmap.put(key,value);
        hashmap.put(1,"java");
        hashmap.put(2,"advance java");
        hashmap.put(3,"spring");
        hashmap.put(4,"spring boot");

        //read the data of hasmap use => hashset.get(key);

        System.out.println("print data of index 3 : "+hashmap.get(3));
        System.out.println("print data of index 2: "+hashmap.get(2));
        hashmap.put(2 ,"Gaurav");
//todo : we cannot use the  duplicate key ,if we add any duplicate key then it will override the previous value
        System.out.println("after add duplicate : print data of index 2 :"+hashmap.get(2));

// printing entire hashMap..=> keySet(); : it return set of key

      Set<Integer> key = hashmap.keySet();//get all the key

        for (Integer var: key){
            System.out.println(" printing data :"+hashmap.get(var));
        }

    }

    public static void main(String[] args) {

        DemoHashMap obj =new DemoHashMap();
       obj.createHashMap();
//       System.out.println("Course: "+hashset.get(1));

//
//        for (Object var: hashsets){
//            System.out.println("courses:"+var);
//        }
    }

}

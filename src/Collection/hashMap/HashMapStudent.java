package Collection.hashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapStudent {

    public void createHashMap(){

        //todo :Syntax : HashMap<Integer,String> obj_name =new HashMap<>();
        HashMap<Integer,String> hashmap =new HashMap<>();

        //adding data in the hashmap => hashmap.put(key,value);
        hashmap.put(1,"Gaurav");
        hashmap.put(2 ,"Samyak");
        hashmap.put(3,"rohit");


      //get one and two  key..=> hashmap.get(key);
        System.out.println("printing data of index 1:"+hashmap.get(1));
        System.out.println("print data of index 2 :"+hashmap.get(2));

        //print the all entire key..=> keySet(); //it return the hashset of keys
            Set<Integer> key =hashmap.keySet();

        for (Integer var :key){
            System.out.println("Printning all the data:"+hashmap.get(var));
        }
    }

    public static void main(String[] args) {

        HashMapStudent obj=new HashMapStudent();
        obj.createHashMap();
    }
}

package Collection.hashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapTicket {

    public void createHashMap(){

        //       todo: HashMap:
        //        Hashmap has very special way of storing object :
        //        (key , value)
        //          eg. Books
        //        PageNo(key) ,  ChapterName(value)

        //    todo : HashMap<Datatype_key,Datatype_value> object_name =new HashMap<>;

        HashMap<String ,Integer> hashmap =new HashMap<>();

        //adding data in the hash map
        hashmap.put("gau",1);
        hashmap.put("sam",2);
        hashmap.put("sin",3);
        hashmap.put("jen",4);
        hashmap.put("ram",5);

        //print entire key

        Set<String> key =hashmap.keySet();
        for (String var : key){
            System.out.println("printing the data :"+hashmap.get(var));
        }

    }

    public static void main(String[] args) {

        HashMapTicket obj =new HashMapTicket();
        obj.createHashMap();
    }
}

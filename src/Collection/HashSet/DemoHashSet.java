package Collection.HashSet;

import java.util.HashSet;

public class DemoHashSet {
        //todo :     hash set does not print duplicate value
//                      HashSet : it never stores Duplicates
//                      Every Object has HashCode : Unique number
//                      HashSet does not mantain insertion order

    public HashSet<String> create_has_set(){

        //todo : HashSet<Data_type> obj_name = new HashSet();
        HashSet<String> course = new HashSet();
        course.add("java");
        course.add("spring");
        course.add("spring boot");
        course.add("microservices");
        course.add("java");
        course.add("spring");
        course.add("spring boot");
        course.add("microservices");

        return course;

    }

    public HashSet<Integer> IntegerHashSet(){

         HashSet<Integer> setId = new HashSet<>();

         setId.add(100);
        System.out.println("hascode of s1 :"+setId.hashCode());

         setId.add(101);
        System.out.println("hascode of s2 :"+setId.hashCode());

         setId.add(102);
        System.out.println("hascode of s3 :"+setId.hashCode());

         setId.add(103);
        System.out.println("hascode of s4 :"+setId.hashCode());

         setId.add(104);
        System.out.println("hascode of s5 :"+setId.hashCode());

        setId.add(100);
        System.out.println("hascode of s6 :"+setId.hashCode());

        setId.add(101);
        System.out.println("hascode of s7 :"+setId.hashCode());

        setId.add(102);
        System.out.println("hascode of s8 :"+setId.hashCode());

        setId.add(103);
        System.out.println("hascode of s9 :"+setId.hashCode());

        setId.add(104);
        System.out.println("hascode of s10 :"+setId.hashCode());

        return setId;
    }

    public HashSet<Double> priceSet(){

        HashSet<Double> Price =new HashSet<>();
        Price.add(213.1);
        System.out.println("hascode of double s1:" +Price.hashCode());

        Price.add(46.54);
        System.out.println("hascode of double s2:" +Price.hashCode());

        Price.add(54.13);
        System.out.println("hascode of double s3:" +Price.hashCode());

        Price.add(6540.3);
        System.out.println("hascode of double s4:" +Price.hashCode());

        Price.add(54.13);
        System.out.println("hascode of double s5:" +Price.hashCode());

        return  Price;
    }

    public static void main(String[] args) {

        //object of DemoHashSet
        DemoHashSet obj =new DemoHashSet();

        //call String generic method
        HashSet<String>course= obj.create_has_set();
        //get the data by advance loop
        for (String var: course){
            System.out.println("print all the data ==>"+var);
        }

        //call the Integer generic method
         HashSet<Integer> setid =  obj.IntegerHashSet();

        // get the data by advance loop
        for (Integer var : setid){
            System.out.println("print Set id :"+var);
        }

        //call the Double generic method
                HashSet<Double> price = new HashSet<>();
                for (Double var:price){
                    System.out.println(" print price :"+var);
                    }
    }
}

package Collection;
import java.util.ArrayList;
public class GenericCollection {

//    todo : SYNTAX ==>  ArrayList <Data_type> obj_name =new ArrayList();

    public ArrayList<String> String_Generic_method() {

        ArrayList<String> strlist = new ArrayList<>();
        strlist.add("java");
        strlist.add("spring ");
        strlist.add("spring boot");
        strlist.add("microservices");
        strlist.add("cloud");
//        strlist.add(100);  todo: we cannot add any different type of value

        return strlist;
    }

    public ArrayList<Integer> Integer_list(){

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(100);
        marks.add(101);
        marks.add(102);
        marks.add(103);

        return marks;

    }

    public ArrayList<Double>  doubleMethod(){

        ArrayList<Double> price =new ArrayList<>();
        price.add(65.5);
        price.add(654.5);
        price.add(34.54);

        return price;

    }

    public static void main(String[] args) {

        GenericCollection obj = new GenericCollection();

        //call String generic
        ArrayList<String> output= obj.String_Generic_method();
        for (int i=0; i< output.size(); i++){

            System.out.println("print String list =>"+output.get(i));
        }

        //call Integer generic

            ArrayList<Integer> marks =obj.Integer_list();

        //todo :  for( DATA_TYPE VAR_NAME : COLLECTION NAME)

        for (Integer var :marks){

            System.out.println("by advance loop : "+var);
        }

        //call double generic

        ArrayList<Double> price =obj.doubleMethod();

        for (Double var: price){
            System.out.println("price in double : "+var);
        }
    }



}

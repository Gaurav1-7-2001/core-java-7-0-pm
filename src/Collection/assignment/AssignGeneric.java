package Collection.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class AssignGeneric {

    public ArrayList<String> Stringmethod(){

        ArrayList<String> list =new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String choice ="y";
        while(choice.equals("y")) {


            System.out.println("please enter string value in String generic :");
            String string = sc.nextLine();
            list.add(string);

            System.out.println("press y to continue and press any key to exit");
             choice=sc.nextLine();
        }
        return list;
    }

    public ArrayList<Integer> Integergeneric(){


        ArrayList<Integer> salary = new ArrayList<Integer>();

        salary.add(90000);
        String choice ="y";

        while(choice.equals("y")) {


            Scanner sc = new Scanner(System.in);
            System.out.println("enter the salary");
            int sal = sc.nextInt();
            salary.add(sal);

            System.out.println("press y to continue and press any key to exit");
            Scanner sc1 = new Scanner(System.in);

            choice = sc1.nextLine();
        }
        return salary;

    }

    public ArrayList<Double> Doublegeneric(){

        ArrayList<Double> price = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String choice ="y";
        while(choice.equals("y")) {

            System.out.println("enter the price");
            double input = sc.nextDouble();

            System.out.println("press y to continue and press any key to exit");
            choice = sc.nextLine();
        }
            return price;
    }


        public static void main(String[] args) {

//      todo: create object of class
//       ClassName var_name =new ClassName();
            AssignGeneric obj = new AssignGeneric();


            //todo : call String generic method
            //  if we have return type then
            //      ArrayList<Datatype> var_name = class_var_name.method_name();
            ArrayList<String> list = obj.Stringmethod();

            //todo : for( DataType var_name : name_of_collection){code}
            for (String var : list) {

                System.out.println("print list ==> " + var);
            }


            //todo : call Integer generic method
            // if we have some return type from the method of ArrayList collection
            // ArrayList<datatype> var_name =class_var_name.Method_name();
            ArrayList<Integer> salary=obj.Integergeneric();

            for (Integer var : salary){
                System.out.println("salary is : "+var);
            }


            // todo : call double generic method
            //   ArrayList<Datatype> var_name=obj.method_name();

            ArrayList<Double> price =new ArrayList<>();

            // by advance loop
            for (Double var : price){
                System.out.println("print the all price" +var);
            }



    }
}



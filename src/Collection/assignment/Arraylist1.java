package Collection.assignment;

import java.util.ArrayList;
public class Arraylist1 {

    public void Create_array_list(){

        ArrayList list =new ArrayList();

        //add data in the array list

        list.add("Gaurav");
        list.add("spring boot");
        list.add("cloud");
        list.add("java developer");
        list.add("Salary");
        list.add(90000);
        list.add("id");
        list.add(101);
        list.add("100000");


        //get the data
        //by the for loop
        for (int i=0 ;i< list.size(); i++){

            System.out.println("print data of "+i +" index :"+list.get(i));
        }

        //by advance loop

        for (Object var : list){

            System.out.println("by advance for loop ==>" +var);
        }


        }

    public static void main(String[] args) {

        Arraylist1 obj = new Arraylist1();
        obj.Create_array_list();


    }
        
    }



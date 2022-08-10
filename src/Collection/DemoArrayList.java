package Collection;
import java.util.ArrayList;
public class DemoArrayList {

    public void create_arraylist(){

        ArrayList list =new ArrayList(); //create object of list

        // todo : list.add(data);
        //  add data in the arraylist
        list.add("gaurav");
        list.add("Microservices");
        list.add("spring");
        list.add("cloud");
        list.add("spring boot");

        //todo :  read the data list.get(index)

        System.out.println(" read the data :" +list.get(0));
        System.out.println(" read the data :" +list.get(1));
        System.out.println(" read the data :" +list.get(2));
        System.out.println(" read the data :" +list.get(3));
        System.out.println(" read the data :" +list.get(4));

        //by for loop
        for (int i=0 ;i< list.size(); i++){

            System.out.println(" by for loop print data of "+i +" index :"+list.get(i));

        }

        //advance for loop
            for (Object var: list){
            System.out.println("by advance loop ==>"+var );
        }
    }

    public static void main(String[] args) {

        DemoArrayList obj=new DemoArrayList();
        obj.create_arraylist();
    }
}

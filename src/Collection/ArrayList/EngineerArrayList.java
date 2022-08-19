package Collection.ArrayList;

import model.Engineer;

import java.util.ArrayList;

public class EngineerArrayList {

    public  ArrayList<Engineer> Create_engineer_list(){

        ArrayList<Engineer> engList =new ArrayList();


        //make object of engineer class
        Engineer eng1= new Engineer("gaurav", "java", 100000,101);
        Engineer eng2 = new Engineer("samyak", "it", 90000,102);
        Engineer eng3 =new Engineer("rohit", "developerr mode" ,85000, 104);


        //add data in a list
        engList.add(eng1);
        engList.add(eng2);
        engList.add(eng3);

        return engList;
    }

    public static void main(String[] args) {

        EngineerArrayList obj = new EngineerArrayList();

        ArrayList<Engineer> engineers =obj.Create_engineer_list();

        //advance loop

        for (Engineer var : engineers){
            System.out.println("print: "+var.getName() +" id: "+var.getId() +" dept: "+var.getDept() +" salary: "+var.getSalary());
        }

    }

}

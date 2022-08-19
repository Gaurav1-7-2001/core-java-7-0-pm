package Collection.HashSet;

import model.Engineer;


import java.util.LinkedHashSet;

public class LinkedHashSet1 {

    public LinkedHashSet<Engineer> createLinkedHash(){

        LinkedHashSet<Engineer> lset =new LinkedHashSet();


        Engineer eng =new Engineer("guarav","java developer",9000000,100);
        Engineer eng1 =new Engineer("guarav1","java developer",9400000,101);
        Engineer eng2=new Engineer("guarav2","java developer",9030000,102);
        Engineer eng3 =new Engineer("guarav","java developer",9000000,100);

        //add data in the lset
        lset.add(eng);
        lset.add(eng1);
        lset.add(eng2);
        lset.add(eng3);

        return lset;
    }

    public static void main(String[] args) {

        LinkedHashSet1 obj =new LinkedHashSet1();
        LinkedHashSet<Engineer>lset=obj.createLinkedHash();

        for (Engineer var :lset){
            System.out.println("print details:"+var.getName() +" Dept :"+var.getDept() + " id :"+var.getId() +" salary:"+var.getSalary());
        }
    }
}

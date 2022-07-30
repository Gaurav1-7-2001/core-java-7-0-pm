package class__object.assignment;

public class Engineer {

    String name = "Gaurav Baghel";
    int salary = 70000;
    String work = "Software Developer";
    int id =1;

    public Engineer(String name, int salary, String work, int id) {
        this.name = name;
        this.salary = salary;
        this.work = work;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String args[]){

//        Engineer obj1 =new Engineer();

//        System.out.println( "Name of Engineer is :" +obj1.name);
//        System.out.println( "Salary of Engineer is :" +obj1.salary);
//        System.out.println( "Work of Engineer is :" +obj1.work);
//        System.out.println(" ID of Engineer is :" +obj1.id);


   Engineer obj1 =new Engineer("Gaurav",95000,"Software developer" ,101);
   System.out.println("obj1=> Name:"+obj1.name +" salary :"+obj1.salary +" work:"+obj1.work +" id:"+obj1.id);
    //set the value
        obj1.setName("Gaurav baghel");
   //read the value
        System.out.println(" updated name in obj1=> "+obj1.getName());

   Engineer obj2 =new Engineer("Samyak",90000,"java developer",102 );
   System.out.println("obj2=> Name:"+obj2.name +" salary:"+obj2.salary +" work:"+obj2.work +" id:"+obj2.id);
// set the salary
        obj2.setSalary(95000);
        //read the value
        System.out.println("update salary in obj2=>"+obj2.getSalary());

   Engineer obj3 =new Engineer("Deepak", 70000 ,"python developer",103);
        System.out.println("obj3=> Name :"+obj3.name +"salary:"+obj3.salary +" work:"+obj3.work +" id:" +obj3.id);

//set the value
        obj3.setWork("front end developer");
        System.out.println("updated work in obj3=>"+obj3.getWork());

        Engineer obj4 =new Engineer("Shivam", 90000,"web developer",108);
        System.out.println("obj4=> Name :"+obj4.name +" salary:"+obj4.salary +" work:"+obj4.work +"id:"+obj4.id);
//set the value

        obj4.setId(109);
        //read the value

        System.out.println("updated id in obj4 =>"+obj4.getId());

    }

}

package class__object.assignment;

public class Doctor {

    String name;
    int salary;
    String dept;
    int id;

    public Doctor(String name, int salary, String dept, int id) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {


//        Doctor obj1 = new Doctor();

//        System.out.println(" Name of Doctor is :" +obj1.name);
//        System.out.println(" salary of Doctor is :" +obj1.salary);
//        System.out.println(" Department of Doctor s :" +obj1.dept);
//        System.out.println( " ID of Doctor is :" +obj1.id);

        Doctor obj1 =new Doctor("Dr. Rakesh ",7000," surgeion",  101);
    System.out.println("obj1 => Name :" +obj1.name +" salary :" +obj1.salary +" Dept :"+obj1.dept +" id: " +obj1.id);

    //set the value
        obj1.setName(" Dr. Rakesh Kumar");

        // get the name
        System.out.println(" updated name in obj1==>"+obj1.name);

Doctor obj2 =new Doctor("Dr. Ram", 75000 , "Dentist" ,102);
System.out.println("obj2=> Name :" +obj2.name +" Salary :"+obj2.salary +" dept :"+obj2.dept +" id:"+obj2.id);

    //set the value
    obj2.setSalary(85000);
    //get the salary
    System.out.println(" updated salary in obj2==>"+obj2.getSalary());


Doctor obj3= new Doctor("Dr. Raj",80000,"Eye specialist",103);
System.out.println("obj3=> Name:"+obj3.name +" salary:"+obj3.salary +" dept:"+obj3.dept);

//set the dept
        obj3.setDept(" Ear Specialist ");

        //read the dept
        System.out.println(" updated dept in obj3==>" +obj3.getDept());

Doctor obj4= new Doctor("Dr. Bob",90000 ,"Skin Specialist" ,105);
System.out.println(" obj4 => Name:"+obj4.name +" Salary:"+obj4.salary +" dept:"+obj4.dept +" id:"+obj4.id);

//set the value
        obj4.setId(106);

        //get the value
        System.out.println(" updated id in obj4=>" +obj4.getId());


    }


}

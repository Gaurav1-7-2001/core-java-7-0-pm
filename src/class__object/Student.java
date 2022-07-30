package class__object;

public class Student {

    String name ;
    int id ;
    String dept ;
    int age ;

    public Student() {

    }

    public Student(String name, int id, String dept,int age) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){

        this.age=age;
    }


    public static void main(String[] args) {

        Student obj1= new Student( "Gaurav", 100, "computer science", 22);
        System.out.println("Name :" +obj1.name +" Age is : "+obj1.age +" ID is :" + obj1.id +" dept : " + obj1.dept) ;

        //set the name Gaurav to Gaurav baghel
        obj1.setName("Gaurav Baghel");

        //get the value
        System.out.println("update name in obj1==>" + obj1.getName());

        Student obj2 = new Student("Rahul",101,"Electrical",23);
        System.out.println("Obj2 ==> Name :" +obj2.name +" id :"+obj2.age + " dept :"+obj2.dept +" Age :"+obj2.age);

        //set the id
        obj2.setId(105);

        //read the value
        System.out.println("updated id in obj2==>"+obj2.getId());

        Student obj3 =new Student( "Raj",103,"mechanical",23);
        System.out.println("obj3==> Name :"+obj3.name +" id :" +obj3.id +" dept :"+obj3.dept +" Age :"+obj3.age);

        //set the department
        obj3.setDept("Computer Science");

        //read the value
        System.out.println("updated department in obj3===>" +obj3.getDept());


        Student obj4 =new Student("Samyak",104,"Computer Science", 23);
        System.out.println("obj4==> Name :"+obj4.name +" id :"+obj4.id +" dept :"+obj4.dept +" Age:" +obj4.age);

        //set the age
        obj4.setAge(24);

        //read the obj4
        System.out.println(" update Age in obj4==>" +obj4.getAge());

    }


}

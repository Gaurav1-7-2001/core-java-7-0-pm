package oops.dataEncapsulation;


// todo : binding data member and method with the single unit
public class DemoEncapsulation {

      String name;

   private  int age=10;

    public DemoEncapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        DemoEncapsulation obj =new DemoEncapsulation("gaurav",23);
        System.out.println("print  name "+obj.getName() +" age :"+obj.getAge());

    }
}

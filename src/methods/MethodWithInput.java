package methods;

public class MethodWithInput {

    // todo : Access_modifier return_type method_name(){ code}

    public void checkage(int age){

        if (age<18){
            System.out.println(" Person is child.." +age);
        }
        else if(age>18 && age<45){
            System.out.println(" Person is Young.. "+age);
        }else{
            System.out.println("Person is Old.."+age);
        }
    }

    public void hello(String name ,int age){
        System.out.println("Welcome to java..."+name +" Age is :"+age);
    }

    public void message(String name ,int age , int salary , String dept){
        System.out.println(" WELCOME..." +name +" of Age :"+age +" Hold salary :" +salary +" of Department :"+dept);

    }

    public static void main(String[] args) {

        MethodWithInput obj =new MethodWithInput();
        obj.checkage(45); //obj.method_name(parameter)
        obj.hello("RAMA" , 22);
        obj.message("GAURAV" ,22 ,90000 , "MICROSERVICE DEVELOPER");

    }

}

package methods;

public class MethodwithOutput {

    // todo : access_modifier return_type method_name(parameter){code}
//       return type ==> output of function
//         return_type = Data_type
    //      todo : access_modifier Data_type(return_type) Method_name(parameter){code}

    public  String message(String name){

        String output= "Welcome to the java developer.." +name;
        return output;

    }

    public int square(int num){

        int result =num*num;
        return result;
    }

    public double doublePrice(double price){

        double output =price*2;
        return output;

    }

    public static void main(String[] args) {

//     todo :  object creation
//        Class_name obj_name =new Class_name();
        MethodwithOutput obj =new MethodwithOutput();

        // todo : call_method
//           Data_type var =obj.method_name();
          String name =obj.message("gaurav");//store the output
        System.out.println("Our method is workiing properly.."+name);

        // call square method
        int result=obj.square(2); //store the output
        System.out.println("your Square of any number :"+result);

        //call the double price

        double output =obj.doublePrice(540.51); //store the output
        System.out.println("you price is become double.."+output);




    }


}

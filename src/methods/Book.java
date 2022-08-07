package methods;

 public class Book {

    // todo : properties or data member

    String name;
    int pageno ;
    String writerName;

    /*  todo : capabilities or method or function

    todo : SYNTAX : Access_modifier return_type method_name(parameter){CODE  }
     Access_modifier ==> public, private.protected, default
     return_type : output of method or function : void :no return type
     method name ==> can be anything : it should be meaningful
     parameter ==> input parameter : optional*/

//    todo : SYNTAX : Access_modifier return_type method_name(parameter){CODE  }

    public void readMethod(){
        System.out.println(" This is a read method ");

    }
    public void writeMethod(){
        System.out.println("this is write method");
    }

    public static void main(String[] args) {

        Book obj =new Book();

        // todo :  Execute method ==> object.methodName
        obj.readMethod();
        obj.writeMethod();

    }

}

package Exception_handling;

public class DemoException {

    public int  divide(int a ,int b){
        int divide =0;
        System.out.println("Inside the divide method ");
        try {
             divide = a / b;
        }catch (Exception e){
            System.out.println("Exception occur :"+e);

        }

        return divide;
    }

    public void array(){
        int arr[] = { 3,4,6,7,8,9};

        try {
            System.out.println("print array element :" + arr[9]);
        }catch(Exception e){
            System.out.println("Exception occured:"+e);
        }

        finally {
            System.out.println("*******finally block is always execute , exception occured or not*** ");

            System.exit(0);

        }
    }

    public static void main(String args[]){

        DemoException obj =new DemoException();

        System.out.println( "Print before the divide Method calling");
        int divide =obj.divide(10,5);
        System.out.println("After the divide method calling ");
        System.out.println("Print divide : "+divide);

        //call array method

        System.out.println("Before calling array method");
        obj.array();
        System.out.println("After calling array method");


    }
}

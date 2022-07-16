package variable_manipulation;

public class VariableManipulation {

    public static void main(String[] args) {


        int a =12;
        int b= 3;

        System.out.println("variable a is :" +a);
        System.out.println("variable b is :" +b);

        // square of no..

        int square = a*a;
        System.out.println(" square of a is :" +square);

        //addition

        int add = a+b;
        System.out.println("add of two a and b is :" +add);

        //subtraction

        int sub =a-b;
        System.out.println("subtraction  of a and b is :" +sub);

        //multiply

        int mul =a*b;
        System.out.println("multiply of a and b is :" +mul);

        //division

        int div = a/b;
        System.out.println("division of a and b is" +div);


        //increment

        a++;
        System.out.println("increment of a is :" +a);

        b++;
        System.out.println(" increment of b is :" +b);

        a--;
        System.out.println("decrement of a is :" +a);

        b--;
        System.out.println("decrement of b is :" +b);

        char cha = 'y';
        ++cha;
        System.out.println("increment of char :" +cha);
    }


}

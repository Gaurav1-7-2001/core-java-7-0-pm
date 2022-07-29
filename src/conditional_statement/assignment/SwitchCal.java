package conditional_statement.assignment;
import java.util.*;
public class SwitchCal {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter your first no..");
        int a =sc.nextInt();
        System.out.println("enter your second no..");
        int b=sc.nextInt();

        Scanner s= new Scanner(System.in);
        System.out.println("enter you symbol");
        String sym =s.nextLine();
//        int a=2,b=3;
//        String sym = "*";

        switch(sym){

            case "+":
                System.out.println("add of two no is :" +(a+b));
                break;
            case "-":
                System.out.println("sub of two no is :" +(a-b));
                break;
            case "*":
                System.out.println("mul of two no is :" +(a*b));
                break;
                case "/":
                System.out.println("division of two no is :" +(a/b));
                break;
            case "%":
                System.out.println("remainder of two no is :" +(a%b));
                break;
                default:
                System.out.println("in valid sign are used");



        }

    }
}

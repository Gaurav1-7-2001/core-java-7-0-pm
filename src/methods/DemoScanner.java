package methods;
import java.util.*;
public class DemoScanner {

    public static void main(String [] args){

        Scanner sc =new Scanner(System.in);

        System.out.print("enter you ==>");
        String name=sc.nextLine();

        System.out.println("entered  name is :"+name);

        System.out.print("enter your age is==>");
        int age =sc.nextInt();
        System.out.println("your aged is :"+age);

        System.out.print("entered your price==>");
        double price =sc.nextDouble();
        System.out.println("your price is==>"+price);
    }

}

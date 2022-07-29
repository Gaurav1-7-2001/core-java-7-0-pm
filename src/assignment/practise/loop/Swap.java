package assignment.practise.loop;
import java.util.*;
public class Swap {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("enter first no..");
        int a =sc.nextInt();

        System.out.println("enter second no..");
        int b =sc.nextInt();

//        int a=20;
//       int b=10;

        System.out.println("swap using third variable");

//        int c=a;
        System.out.println("before swap");
        System.out.println("value of a is:" +a);
        System.out.println("value of b is :" +b);

//        a=b;
//        b=c;
//       c=a;

        a=a-b;
        b=a+b;
        a=b-a;

        System.out.println("after swap");
        System.out.println("value of a is:" +a);
        System.out.println("value of b is :" +b);
//        System.out.println(c);

    }
}

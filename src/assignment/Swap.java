package assignment;
import java.util.*;
public class Swap {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number in x an y...");

        int x =sc.nextInt();
        int y= sc.nextInt();

        System.out.println(" before Swapping " + "x :"+x +" , "+"y="+y);

        //without using third variable
        //x=10 y=5
        x=x+y; //x=15
        y=x-y;//y=15-5, y=10;
        x=x-y;//x= 15-10; x=5

        System.out.println("After Swapping" +" x :"+x +" , "+"y :"+y);

    }
}

package loops.for_break_assignment;
import java.util.*;
public class AnyTable {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println(" enter your number ");
        int num= sc.nextInt();

        for (int i=1; i<=10; i++){

            System.out.println( "table of ==>" +num +" is : " +num +" X " +i +" = " + (num*i));
        }
    }
}

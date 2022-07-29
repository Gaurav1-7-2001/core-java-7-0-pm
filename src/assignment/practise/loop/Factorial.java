package assignment.practise.loop;
import java.util.*;

public class Factorial {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");

        int no= sc.nextInt();
        System.out.println( "your number is :" +no);
        int fact=1;
/*        for (int i = no; i >= 1; i--) {

            fact =fact*i;

        }*/

        for(int i =1; i<=no ; i++){

            fact =fact*i;
        }
        System.out.println("the factorial of :" +no +" is :"+fact);

    }
}
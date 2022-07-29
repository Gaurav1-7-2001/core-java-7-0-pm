package loops.while_do_assignment;
import java.util.*;
public class Whiletbl {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter your number ..");

        int num =sc.nextInt();

        int i=1;
        int result;
            while(i<=10){

                result=num*i;

                System.out.println("your table is.. :" +num +" X " +i +" = " +result);
                i++;
            }
    }

}

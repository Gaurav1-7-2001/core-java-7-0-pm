package conditional_statement.assignment;
import java .util.*;
public class NestedIf3 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println(" enter you no...");
        int no =sc.nextInt();

        //int no=9 ;

        if(no !=0){

            if(no%2==0){

                System.out.println("number  is EVEN :" +no);
            }else{
                System.out.println("number is ODD :"+no);
            }

        }else{
            System.out.println("invalid no..");
        }

    }
}

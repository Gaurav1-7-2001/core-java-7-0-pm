package loops.while_do_assignment;
import java.util.*;
public class WhileEven {

    public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

        System.out.println("enter your number..");

        int num =sc.nextInt();
    int i=1;

        while(i<num ){

            if(i%2==0){

                System.out.println("EVEN NUMBER.. : " +i );
            }else{

                System.out.println("ODD NUMBER.." +i);

            }
            i++;
        }


    }
}

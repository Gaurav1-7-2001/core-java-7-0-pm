package assignment;
import java.util.*;
public class StringRev {

    public static void main(String[] args) {

    Scanner sc =new Scanner (System.in);

        System.out.println( "enter your String..");
        String name =sc.nextLine();


//        String name ="Samyak";
//        int len = ;

        String rev ="";

        for ( int i =name.length()-1 ; i>=0 ; i--){

            rev = rev + name.charAt(i);
        }

        System.out.println(" reverse of String is :" +rev);

    }
}

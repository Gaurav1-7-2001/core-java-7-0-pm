package conditional_statement.assignment;
import java.util.*;
public class NestedIF1 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age :" );
        int age = sc.nextInt();

        Scanner s = new Scanner(System.in);

        System.out.println("enter your city :");
        String city =s.nextLine();

        /*int age =20;
        String city ="banglore";*/

        if (age>18){

            System.out.println(" your age is:" +age);

            if ( city=="delhi" || city == "mumbai" || city=="chennai" || city =="banglore"){

                System.out.println("your city is metro city:" +city);
            }
            else{

                System.out.println("your city is not a metro city: "+city);
            }

        }else{

            System.out.println("you are under aged:"+age);
        }

    }
}

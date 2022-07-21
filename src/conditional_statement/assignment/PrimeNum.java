package conditional_statement.assignment;
import java.util.*;
public class PrimeNum {

    public static void main(String[] args) {

/*
      Scanner sc =new Scanner(System.in);
        System.out.println( "enter you no...." );
      int no =sc.nextInt();*/

        int no=4;

        if((no%1==0) && (no%no==0)){
            System.out.println("Number is prime :" +no);
        }else{
            System.out.println("Number is NOT prime : " +no);
        }

        }
    }


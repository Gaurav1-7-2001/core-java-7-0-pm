package assignment.practise.loop;

import java.util.Scanner;

public class ReverseNo {

    public static void main(String[] args) {

        System.out.println("enter your number :");
         Scanner sc =new Scanner(System.in);
         int no= sc.nextInt();


        int temp=no;
        int rem,rev=0;
        while(no!=0){

            rem =no%10;

            rev =rev*10+rem;

            no=no/10;

        }
        System.out.println("your number is:"+temp +"  and reverse is:"+rev);
    }
}

package assignment.practise.loop;

import java.util.*;
public class PrimeNum {

    public static void main(String[] args) {


       /* Scanner sc = new Scanner(System.in);
        System.out.println("enter you no....");
        int no = sc.nextInt();
*/

        int no=100;

        int temp = 0;

            for (int i = 2; i < 100; i++) {
                if (no % i == 0) {
                    temp = temp + i;
                }
            }
            if (temp > 0) {
                System.out.println("Number  not is prime :" + no);
            } else {
                System.out.println("Number is prime : " + no);
            }


    }
}




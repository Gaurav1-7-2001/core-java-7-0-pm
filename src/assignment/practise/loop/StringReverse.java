package assignment.practise.loop;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        System.out.println("enter your string :");
        Scanner sc =new Scanner(System.in);

        String name= sc.nextLine();
        int len = name.length();
        String rev= "";
        System.out.println("length of the string is :" +len);

        for(int i=len-1; i>=0 ;i--){

            rev = rev + name.charAt(i);
        }
        System.out.println("reverse of string is :"+rev);
    }
}

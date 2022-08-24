package oops.INTERFACE.software;

import java.util.Scanner;

public class HDFCBank implements Bank {


    @Override
    public String openAccount() {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter your name");
        String name =sc.nextLine();

        System.out.println("enter your city");
        String city =sc.nextLine();
//        String name ="GAURAV";
        System.out.println("enter your age :");
        int age =sc.nextInt();

        if (  age>=18 && city.equals("tundla")  || city.equals("firozabad")) {
            System.out.println(" we can open account in Hdfc Bank  of :" + name);
        }else{
            System.out.println("we cannot open your account because your city  and age is unexpected ");
        }
//        return name;
        return city;

    }

    @Override
    public void deposit_money() {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter your deposit amount :");
        int amount =sc.nextInt();

        if( amount>=2000){
            System.out.println("your amount added success fully in you account : "+amount );
        }else{
            System.out.println("your amount less than 2000 we cannot add amount in your account"+amount);
        }

    }

    @Override
    public double TransferMoney() {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter your amount");
        double money =sc.nextDouble();

//        double money =13543.15;
        System.out.println(" you are transfer  Money Through HDFC Bank amount is :" +money);

        return money;
    }

    public static void main(String args[]){

        HDFCBank obj =new HDFCBank();
         //call openAccount Method
        obj.openAccount();

        //call deposit amount method
//        obj.deposit_money();

        //call Transfer Money
//       obj.TransferMoney();



    }
}

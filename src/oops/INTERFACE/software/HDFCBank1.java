package oops.INTERFACE.software;

import java.util.Scanner;

public class HDFCBank1 implements Bank1 {


    @Override
    public String openAccount() {

//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter your name");
//        String name =sc.nextLine();

            String name ="gaurav";
        System.out.println("your account is open with : "+name);

        return name;
   }

    @Override
    public int deposit_money() {
        int amount =3000;
        System.out.println("your mount added success fully" +amount);

        return amount;
    }

    @Override
    public double TransferMoney() {

//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter your amount");
//        double money =sc.nextDouble();

        double money =13543.15;
        System.out.println(" you are transfer  Money Through HDFC Bank amount is :" +money);
        return  money;
    }

    public static void main(String args[]){

        HDFCBank obj =new HDFCBank();
        //call openAccount Method
               String name= obj.openAccount();
        System.out.println(" Open Account with name of :"+name);

        //call Transfer Money
        double money =obj.TransferMoney();
        System.out.println(" Money transfer through HDFC Bank : "+money);


    }
}





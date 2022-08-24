package oops.abstraction.assign;

public class GooglePay extends Payment {

    @Override
    public double MoneyTransfer(double moneyTransfer) {
        System.out.println( "Money transfer through google pay " +moneyTransfer);
        return moneyTransfer;
    }

    public void m1(){

        System.out.println(" this is method of m1 of Google Pay ");
    }


    public static void main(String args[]){

        GooglePay obj =new GooglePay();

        // we have a return type in the moneyTransfer method
        //then we have to call the method and store it in the variable

        double money =obj.MoneyTransfer(346.35);
        System.out.println("print MoneyTransfer through Google pay" +money);

        //call other method of parent class(Payment )
        obj.checkBalance(15686.135);
        obj.display_UPID("dfvfd648d");
        obj .m1();
    }

}

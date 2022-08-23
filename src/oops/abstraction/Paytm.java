package oops.abstraction;

public class Paytm extends Payment{
    @Override
    public double MoneyTransfer( double moneyTransfer) {

//        double moneyTransfer = 4653.43;
        System.out.println("print the money transfer :"+moneyTransfer);
            return moneyTransfer;
    }

    public static void main(String[] args) {
        Paytm obj =new Paytm();
        obj.checkBalance(5446.345);
        obj.display_UPID( "defkhs545f");
        obj.MoneyTransfer( 6466.56);
    }
}

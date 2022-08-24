package oops.abstraction.assign;

public class Paypal extends Payment {
    @Override
    public double MoneyTransfer(double moneyTransfer) {
        System.out.println("print money transfer by the paypal :"+moneyTransfer);
        return moneyTransfer;

    }

    public static void main(String[] args) {
        Paypal obj =new Paypal();
        obj.checkBalance(1655.549);
        obj.display_UPID("sjdh465sds");
        obj.MoneyTransfer(3543.154);
    }
}

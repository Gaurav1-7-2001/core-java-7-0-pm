package oops.abstraction;

public class PhonePay extends Payment {


    @Override
    public double MoneyTransfer(double moneyTransfer) {
        System.out.println("print moneyTransfer :"+moneyTransfer);
        return moneyTransfer;
    }

    public static void main(String[] args) {
        PhonePay obj =new PhonePay();
        obj.checkBalance(5463.15);
        obj.display_UPID("jhwis56468fs");
                obj.MoneyTransfer(354.54);
    }
}

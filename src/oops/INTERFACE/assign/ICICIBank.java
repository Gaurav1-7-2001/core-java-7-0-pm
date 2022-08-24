package oops.INTERFACE.assign;

public class ICICIBank implements Bank {

    @Override
    public void OpenAccount() {
        System.out.println("Open Account in ICICI bank");
    }

    @Override
    public void transferMoney() {
        System.out.println(" transfer money ICICI bank to other Successfully");
    }
    public static void main(String args[]){

        ICICIBank obj =new ICICIBank();
        obj.OpenAccount();
        obj.transferMoney();

    }
}

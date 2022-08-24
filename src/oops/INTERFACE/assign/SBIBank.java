package oops.INTERFACE.assign;

public class SBIBank implements Bank {


    @Override
    public void OpenAccount() {
        System.out.println("Open account in the SBI Bank ");
    }

    @Override
    public void transferMoney() {
        System.out.println("transfer money successfully");
    }

    public static void main(String[] args) {
        SBIBank obj =new SBIBank();
        obj.OpenAccount();
        obj.transferMoney();
    }
}

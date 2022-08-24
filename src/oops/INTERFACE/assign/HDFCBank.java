package oops.INTERFACE.assign;

public class HDFCBank implements Bank {

    @Override
    public void OpenAccount() {
        System.out.println(" Open account in HDFC bank ");
    }

    @Override
    public void transferMoney() {
        System.out.println(" transfer money HDFC bak to other bank successfully !!");

    }

    public static void main(String[] args) {

        HDFCBank obj =new HDFCBank();
        obj.OpenAccount();
        obj.transferMoney();
    }
}

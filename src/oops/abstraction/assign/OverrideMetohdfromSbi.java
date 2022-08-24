package oops.abstraction.assign;

import oops.INTERFACE.assign.HDFCBank;

public class OverrideMetohdfromSbi extends HDFCBank {

    @Override
    public void OpenAccount(){
        System.out.println( "over ride method");
    }


    public static void main(String[] args) {

        HDFCBank obj1 =new HDFCBank();
        obj1.OpenAccount();


        OverrideMetohdfromSbi obj =new OverrideMetohdfromSbi();
        obj.OpenAccount();
        obj.transferMoney();
    }

}

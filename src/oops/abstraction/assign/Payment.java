package oops.abstraction.assign;


//         1-check balance
//         2-display UPI ID
//         3-money transfer
public abstract class Payment {


    public double checkBalance(double balance){


        System.out.println("print the balance :"+balance);
        return balance;
    }
    public String display_UPID(String upId){

//        String upId ="KJDSLF654CS";
        System.out.println("print the upid : "+upId);

        return upId;
    }

//    todo : access_modifier abstract return_type method Name();
    public abstract double MoneyTransfer(double moneyTransfer);

    }

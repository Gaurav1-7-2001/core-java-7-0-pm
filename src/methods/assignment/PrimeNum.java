package methods.assignment;

public class PrimeNum {

    public void primeNum(){

        int num =13;
        boolean flag= true;

        for (int i=2; i<num; i++){

            if (num%2==0){

                flag =false;
            }

        }

        if (flag){
            System.out.println("PRIME NUMBER :" +num);
        }else{
            System.out.println("NOT PRIME NUMBER :"+num);
        }


    }

    public static void main(String[] args) {

        PrimeNum obj =new PrimeNum();
        obj.primeNum();
    }
}

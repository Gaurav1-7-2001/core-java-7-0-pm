package loops.while_do_assignment;

public class WhilePrime {

    public static void main(String[] args) {

        int num=3;
       boolean flag= false;
       int i=2;
        while (i<num){

            if ( num%i==0){

                flag =true;
            }
            i++;
        }

        if (flag){

            System.out.println(" NOT PRIME NUMBER.." +num);
        }else{
            System.out.println("PRIME NUMBER.." +num);
        }

    }
}

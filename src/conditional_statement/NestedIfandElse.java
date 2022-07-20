package conditional_statement;

public class NestedIfandElse {

    public static void main ( String [] args){

        int num=7;

        if ( num !=0){

            if (num%2 == 0){

                System.out.println("number is even:" +num);

            }else{
                System.out.println("number is not even it is odd number :" +num);
            }
        }
        else{
            System.out.println("number is invalid:"+num);

        }
    }
}

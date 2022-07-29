package loops.for_break_assignment;

public class BreakContinue1 {

//    Wrtie a Program to print even number and if number increased to 20 then exit from loop (1 to 50)

    public static void main(String[] args) {

        for (int i =1 ; i<=50 ; i++){

            if(i%2==0){

                System.out.println("EVEN NUMBER..."+i);
            }
            if (i>=20){
                break;
            }

        }
    }
}

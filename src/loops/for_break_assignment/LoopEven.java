package loops.for_break_assignment;

public class LoopEven {

    public static void main(String[] args) {

        for (int i=1; i<=50; i++){

            if (i%2==0){
                System.out.println("EVEN number :" +i);
            }else{
                System.out.println("ODD number :" +i );
            }
        }

    }
}

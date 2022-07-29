package loops;

public class DemoBreakContinue {

    public static void main(String[] args) {


//        break : it will stop execution of any loop

        for (int i=0 ; i<10 ; i++){

            System.out.println( "for loop..." +i);

            if ( i==5){
                break;
            }

        }



/*
        Debugging : we can easily analyse code
        we can add break Point

        Break point : it stops code execution
        F7- it will take you inside method
        F8- Line by Line Execution
        F9- Break point to Point
*/









//        continue
//      : it will return back to next iteration of loop
            for (int i=0 ; i<10 ; i++) {

                if (i == 4) {
                    continue;
                }

                System.out.println("for continue use in loop ...." + i);
            }


    }
}

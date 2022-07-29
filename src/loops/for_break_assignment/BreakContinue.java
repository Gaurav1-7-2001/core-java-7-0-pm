package loops.for_break_assignment;

public class BreakContinue {

    public static void main(String[] args) {

//        Write a program to print All number  between 1 to 10 except 3 and 9.

        for (int i=0 ; i<=10 ; i++){

            if (i==3 || i==9) {
                    continue;
            }
                System.out.println("using of continue keyword..." +i);

        }

    }
}

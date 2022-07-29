package loops.for_break_assignment;

public class BreakContinue2 {

//    write a Program to print table of 3 but do not print 27

    public static void main(String[] args) {

        int num =3;
        int result;
        for (int i=1; i<=10; i++ ){

            result =num*i;

            if (result ==27){

                continue;
            }

            System.out.println(" Table of 3 is  : " +num +" X " +i +" = " +result);

        }
    }

    public static class LoopOdd {

        public static void main(String[] args) {

            for (int i=50; i<=100; i++){

                if (i%2!=0){
                    System.out.println("ODD number" +i);
                }

            }
        }
    }
}

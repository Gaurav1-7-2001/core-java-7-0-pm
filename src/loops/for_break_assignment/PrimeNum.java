package loops.for_break_assignment;

public class PrimeNum {

    public static void main(String args[]){


//        int no = 97;
        boolean flag = false;


            for( int no =2; no<=100; no++ )
            {
                for (int i = 2; i < no; i++)
                {

                    if (no % i == 0) {

                        flag = true;
                    }
                }
                if (flag) {
                    System.out.println("NOT PRIME NO.." + no);
                } else{
                    System.out.println("prime number.." + no);
                }

            }
    }
}

package Array.assignment;

public class ArrayDoouble {

    public static void main(String[] args) {

        double price[] = { 165.14,54.23,88.21,54.65,87.54,56.45,116.84 };

        // by for loop

        for (int i=0; i<price.length ; i++){

            System.out.println("print price by using for loop.."+price[i]);
        }


        //by while loop

        int i=0;
        while (i<price.length){

            System.out.println( " by while loop price is .."+price[i]);
            i++;
        }

        // advance loop
        // todo Syntax : for(data_type var_name : array_name){code}
        for ( Double var : price){

            System.out.println(" price by using advance loop.." +var);
        }

    }
}

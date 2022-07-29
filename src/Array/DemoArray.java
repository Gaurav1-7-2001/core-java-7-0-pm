package Array;

public class DemoArray {

    public static void main(String[] args) {

        //  TODO :  Datatype array_name[] = { value1, value2, value3....value n};


        String cities[] = {"AGRA", " DELHI", "JAIPUR", "PUNE", "KANPUR"};

        System.out.println("array length is.." +cities.length);


        System.out.println("Access Array data index[0].." + cities[0]);
        System.out.println("Access Array data index[1] .." + cities[1]);
        System.out.println("Access Array data index[2].." + cities[2]);
        System.out.println("Access Array data index[3].." + cities[3]);
        System.out.println("Access Array data index[4].." + cities[4]);

        // Access data by for loop

        for (int i = 0; i < cities.length; i++) {

            System.out.println("Access array data by for loop.." + cities[i]);
        }

        // by while loop

        int i = 0;

        while (i < cities.length) {

            System.out.println("by while loop..." + cities[i]);
            i++;
        }


        // by advance loop

        // todo:  for( Datatype var_name : array_name){
        //                     code
        //                              }


        for( String var: cities ){

            System.out.println("by advance loop.." +var);
        }



    }

}

package Array.assignment;

public class ArrayName {

    public static void main(String[] args) {

        String name[] ={ "GAURAV" , "ROHIT" , " DEEPAK", "SAMYAK" , " SHIVAM", " ISWAR"};

        //BY FOR LOOP

        for ( int i=0 ; i< name.length ; i++){

            System.out.println("print name by for loop.." +name[i]);
        }

        // by while loop

            int i=0;
        while(i< name.length){

            System.out.println(" print by while loop.." +name[i]);
            i++;
        }


        // advance loop
        // todo Syntax : for(data_type var_name : array_name){code}

        for ( String var : name){

            System.out.println("by advance loop..." +var);
        }




    }

}

package assignment;

public class IfAssignment {

    public static void main(String[] args) {

        int RAM = 8;
        String brand = "LENOVO";

        if(RAM>4 && brand == "LENOVO"){

            System.out.println("it  have good specification with required ram and brand lenovo");
        }
        else{

            System.out.println("it have not good specification " );
        }
        RAM = 3;

        if (RAM >4 && brand =="LENOVO"){

            System.out.println("it have good specification with ram and brand");
        }
        else{
            System.out.println("it have not good specification ram is less than 4");

        }

        brand = "DELL";
        if ( RAM >4 && brand == "DELL"){

            System.out.println("it have good specification with required ram and brand");
        }
        else{
            System.out.println("it have not good specification and required ram and brand is dell");
        }

        RAM = 2;
        brand = "HP";
        if ( RAM>4 && brand =="LENOVO"){

            System.out.println("it have good specification with required ram and  brand");
        }
        else{

            System.out.println("it have not good specification with our requirement");
        }


    }
}

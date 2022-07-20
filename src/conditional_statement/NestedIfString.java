package conditional_statement;

public class NestedIfString {

    public static void main(String [] args){

        String country= "USA";
        int population =200;

        if(country=="INDIA"){

                if ( population>100){

                    System.out.println("high population...");
                }else{
                    System.out.println(" under control population");
                }
        }else{

            System.out.println("invalid country");
        }
    }
}

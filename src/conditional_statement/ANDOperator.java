package conditional_statement;

public class ANDOperator {

    public static void main(String[] args) {

        int age =20;
        String city_name ="AGRA";

        if(age>18 && city_name=="AGRA"){

            System.out.println( "your eligible for for voting in AGRA ");
        }
        else{

            System.out.println("you are not eligible for voting in agra");

        }

        age =10;

        if( age>18 && city_name=="AGRA"){

            System.out.println("You are eligible for voting in agra.");
        }
        else{

            System.out.println( "You are not eligible for voting in agra......FALSE && TRUE ==FALSE");

        }
    age =20;
    city_name ="DELHI";

        if ( age>18  && city_name == "DELHI"){

            System.out.println("you are eligible for voting in agra");
        }


    }
}

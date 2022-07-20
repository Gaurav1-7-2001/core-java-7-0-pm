package conditional_statement.assignment;

public class NestedIf11 {

    public static void main(String [] args){

        int age =20;
        String city ="delhi";
        if ( (age>18) && (city=="delhi" || city=="mumbai" || city=="chennai" ||city=="banglore") )

            System.out.println("your age is :" +age +" your city is metro city+ ");
    }
}

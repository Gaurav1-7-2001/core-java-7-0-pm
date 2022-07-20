package conditional_statement;

public class OrOperator {

    public static void main(String[] args) {

        int marks =75;
        String name = "RAJ";

        // TRUE || TRUE = TRUE  (1+1=1)

        if ( name=="RAJ" || marks>60){

            System.out.println("RAJ is passed out with first division.......TRUE || TRUE = TRUE  (1+1=1)");
        }
        else{
            System.out.println("RAJ is not passed out with first division ");
        }

        // TRUE || FALSE = TRUE (1+0=1)

        marks =59;

        if ( name=="RAJ" || marks>60){

            System.out.println("RAJ is passed out with first division .....TRUE || FALSE = TRUE (1+0=1)");
        }else{

            System.out.println("RAJ is not passed out with first division");
        }

        // FALSE || TRUE = TRUE (0+1=1)

        name ="RAHUL";
        marks =75;
        if (name =="RAJ" || marks>60){

            System.out.println( "RAJ is passed out with first division.....FALSE || TRUE = TRUE (0+1=1)" );
        }
        else{
            System.out.println("RAJ is not passed out with first division");

        }

        // FALSE || FALSE =FALSE (0+0=0)

        marks=58;
        if (name=="RAJ" || marks>60){

            System.out.println("Raj is passed out with first division");
        }else{

            System.out.println("RAJ is not passed out with first division....FALSE || FALSE =FALSE (0+0=0)");
        }






    }
}

package conditional_statement.assignment;

public class NotAssignment {

    public static void main(String[] args) {


        double height = 5.5;
        double weight= 60.5;

        // true +true =true (1+1=1)

        if ( !(height>5 || weight>55)){

            System.out.println(" youv are fit with having height =5.5 and weight = 60.5");

        }else{
            System.out.println(" you are not fit with our requirement ");
        }

        // false + true =true( 0+1=1)
        height=4.9;
        if ( !(height>5 || weight>55)){

            System.out.println("you are fit with having height = 4.9 and weight = 60....false + true =true( 0+1=1)");

        }
        else{

            System.out.println("you are not fit with our requirement");
        }

        // true + false = true (1+0=1)
        height=5.6;
        weight =50;
        if ( !(height>5 || weight>55) ){

            System.out.println("you are fit....true + false = true (1+0=1)");
        }
        else{

            System.out.println("you are not fit");
        }

        // false + false =false (0+0=0)

        height=4.8;
        weight=52;

        if (!(height>5 || weight>55) ){

            System.out.println("you are fit with our requirement");
        }else{

            System.out.println(" you are not fit with our requirement...false + false =false (0+0=0)");
        }

    }
}

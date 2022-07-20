package conditional_statement;

public class NotOperator {

    public static void main(String[] args) {

        int age =20;

        if(!( age>18)){

            System.out.println(" you are eligible for voting");
        }
        else{
            System.out.println("you are not eligible for voting");
        }

        String city ="Agra";
        if (!( age>18 && city=="Agra")){
            System.out.println( "you are eligible for voting in agra");
        }
        else{
            System.out.println(" you are not eligible for voting in agra");
        }

    }
}

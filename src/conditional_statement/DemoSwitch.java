package conditional_statement;

public class DemoSwitch {

    public static void main(String[] args) {

        /*: System.out.println("invalid no..");   switch(expression){

                case 1: System.out.println("hello");
                            break;
                case 2: System.out.println("hello");
                            break;
                 case 3: System.out.println("hello");
                            break;
                 case 4: System.out.println("hello");
                            break;

                    default

        */

        int age =60;

        switch (age){

            case 10 :
                System.out.println("you are child");
                                break;
            case 18 :
                System.out.println("person are young");
                            break;
            case 45 :
                System.out.println("person are men");
                break;
            case 60 :
                System.out.println("person are old");
                break;
            default :
                System.out.println("you are young");


        }

    }
}

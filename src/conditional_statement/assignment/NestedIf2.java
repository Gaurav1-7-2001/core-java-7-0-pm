package conditional_statement.assignment;

import java.util.*;
public class NestedIf2 {

    public static void main(String [] args){

      /*  Scanner sc =new Scanner(System.in);
        System.out.println("enter your marks");
        int marks =sc.nextInt();

        Scanner s =new Scanner(System.in);
        System.out.println("enter your subject");
        String sub =s.nextLine();*/

        int marks =55;
        String sub="ARTS";
        //if( (marks>33) && (sub.equals("ARTS") || sub.equals("SCIENCE")))

                if((marks>33) && (sub=="ARTS" || sub=="SCIENCE")) {




                  if ( marks>60){
                      System.out.println("FIRST DIVISION, marks :" +marks +" ,in subject :" +sub);
                  }
                  if (marks>45){
                      System.out.println("second division, marks :" +marks +",in subject:" +sub);
                  }
                  if( marks>33){
                      System.out.println("third division, marks :" +marks +", in subject :" +sub );
                  }
              }else{

                  System.out.println("invalid subject :" +sub);
              }

            }


    }


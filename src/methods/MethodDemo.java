package methods;

public class MethodDemo {

    public void square(int num){


        System.out.println(" Square of number is : "+ (num*num));
    }

    public void checkEvenOdd(int num){

        if (num%2==0){
            System.out.println("Number is EVEN : "+num);
        }else{
            System.out.println("Number is ODD :"+num );
        }
    }


    public void DayOfWeek(int day ){



        switch (day){

            case 1:
                System.out.println("Monday");
                break;

            case 2 :
                System.out.println("Tuesday");
                break;

            case 3 :
                System.out.println("Wednesday");
                  break;

            case 4 :
                System.out.println("Thursday");
                break;

            case 5 :
                System.out.println("Friday");
                break;

            case 6 :
                System.out.println("Saturday");
                break;

            case 7 :
                System.out.println("Sunday");
                break;

            default:
                System.out.println("invalid day");
                break;


        }





    }


    public static void main(String[] args) {

        MethodDemo obj =new MethodDemo();
        obj.square(6);
        obj.checkEvenOdd(97);
        obj.DayOfWeek(5);
    }
}

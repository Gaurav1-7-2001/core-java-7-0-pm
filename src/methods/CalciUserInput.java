package methods;
import java.util.*;
public class CalciUserInput {

    public int add(int a, int b){
        int sum=a+b;
        return sum;
    }

    public int sub(int a, int b){
        int sub=a-b;
        return sub;
    }
    public int mul(int a, int b){
        int mul=a*b;
        return mul;
    }
    public double div(double a, double b){
        double div=a/b;
        return div;
    }

    public static void main(String[] args) {
        String flag="y";
        while( flag.equals("y")) {

            Scanner sc = new Scanner(System.in);

            System.out.print("enter value of a :");
            int a = sc.nextInt();

            System.out.print("enter value of b :");
            int b = sc.nextInt();

            Scanner s = new Scanner(System.in);
            System.out.print("Enter your Symbol : ");
            String sym = s.nextLine();

            CalciUserInput obj = new CalciUserInput();

            if (sym.equals("+")) {
                int add = obj.add(a, b);
                System.out.println("Addition is :" + add);
            } else if (sym.equals("-")) {
                int sub = obj.sub(a, b);
                System.out.println("Subtraction  is :" + sub);
            } else if (sym.equals("*")) {
                int mul = obj.mul(a, b);
                System.out.println("Multiply is :" + mul);
            } else if (sym.equals("/")) {
                double div = obj.div(a, b);
                System.out.println("division is :" + div);
            } else {
                System.out.println("INVALID SYMBOL..");
            }

            System.out.println("press y to continue and press any key to stop calci");
             flag =s.nextLine();

        }

    }


}








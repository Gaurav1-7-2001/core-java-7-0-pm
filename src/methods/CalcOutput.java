package methods;

public class CalcOutput {

    public int add(int a,int b){

        int sum =a+b;
        return sum;
    }

    public int sub(int a,int b){

        int sub =a-b;
        return sub;
    }

    public int multiply(int a,int b){

        int mul =a*b;
        return mul;
    }
    public double division(double a,double b){
        double div =a/b;
        return div;
    }

    public static void main(String[] args) {

        CalcOutput obj =new CalcOutput();
        int sum =obj.add(5,5);
        System.out.println("ADDITION of two number :"+sum);

        int sub =obj.sub(9,5);
        System.out.println("Subtration of two number is :"+sub);

        int mul =obj.multiply(4,6);
        System.out.println("multiply of two number is :"+mul);

        double div =obj.division(9,4);
        System.out.println("division of two number is :"+div);
    }
}

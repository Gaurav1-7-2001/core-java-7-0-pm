package methods;

public class CalcInput {

    public void add(int a, int b ,int c,int d){
        int sum =a+b+c+d;
        System.out.println("Addition of two number is.."+sum);
    }
    public void sub(int a, int b ,int c ,int d){
        System.out.println("Subtraction of four number is.. " +(a-b-c-d));
    }
    public void multiply(int a ,int b,int c){
        System.out.println("Multiply of three number is.." +(a*b*c));
    }
    public void divide(double a, double b ,double c ,double d){
        System.out.println(" Divide of four number is..."+(a/b/c/d));
    }

    public static void main(String[] args) {

        CalcInput obj =new CalcInput();
        obj.add(8,5,3,8);
        obj.sub(6,7,8,2);
        obj.multiply(4,5,2);
        obj.divide(12,2,6,2);
    }

}

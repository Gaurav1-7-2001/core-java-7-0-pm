package methods.assignment;

public class CubeMethod {

    public void cube(){

        int num=3;
        System.out.println("cube of number is : " +(num*num*num));
    }

    public static void main(String[] args) {

        CubeMethod obj =new CubeMethod();
        obj.cube();

    }
}

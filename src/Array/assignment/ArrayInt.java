package Array.assignment;

public class ArrayInt {

    public static void main(String[] args) {

        int marks[] = { 40,50,60,70,80,90,10};

        //by for loop

        for (int i= 0; i< marks.length; i++){

            System.out.println(" print marks by for loop .. "+marks[i]);
        }

        // by while loop
        int i=0;
        while(i<marks.length){

            System.out.println("by using while loop.." +marks[i]);
            i++;
        }

        //by advance loop

        for ( int var :marks){

            System.out.println(" by advance loop..." +var );
        }

    }

}

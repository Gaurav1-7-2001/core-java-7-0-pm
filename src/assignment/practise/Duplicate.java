package assignment.practise;

public class Duplicate {

    public static void main(String[] args) {

        int a[] ={ 2,3,5,4,5,6,5,6,3,2,3};
//        int len = a

        int fr[] ={a.length};

        for ( int i=0; i<a.length; i++ ){

            for (int j =i+1 ;j<a.length; j++){

                if(a[i]==a[j] ){

                    System.out.println( a[i]);

                }

            }
        }



    }

}

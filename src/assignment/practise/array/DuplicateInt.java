package assignment.practise.array;

public class DuplicateInt {

    public static void main(String[] args) {

        int a[] ={2,3,4,5,2,3,3,3,4,2};
            int visited=-1;
        int fr[]=new int[a.length];

        for ( int var: a){
            System.out.println("Array is.."+var);
        }

        for (int i =0; i<a.length; i++) {

            int count = 1;
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {

                    count++;

                    fr[j] = visited;

                }

            }

            if (fr[i] != visited) {

                fr[i] = count;

            }

        }
            System.out.println("---------------------------------------");
            System.out.println(" Element | Frequency");
            System.out.println("---------------------------------------");
            for(int i = 0; i < fr.length; i++){
                if(fr[i] != visited)
                    System.out.println("    " + a[i] + "    |    " + fr[i]);
            }

        }



    }





package assignment;

//import java.util.Locale;
//
//public class Duplicatewords {
//
//
//
//
//    public static void main(String[] args) {
//        String message =" i samyak is black and his hair is black";
//         message= message.toLowerCase();
//        String []word = message.split("");
//
//        System.out.println(" duplicate words are :");
//        int count;
//
//        for (int i =0; i< word.length; i++){
//
//            count =1;
//
//            for (int j=i+1; j< word.length; j++){
//
//                if (word[i].equals(word[j]) ){
//
//                    count++;
//
//                    word[j]="0";
//
//                }
//
//
//            }
//
//            if (count >1 && word[i]!="0"){
//                System.out.println("duplicate word "+word[i]);
//            }
//        }
//    }
//
//}



public class Duplicatewords {
    public static void main(String[] args) {
        String string = "Big black bug bit a big black dog on his big black nose";
        int count;

        //Converts the string into lowercase
        string = string.toLowerCase();

        //Split the string into words using built-in function
        String words[] = string.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for(int i = 0; i < words.length; i++) {
            count = 1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }

            //Displays the duplicate word if count is greater than 1
            if(count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }
}
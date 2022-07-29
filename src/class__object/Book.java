package class__object;

public class Book {

    String name = "Oxford ";
    int pages =500;
    double price= 65.5;
    String type ="adventure";

    public static void main(String[] args) {

        // todo :   object creation
        // TODO :  ClassNme object = new ClassName();
        Book book1 =new Book();
        System.out.println( " Book name is : " +book1.name);
        System.out.println( " Pages  is : " +book1.pages);
        System.out.println( " Price  is : " +book1.price);
        System.out.println( " Book Type  is : " +book1.type);
    }




}

package methods.assignment;

public class AssignVote {

    public void check_for_vote(int age , String city){

        if ( age>18 && city=="tundla"){
            System.out.println( "you can vote in tundla because => "+"your Age is :" +age +" Your city :"+city);
        }
        else{
            System.out.println(" YOU CANNOT VOTE IN TUNDLA");
        }
    }

    public static void main(String[] args) {

        AssignVote obj =new AssignVote();
        obj.check_for_vote(19,"tundla");

    }
}

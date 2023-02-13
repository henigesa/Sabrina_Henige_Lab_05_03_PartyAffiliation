
//class PolitcalAffiliation
//	main ()
//		String affiliation
//			output “Please enter your political affiliation (Democrat, Republican, or Independent).”
//			input affiliation
//			if [affiliation == Democrat] then
//				output “You get a Democratic Donkey!”
//			else if [affiliation == Republican] then
//				output “You get a Republican Elephant!”
//			else if [affiliation == Independent] then
//				output “You get an Independent Man!”
//			else
//				output “Sorry, I don’t recognize that political affiliation.”
//			end if
//	return
//end class
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declare variables
        String affiliationInput ;
        //prompt user to enter their party
        System.out.println("Please enter your political affiliation (Democrat, Republican, or Independent)");
        //take the user input
        affiliationInput = input.nextLine() ;
        //if then
        if (affiliationInput.equals("Democrat")) {
            System.out.println("You get a democratic donkey!");
        }
        else if (affiliationInput.equals("Republican")) {
            System.out.println ("You get a republican elephant!");
        }
        else if (affiliationInput.equals("Independent")) {
            System.out.println("You get an independent man!");
        }
        else {
            System.out.println("Sorry, I don't recognize that affiliation");
        }

    }
}

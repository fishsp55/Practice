import java.util.Scanner;

public class BasketballAnalyzer {
	public static void main(String[] args){
		
		int uncWins = 5;
		int remainingWins;
		
		System.out.println("Welcome to the Basketball Analyzer! Which school do you " + 
		                   "believe has the greatest basketball program in the US?");
		Scanner user_input = new Scanner(System.in);
		String school = user_input.nextLine();
		
		if (school.equalsIgnoreCase("UNC")){
			System.out.println("How many NCAA championships does UNC have?");
			Scanner user_input2 = new Scanner(System.in);
			int user_response = user_input2.nextInt();
			
			if (user_response < uncWins){
				System.out.println("Ugh. You are a fake fan. Get out of my sight.");
				
			}else if (user_response == uncWins){
				System.out.println("I salute you, true fan.");
			}else{
				System.out.println("Hmm. Hopefully one day this may be true...");
			}
			
		}else if (school.equalsIgnoreCase("Duke")){
			System.out.println("Get out. Just... get out.");
		}else{
			System.out.println("How many NCAA championships has " + school + " won?");
			Scanner user_input3 = new Scanner(System.in);
			int user_response2 = user_input3.nextInt();
			
			if (user_response2 < uncWins){
				remainingWins = uncWins - user_response2;
				System.out.println("Hah. The Almighty UNC has " + remainingWins +
						            " more wins than your lame school!");
			}else if (user_response2>=uncWins){
				System.out.println("Hmph, okay. But I bet you're lying.");
			}
		}
		System.out.println("Thank you for using Basketball Analyzer. Have a great day! And remember, go heels!!");
	}
}
//END OF FILE

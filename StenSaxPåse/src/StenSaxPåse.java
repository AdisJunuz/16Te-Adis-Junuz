import java.util.Scanner;
public class StenSaxPåse {

	public static void main(String[] args) {
		
		//rock beats scissors
		//scissors beats paper
		//paper beats rock
		
		Scanner console = new Scanner (System.in);
		
		String choice = console.nextLine();
	}
	
	public static boolean isValid(String string) {
		if (string.equalsIgnoreCase("rock")) {
			return true;
		}
		if (string.equalsIgnoreCase("paper")) {
			return true;
					
		}
		if (string.equalsIgnoreCase("scissors")) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	}



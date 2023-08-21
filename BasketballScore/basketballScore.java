package BasketballScore;
import java.util.*;
public class basketballScore {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int home, guest, homeScore = 0, guestScore = 0, option;
		
		do {
			System.out.println("1. HOME ");
			System.out.println("2. GUEST ");
			System.out.println("3. RESET");
			System.out.println("4. DISPLAY SCORE");
			System.out.println("5. EXIT");
			System.out.print("Option: ");
			option = s.nextInt();
			
			switch(option) {
				case 1:
					System.out.print("Enter Score: ");
					home = s.nextInt();
					homeScore = homeScore + home;
					System.out.println("HOME SCORE: " + homeScore);
					System.out.println();
				break;
				case 2:
					System.out.print("Enter Score: ");
					guest = s.nextInt();
					guestScore = guestScore + guest;
					System.out.println("GUEST SCORE: " + guestScore);
					System.out.println();
				break;
				case 3:
					homeScore = 0;
					guestScore = 0;
					System.out.println("Score has been Reset.");
					System.out.println("HOME SCORE: " + homeScore + " GUEST SCORE: " + guestScore);
					System.out.println();
				break;
				case 4:
				System.out.println("HOME SCORE: " + homeScore + " GUEST SCORE: " + guestScore);
				System.out.println();
				break;
			}
		}while(option != 5);
	}

}

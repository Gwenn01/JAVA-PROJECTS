package RockPaperScissorsGame;
import java.util.*;
public class RPSgame {
	static Scanner s = new Scanner(System.in);
	static Random r = new Random();
	
	
	public static void main(String[] args) {
		display();
		int user = 0, bot;
		
		do {
			System.out.print("OPTION: ");
			bot = r.nextInt(3) + 1;
			user = s.nextInt();
		if(user == 1) {
			   System.out.println("YOU THROW ROCK");
			}else if(user == 2) {
				System.out.println("YOU THROW PAPER");
			}else if(user == 3) {
				System.out.println("YOU THROW SCISSORS");
			}else {
				System.out.println("INVALID");
			}
		
		if(bot == 1 && user != 4) {
			   System.out.println("BOT THROW ROCK");
			}else if(bot == 2 && user != 4) {
				System.out.println("BOT THROW PAPER");
			}else if(bot == 3 && user != 4) {
				System.out.println("BOT THROW SCISSORS");
			}
		
			if(user == bot) {
				System.out.println();
				System.out.println("ITS A TIE!!!");
				System.out.println();
			}else if(user == 1 && bot == 2) {
				System.out.println();
				System.out.println("YOU LOSE!!!");
				System.out.println();
			}else if(user == 1 && bot == 3) {
				System.out.println();
				System.out.println("YOU WIN!!!");
				System.out.println();
			}else if(user == 2 && bot == 1) {
				System.out.println();
				System.out.println("YOU WIN!!!");
				System.out.println();
			}else if(user == 2 && bot == 3) {
				System.out.println();
				System.out.println("YOU LOSE!!!");
				System.out.println();
			}else if(user == 3 && bot == 1) {
				System.out.println();
				System.out.println("YOU LOSE!!!");
				System.out.println();
			}else if(user == 3 && bot == 2) {
				System.out.println();
				System.out.println("YOU WIN!!!!");
				System.out.println();
			}
		}while(user != 4);
	}
	public static void display(){
		System.out.println("=============================");
		System.out.println("   ROCK PAPER SCISSORS GAME  ");
		System.out.println("=============================");
		System.out.println("1. ROCK                      ");
		System.out.println("2. PAPER                     ");
		System.out.println("3. SCISSORS                  ");
		System.out.println("4. EXIT                      ");
		System.out.println("=============================");
	}
}

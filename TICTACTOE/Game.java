package TICTACTOE;
import java.util.*;

public class Game {
	public String[] board = new String[9];
	public int[] boardNums = new int[9];
	public String X = "X";
	public String O = "O";
	public int inputP1;
	public int inputP2;
	
	public void players() {
		System.out.println("===WELCOME TO TIC TAC TOE GAME===");
	}
	
	public void setBoard() {
		for(int i = 0; i < board.length; i++) {
			board[i] = String.valueOf(i+1);
		}
		for(int i = 0; i < boardNums.length; i++) {
			boardNums[i] = (i+1);
		}
	}
	public void displayBoard() {
		String line = "--------------------";
		System.out.println(line);
		for(int i = 0; i < board.length; i++) {
			System.out.print(" | " + board[i] + " | ");
			if(i == 2 || i == 5) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println(line);
	}
	public void inputPlayer1() {
		Scanner s = new Scanner(System.in);
		System.out.print("Player1: ");
		inputP1 = s.nextInt();
	}
	public void inputPlayer2() {
		Scanner s = new Scanner(System.in);
		System.out.print("Player2: ");
		inputP2 = s.nextInt();
	}
	public boolean winX() {
		boolean result = true;
		if(board[0] == "X" && board[1] == "X" && board[2] == "X") {
			result = false;
		}
		if(board[3] == "X" && board[4] == "X" && board[5] == "X") {
			result = false;
		}
		if(board[6] == "X" && board[7] == "X" && board[8] == "X") {
			result = false;
		}
		
		if(board[0] == "X" && board[3] == "X" && board[6] == "X") {
			result = false;
		}
		if(board[1] == "X" && board[4] == "X" && board[7] == "X") {
			result = false;
		}
		if(board[2] == "X" && board[5] == "X" && board[8] == "X") {
			result = false;
		}
		
		if(board[0] == "X" && board[4] == "X" && board[8] == "X") {
			result = false;
		}
		if(board[2] == "X" && board[4] == "X" && board[6] == "X") {
			result = false;
		}
		
		return result;
	}
	public boolean winO() {
		boolean result = true;
		if(board[0] == "O" && board[1] == "O" && board[2] == "O") {
			result = false;
		}
		if(board[3] == "O" && board[4] == "O" && board[5] == "O") {
			result = false;
		}
		if(board[6] == "O" && board[7] == "O" && board[8] == "O") {
			result = false;
		}
		
		if(board[0] == "O" && board[3] == "O" && board[6] == "O") {
			result = false;
		}
		if(board[1] == "O" && board[4] == "O" && board[7] == "O") {
			result = false;
		}
		if(board[2] == "O" && board[5] == "O" && board[8] == "O") {
			result = false;
		}
		
		if(board[0] == "O" && board[4] == "O" && board[8] == "O") {
			result = false;
		}
		if(board[2] == "O" && board[4] == "O" && board[6] == "O") {
			result = false;
		}
		
		return result;
	}
	
	public void changingBoard() {
		while(winX() && winO()) {
			inputPlayer1();
			inputPlayer2();
			for(int i = 0; i < board.length; i++) {
				if(boardNums[i] == inputP1) {
					board[i] = "X";
				}
				if(boardNums[i] == inputP2) {
					board[i] = "O";
				}
			}
			winX();
			winO();
			displayBoard();
		}
		
		if(winX()) {
			System.out.println("PLAYER2 WINNERS!!!!");
		}else {
			System.out.println("PLAYER1 WINNERS!!!!");
		}
		
	}
	
	
}

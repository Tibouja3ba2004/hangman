package hangman;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner clavier= new Scanner (System.in);
		String wordToGuess= clavier.nextLine();
		System.out.println("one or two players?");
		if(clavier.next().equals("one") ||clavier.next().equals("1")) {
			HangmanGame game= new HangmanGame();
			HumanPlayer player= new HumanPlayer(); 
}
	}

}

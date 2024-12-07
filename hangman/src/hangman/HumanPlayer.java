package hangman;

import java.util.Scanner;

public class HumanPlayer implements Player {
	private String name;
	public static int score=0;

    public HumanPlayer(String name) {
        this.name = name;
    }

    
    public void Guess(HangmanGame game) {
        Scanner scan = new Scanner(System.in);
        System.out.print("donner un char : ");
        char guess = scan.next().charAt(0); // Player enters a guess
        game.processGuess(guess);
    }

    
    public void Status() { 
    	System.out.println(name + "'s turn to play!");
    }


	@Override
	public void Score() {
		if (SinglePlayer.isWon()) {
			score=score+100;
		}
		if (HangmanGame.isGameOver()) {
			score=score-50;
		}
			
	}
	public String toString() {
		return("le score de" + name+"est" +score);
	}
}


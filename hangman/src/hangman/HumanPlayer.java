package hangman;

import java.util.Scanner;

public class HumanPlayer implements Player {
	private String name;
	private static int score=0;
	
    public HumanPlayer(String name) {
        this.name = name;
    }

    @Override
    public void Guess(HangmanGame game) {
        Scanner scan = new Scanner(System.in);
        System.out.print("donner un char : ");
        char guess = Character.toLowerCase(scan.next().charAt(0)); 
        game.processGuess(guess);
        
    
    }
    @Override
    public void Status() { 
    	System.out.println(name + "'s turn to play!");
    }


	@Override
	public void Score() {
		
		if (SinglePlayer.resultat==1) {
			score=score+100;
		}
		if (SinglePlayer.resultat==0) {
			score=score-50;
		}
			
	}
	public String toString() {
		return("le score de" + name+"est" +score);
	}
}


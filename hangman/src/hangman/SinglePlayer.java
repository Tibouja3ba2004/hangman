package hangman;

import java.util.Random;
import java.util.Scanner;

public class SinglePlayer extends HangmanGame{
	String wordToGuess = ""; // Le mot choisi pour ce niveau
    int maxAttempts = 6; // Nombre d'essais par défaut

public int difficulty() {
	        System.out.println("Choisir difficulté entre 1 et 6 (1 pour très facile et 6 pour très difficile) : ");
	        Scanner scan = new Scanner(System.in);
	        int level = scan.nextInt(); 

	        while (level < 1 || level > 6) {
	            System.out.println("Difficulté invalide. Choisir entre 1 et 6 : ");
	            level = scan.nextInt();
	        }

	        return level;
	    }
    
public void startGame(String wordToGuess,int maxAttempts) {
int difficultyLevel = difficulty();
	        Random rand = new Random();
 switch (difficultyLevel) {
                case 1:
	                wordToGuess = TableauMot.easy[rand.nextInt(TableauMot.easy.length)];
	                maxAttempts = 6;
	                break;
	            case 2:
	                wordToGuess = TableauMot.easy[rand.nextInt(TableauMot.easy.length)];
	                maxAttempts = 5;
	                break;
	            case 3:
	                wordToGuess = TableauMot.medium[rand.nextInt(TableauMot.medium.length)];
	                maxAttempts = 6;
	                break;
	            case 4:
	                wordToGuess = TableauMot.medium[rand.nextInt(TableauMot.medium.length)];
	                maxAttempts = 5;
	                break;
	            case 5:
	                wordToGuess = TableauMot.hard[rand.nextInt(TableauMot.hard.length)];
	                maxAttempts = 6;
	                break;
	            case 6:
	                wordToGuess = TableauMot.hard[rand.nextInt(TableauMot.hard.length)];
	                maxAttempts = 5;
	                break;
	            
	        }}
	public SinglePlayer(String wordToGuess, int maxAttempts) {
	    		super(wordToGuess, maxAttempts);
	    		// TODO Auto-generated constructor stub
	    	}
	@Override
	public boolean isWon() {
		return wordToGuess.equals(currentGuess);
	}

	@Override
	public boolean isGameOver() {
		return(attemptsLeft==0 || isWon());
	}

	@Override
	public void processGuess(char guess) {
		int correct=0;
		boolean existe= false;
		StringBuilder newGuess = new StringBuilder(currentGuess);
		for(int i =0;i<wordToGuess.length();i++) {
			
			if (wordToGuess.charAt(i) == guess) {
                newGuess.setCharAt(i, guess); 
                existe = true;
                correct++;
            }
        }
		if(correct ==wordToGuess.length()) {
			return;
		}
        if (!existe) {
            attemptsLeft--; 
        }
        currentGuess = newGuess.toString();
    }
		
	
	

}

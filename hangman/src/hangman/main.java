package hangman;

import java.util.Random;
import java.util.Scanner;

public class main{

	public static void main(String[] args) {
		System.out.println("Welcome to Hangman !");
		System.out.println("one or two players?");
		Random rand = new Random();
		
	while(true) {
		Scanner clavier= new Scanner (System.in);
		String input= clavier.next();
		if(input.equals("one") ||input.equals("1")) {
			String wordToGuess="";
			int maxAttempt=6;
			gameSetup start=start(wordToGuess,maxAttempt);
			SinglePlayer game= new SinglePlayer(start.getWordToGuess(),start.getMaxAttempts());
			System.out.println("Your Name Please:");
			HumanPlayer player= new HumanPlayer(clavier.next()); 
			while(!(game.isGameOver()) && ! (game.isWon())) {
			game.displayGameStatus();
			player.Guess(game);
			
			}
			if(game.isWon()) {
				System.out.println("Congratulations, You have saved the man from hanging");
				System.out.println("The word was :" +start.getWordToGuess());

			}
			else if(game.isGameOver()) {
				System.out.println("OH NO! HE IS DEAD");
				System.out.println("The word was :" +start.getWordToGuess());

			}
			break;
		}		
		else if(input.equals("two") ||input.equals("2")) {
			System.out.println("wait");
			break;
		}
		else {
			System.out.println("try again");
			
			}
		}
	}
	
	public static int difficulty() {
        System.out.println("Choisir difficulté entre 1 et 6 (1 pour très facile et 6 pour très difficile) : ");
        Scanner scan = new Scanner(System.in);
        int level = scan.nextInt(); 
        while (level < 1 || level > 6) {
            System.out.println("Difficulté invalide. Choisir entre 1 et 6 : ");
            level = scan.nextInt();
        }
        return level;
    }
	public static gameSetup start(String wordToGuess,int maxAttempts) {
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
		            
		        }
	 	return new gameSetup(wordToGuess,maxAttempts);

	 }

}

package hangman;


public abstract class HangmanGame {
	
	    protected String wordToGuess;
	    protected String currentGuess;
	    protected int attemptsLeft;

	    // Constructor
	    public HangmanGame(String wordToGuess, int maxAttempts) {
	        this.wordToGuess = wordToGuess;
	        this.currentGuess = "_".repeat(wordToGuess.length()); 
	        this.attemptsLeft = maxAttempts;
	    }

	    // Abstract method to check if the player has won
	    public abstract boolean isWon();

	    // Abstract method to check if the game is over
	    public abstract boolean isGameOver();

	    // Abstract method to process a player's guess
	    public abstract void processGuess(char guess);
	    
	    // Method to display the current game state
	    
	    	 
	    	 
	    
	    public void displayGameStatus() {
	        System.out.println("Word to Guess: " + currentGuess);
	        System.out.println("Attempts Left: " + attemptsLeft);
	    }
	}



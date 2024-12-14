package hangman;


public abstract class HangmanGame {
	
	    protected String wordToGuess;
	    protected String currentGuess;
	    protected int attemptsLeft;
	    public HangmanGame() {
	    	this.wordToGuess = "whatisthelalala";
	        this.currentGuess = "-".repeat(wordToGuess.length()); 
	        this.attemptsLeft = 6;
	    }
	    public HangmanGame(String wordToGuess, int maxAttempts) {
	        this.wordToGuess = wordToGuess;
	        this.currentGuess = "-".repeat(wordToGuess.length()); 
	        this.attemptsLeft = maxAttempts;
	    }

	    public abstract boolean isWon();

	    public abstract boolean isGameOver();

	    public abstract void processGuess(char guess);	    
	    	 
	    
	    public void displayGameStatus() {
	        System.out.println("Word to Guess: " + currentGuess);
	        System.out.println("Attempts Left: " + attemptsLeft);
	    }
	}



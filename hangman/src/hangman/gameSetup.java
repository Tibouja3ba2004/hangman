package hangman;

public class gameSetup {
	    private String wordToGuess;
	    private int maxAttempts;

	    public gameSetup(String wordToGuess, int maxAttempts) {
	        this.wordToGuess = wordToGuess;
	        this.maxAttempts = maxAttempts;
	    }

	    public String getWordToGuess() {
	        return wordToGuess;
	    }

	    public int getMaxAttempts() {
	        return maxAttempts;
	    }
	}



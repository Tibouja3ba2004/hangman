package hangman;

public class SinglePlayer extends HangmanGame{
	String wordToGuess = ""; 
    int maxAttempts = 6; 
    public static int resultat;


public SinglePlayer(String wordToGuess,int maxAttempts) {
	super(wordToGuess, maxAttempts);
	this.wordToGuess = wordToGuess;  
    this.currentGuess = "-".repeat(wordToGuess.length());
    this.maxAttempts=maxAttempts;
}


@Override
public boolean isWon() {
		resultat=1;
		return wordToGuess.equals(currentGuess);
	}
@Override
public boolean isGameOver() {
		resultat=0;
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
        drawbody(maxAttempts,attemptsLeft);
        currentGuess = newGuess.toString();
        
		}
    
public void drawbody(int taille,int attemptsLeft) {
	int x=taille-attemptsLeft;
	System.out.println("-----");
	System.out.println("  |  ");
	if(taille==5) {
		switch(x) {
		case 0:
			
			break;
		case 1:
			System.out.println("  O");
			break;
		case 2:
			System.out.println(" \\O");
			
			break;
		case 3:
			System.out.println(" \\O/");
			
			break;
		case 4:
			System.out.println(" \\O/");			
			System.out.println(" /");
			break;
		case 5:
			System.out.println(" \\O/");
			System.out.println(" /\\");
			break;
		}}
	else if(taille==6) {
		switch(x) {
	case 0:
		
		break;
	case 1:
		System.out.println("  O");
		break;
	case 2:
		System.out.println(" \\O");
		
		break;
	case 3:
		System.out.println(" \\O/");	
		
		break;
	case 4:
		System.out.println(" \\O/");	
		System.out.println("  |");			
		break;
	case 5:
		System.out.println(" \\O/");	
		System.out.println("  |");			
		System.out.println(" /");
		break;
	case 6:
		System.out.println(" \\O/");
		System.out.println("  |");			
		System.out.println(" / \\");
		break;
		}
	}		

	}
}


	
	



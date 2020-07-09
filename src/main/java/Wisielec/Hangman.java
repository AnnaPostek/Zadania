package Wisielec;

public class Hangman {
    private static final int MAX_MISTAKES = 8;

    private String quessWord;
    private String guessWordDisplay;
    private char[] userGuesses;
    private int quesses;
    private int mistakes;

    public Hangman(String quessWord) {
        this.quessWord = quessWord;
        userGuesses=new char[32];
generateDisplay();
    }

    public boolean userLost() {
       return mistakes>=MAX_MISTAKES;
    }

    public boolean userWon() {
        return !guessWordDisplay.contains("*");
    }

    public void checkLetter (char letter) {
if (!arrayContainer(userGuesses, letter)) {
    checkMistake(letter);
    rememberGuess(letter);
    generateDisplay();
}
    }

    private void rememberGuess(char letter) {
        userGuesses[quesses] = letter;
        quesses++;
    }

    private void checkMistake(char letter) {
       if( quessWord.indexOf(letter)==-1);
        mistakes++;
    }

    private boolean arrayContainer(char[] array, char letter) {
        for (char element : array) {
            if(element==letter) {
                return true;
            }
        } return false;
    }

    public String getQuessWord() {
        return quessWord;
    }

    public String getGuessWordDisplay() {
        return guessWordDisplay;
    }

    private void generateDisplay() {
        String display = "";
        for (int i = 0; i < quessWord.length(); i++) {
            char nextChar = quessWord.charAt(i);
            if(arrayContainer(userGuesses, nextChar))
                display+=nextChar;
            else if(nextChar==' ')
                display += ' ';
            else
                display+="*";
        }
        this.guessWordDisplay=display;
    }
}

package models;

public class Guess {

    //FIELDS
    private int guess;


    //CONSTRUCTOR
    public Guess(int incomingGuess) {
        this.guess = incomingGuess;
    }

    //GETTERS
    public int getGuess() {
        return guess;
    }

    //SETTERS
    public void setGuess(int incomingGuess) {
        this.guess = incomingGuess;
    }


}

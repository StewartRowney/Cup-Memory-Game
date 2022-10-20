package models;

import java.util.Random;

public class Game {

    //FIELDS
    private int numberOfCups;


    //CONSTRUCTOR
    public Game(int incomingNumberOfCups) {
        this.numberOfCups = incomingNumberOfCups;
    }

    //GETTERS
    public int getNumberOfCups() {
        return numberOfCups;
    }

    //SETTERS
    public void setGuess(int incomingNumberOfCups) {
        this.numberOfCups = incomingNumberOfCups;
    }

}

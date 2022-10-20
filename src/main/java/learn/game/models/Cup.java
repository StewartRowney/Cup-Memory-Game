package learn.game.models;

public class Cup {

    //FIELDS
    private boolean hasBall;


    //CONSTRUCTOR
    public Cup(boolean incomingHasBall) {
        this.hasBall = incomingHasBall;
    }


    //GETTERS
    public boolean getHasBall() {
        return this.hasBall;
    }


    //SETTERS
    public void setHasBall(boolean incomingHasBall) {
        this.hasBall = incomingHasBall;
    }


}

package com.radhsyn83;

public class Skateboard extends Vehicle{
    private double myBoardLenght;

    public Skateboard(String myBrand, String myMOdel) {
        super(myBrand, myMOdel);
    }

    public double getMyBoardLenght() {
        return myBoardLenght;
    }

    public void setMyBoardLenght(double myBoardLenght) {
        this.myBoardLenght = myBoardLenght;
    }
}
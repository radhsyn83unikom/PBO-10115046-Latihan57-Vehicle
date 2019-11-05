package com.radhsyn83;

public class Bicycle extends Vehicle{
    private int myGearCount;

    public Bicycle(String myBrand, String myMOdel) {
        super(myBrand, myMOdel);
        System.out.println("Bicycle");
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
}
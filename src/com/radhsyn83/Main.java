package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bicycle bicycle = new Bicycle("Trek Bike", "7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println("Brand : "+bicycle.getMyBrand());
        System.out.println("Model : "+bicycle.getMyMOdel());
        System.out.println("Jumlah Gear : "+bicycle.getMyGearCount());

        System.out.println("");

        Skateboard sb = new Skateboard("Ally Skate", "Rocket");
        sb.setMyBoardLenght(54.5);
        System.out.println("Brand : "+sb.getMyBrand());
        System.out.println("Model : "+sb.getMyMOdel());
        System.out.println("Panjangnya Board : "+sb.getMyBoardLenght());
    }
}

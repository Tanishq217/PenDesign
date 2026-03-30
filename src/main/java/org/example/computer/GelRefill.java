package org.example.computer;

public class GelRefill implements RefillStrategy {

    private String inkColor;

    private int gelLevel;


    public GelRefill(String inkColor) {

        this.inkColor = inkColor;

        this.gelLevel = 0;

    }


    public void refill() {


        System.out.println("Replacing gel ink cartridge with " + inkColor + " gel ink");


        gelLevel = 100;


        System.out.println("Gel refill completed. Gel level: " + gelLevel + "%");
    }
}
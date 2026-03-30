package org.example.computer;

public class InkRefill implements RefillStrategy {


    private String inkColor;

    private int inkLevel;



    public InkRefill(String inkColor) {
        this.inkColor = inkColor;



        this.inkLevel = 0;
    }

    public void refill() {

        System.out.println("Filling ink reservoir with " + inkColor + " ink");

        inkLevel = 100;

        System.out.println("Ink refill completed. Ink level: " + inkLevel + "%");
    }
}

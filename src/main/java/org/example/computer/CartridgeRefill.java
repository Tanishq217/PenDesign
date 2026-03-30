package org.example.computer;

class CartridgeRefill implements RefillStrategy{

    private String inkColor;

    public CartridgeRefill(String inkColor) {

        this.inkColor = inkColor;

    }

    public void refill() {



        System.out.println("Replacing ink cartridge with " + inkColor + " ink");

        System.out.println("Cartridge replacement completed");


    }
}

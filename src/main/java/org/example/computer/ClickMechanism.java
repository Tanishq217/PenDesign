package org.example.computer;

class ClickMechanism implements StartingStrategy{


    private boolean isExtended = false;

    @Override
    public void start() {
        if (!isExtended) {
            System.out.println("Clicking mechanism to extend nib...");
            isExtended = true;
        } else {
            System.out.println("Nib is already extended");
        }
    }

    @Override
    public void close() {
        if (isExtended) {
            System.out.println("Clicking mechanism to retract nib...");
            isExtended = false;
        } else {
            System.out.println("Nib is already retracted");


        }
    }

}

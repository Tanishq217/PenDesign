package org.example.computer;

class CapMechanism implements StartingStrategy{

    private boolean isCapOn = true;


    public void start(){
        if (isCapOn) {
            System.out.println("Removing cap to start writing...");
            isCapOn = false;
        } else {
            System.out.println("Cap is already removed");
        }
    }
    public void close(){
        if (!isCapOn) {
            System.out.println("Putting cap back on pen...");
            isCapOn = true;
        } else {
            System.out.println("Cap is already on");
        }
    }
}

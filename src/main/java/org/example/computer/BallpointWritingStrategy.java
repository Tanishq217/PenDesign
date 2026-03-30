package org.example.computer;

class BallpointWritingStrategy implements WritingStrategy{
    public void write(String text) {
        System.out.println("Writing with ballpoint pen: " + text);
        System.out.println("Smooth, consistent ink flow with rolling ball mechanism");
    }
}

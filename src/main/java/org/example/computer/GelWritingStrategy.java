package org.example.computer;

class GelWritingStrategy implements  WritingStrategy{
    public void write(String text){
        System.out.println("Writing with gel pen: " + text);
        System.out.println("Vibrant gel ink, smooth glide with consistent flow");
    }
}

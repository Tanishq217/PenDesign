package org.example.computer;

class InkWritingStrategy implements WritingStrategy{
    public void write(String text) {
        System.out.println("Writing with ink pen: " + text);
        System.out.println("Liquid ink flowing through nib, requires gentle pressure");
    }
}

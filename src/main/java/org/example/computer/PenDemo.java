package org.example.computer;

public class PenDemo {
    public static void main(String[] args) {
        System.out.println("=== Pen System Demo ===\n");


        Pen ballpointCapPen = PenFactory.createPen(
                Enums.PenType.BALLPOINT, Enums.InkColor.BLUE, Enums.StartingMechanism.CAP);

        Pen inkClickPen = PenFactory.createPen(
                Enums.PenType.INK, Enums.InkColor.BLACK, Enums.StartingMechanism.CLICK);

        Pen gelCapPen = PenFactory.createPen(
                Enums.PenType.GEL, Enums.InkColor.RED, Enums.StartingMechanism.CAP);

        System.out.println("1. Testing Ballpoint Pen (Blue, Cap):");
        ballpointCapPen.start();
        ballpointCapPen.write("Hello World");
        ballpointCapPen.close();
        ballpointCapPen.refill();
        System.out.println();

        System.out.println("2. Testing Ink Pen (Black, Click):");
        inkClickPen.start();
        inkClickPen.write("Design Patterns are awesome!");
        inkClickPen.close();
        inkClickPen.refill();
        System.out.println();

        System.out.println("3. Testing Gel Pen (Red, Cap):");
        gelCapPen.start();
        gelCapPen.write("Writing with gel pen is smooth!");
        gelCapPen.close();
        gelCapPen.refill();
        System.out.println();

        System.out.println("4. Testing multiple operations:");
        Pen multiPen = PenFactory.createPen(
                Enums.PenType.BALLPOINT, Enums.InkColor.GREEN, Enums.StartingMechanism.CLICK);

        multiPen.start();
        multiPen.write("First line");
        multiPen.write("Second line");
        multiPen.refill();
        multiPen.write("After refill");
        multiPen.close();

        System.out.println("\n5. Pen Information:");
        System.out.println("Pen Type: " + multiPen.getType());
        System.out.println("Ink Color: " + multiPen.getColor());
    }
}
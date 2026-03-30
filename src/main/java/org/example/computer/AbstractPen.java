package org.example.computer;


public abstract class AbstractPen implements Pen {


    protected WritingStrategy writingStrategy;

    protected StartingStrategy startingStrategy;

    protected RefillStrategy refillStrategy;


    protected Enums.InkColor color;

    protected Enums.PenType type;


    public AbstractPen(WritingStrategy writingStrategy,

                       StartingStrategy startingStrategy,

                       RefillStrategy refillStrategy,
                       Enums.InkColor color,

                       Enums.PenType type) {
        this.writingStrategy = writingStrategy;
        this.startingStrategy = startingStrategy;
        this.refillStrategy = refillStrategy;
        this.color = color;
        this.type = type;
    }


    public void write(String text) {

        System.out.print("[" + type + " - " + color + "] ");

        writingStrategy.write(text);
    }


    public void refill() {

        System.out.print("Refilling " + type + " pen: ");

        refillStrategy.refill();
    }


    public void start() {

        System.out.print("Starting " + type + " pen: ");

        startingStrategy.start();
    }


    public void close() {

        System.out.print("Closing  " + type + " pen: ");

        startingStrategy.close();
    }


    public Enums.InkColor getColor() {

        return color;
    }


    public Enums.PenType getType() {
        return type;
    }
}

package org.example.computer;



public class GelPen extends AbstractPen {
    public GelPen(StartingStrategy startingStrategy, Enums.InkColor color) {
        super(new GelWritingStrategy(),
                startingStrategy,
                new GelRefill(color.toString()),
                color,
                Enums.PenType.GEL);
    }
}
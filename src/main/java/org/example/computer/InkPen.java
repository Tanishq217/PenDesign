package org.example.computer;

public class InkPen extends AbstractPen {
    public InkPen(StartingStrategy startingStrategy, Enums.InkColor color) {
        super(new InkWritingStrategy(),
                startingStrategy,
                new InkRefill(color.toString()),
                color,
                Enums.PenType.INK);
    }
}

package org.example.computer;


public class BallpointPen extends AbstractPen {
    public BallpointPen(StartingStrategy startingStrategy, Enums.InkColor color) {
        super(new BallpointWritingStrategy(),
                startingStrategy,
                new CartridgeRefill(color.toString()),
                color,
                Enums.PenType.BALLPOINT);
    }
}
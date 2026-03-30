package org.example.computer;


public class PenFactory {

    public static Pen createPen(Enums.PenType type, Enums.InkColor color, Enums.StartingMechanism mechanism) {
        StartingStrategy startStrategy;

        switch (mechanism) {
            case CAP:
                startStrategy = new CapMechanism();
                break;
            case CLICK:
                startStrategy = new ClickMechanism();
                break;
            default:
                throw new IllegalArgumentException("Unknown mechanism: " + mechanism);
        }

        switch (type) {
            case BALLPOINT:
                return new BallpointPen(startStrategy, color);
            case INK:
                return new InkPen(startStrategy, color);
            case GEL:
                return new GelPen(startStrategy, color);
            default:
                throw new IllegalArgumentException("Unknown pen type: " + type);
        }
    }
}
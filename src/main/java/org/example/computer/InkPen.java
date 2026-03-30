package org.example.computer;

import com.pen.system.*;
import com.pen.system.strategy.InkWritingStrategy;
import com.pen.system.refill.InkRefill;

public class InkPen extends AbstractPen {
    public InkPen(StartingStrategy startingStrategy, InkColor color) {
        super(new InkWritingStrategy(),
                startingStrategy,
                new InkRefill(color.toString()),
                color,
                PenType.INK);
    }
}

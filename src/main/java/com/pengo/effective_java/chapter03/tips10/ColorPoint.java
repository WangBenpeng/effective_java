package com.pengo.effective_java.chapter03.tips10;

import java.awt.*;

/**
 * @author Benpeng
 * @date 2023/3/3
 */
public class ColorPoint extends Point{
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point))
            return false;
        if (!(obj instanceof ColorPoint))
            return obj.equals(this);
        return super.equals(obj) && ((ColorPoint)obj).color == color;
    }
}

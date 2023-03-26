package org.entropic.toolkit.geometry;

import org.junit.Test;

import static org.entropic.toolkit.geometry.util.AssertUtil.assertLine;

public class RectangleTest {

    private static final double E = 1e-6;

    @Test
    public void clip() {
        Rectangle rectangle = new Rectangle(10, 20, 0, 0);
        Line line = new Line(new Position(-1, -1), new Position(11, 11));
        Line clipped = rectangle.clip(line);
        assertLine(new Line(new Position(0, 0), new Position(10, 10)), clipped);
    }

}

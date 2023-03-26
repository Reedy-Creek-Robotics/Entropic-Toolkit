package org.entropic.toolkit.geometry;

import org.entropic.toolkit.geometry.util.AssertUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VectorNTest {

    @Test
    public void magnitude() {
        assertEquals(1.0, new VectorN(1.0).magnitude(), AssertUtil.E);
        assertEquals(Math.sqrt(2), new VectorN(1.0, 1.0).magnitude(), AssertUtil.E);
        assertEquals(Math.sqrt(3), new VectorN(1.0, 1.0, 1.0).magnitude(), AssertUtil.E);
        assertEquals(2.0, new VectorN(1.0, 1.0, 1.0, 1.0).magnitude(), AssertUtil.E);
    }

    @Test
    public void withMagnitude() {
        assertVector(
                new VectorN(1.0),
                new VectorN(0.5).withMagnitude(1.0)
        );
        assertVector(
                new VectorN(Math.sqrt(2) / 2.0, Math.sqrt(2) / 2.0),
                new VectorN(1.0, 1.0).withMagnitude(1.0)
        );
        assertVector(
                new VectorN(0.5, 0.5, 0.5, 0.5),
                new VectorN(1.0, 1.0, 1.0, 1.0).withMagnitude(1.0)
        );
    }

    @Test
    public void withMaxComponent() {
        assertVector(
                new VectorN(1.0, 1.0, 1.0, 1.0),
                new VectorN(0.5, 0.5, 0.5, 0.5).withMaxComponent(1.0)
        );
        assertVector(
                new VectorN(1.0, 0.5, 1.0, 0.5),
                new VectorN(0.6, 0.3, 0.6, 0.3).withMaxComponent(1.0)
        );
        assertVector(
                new VectorN(-1.0, -0.5, 1.0, 0.5),
                new VectorN(-0.6, -0.3, 0.6, 0.3).withMaxComponent(1.0)
        );
    }

    @Test
    public void clampToMax() {
        assertVector(
                new VectorN(0.5, 0.5, 0.5, 0.5),
                new VectorN(0.5, 0.5, 0.5, 0.5).clampToMax(1.0)
        );
        assertVector(
                new VectorN(-0.3, -0.3, -0.3, -0.3),
                new VectorN(-0.5, -0.5, -0.5, -0.5).clampToMax(0.3)
        );
        assertVector(
                new VectorN(-0.3, 0.15, -0.3, 0.3),
                new VectorN(-0.5, 0.25, -0.5, 0.5).clampToMax(0.3)
        );
    }

}

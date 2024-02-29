package domainModelTest;

import static org.junit.Assert.*;

import domainModel.Body;
import org.junit.Test;

public class BodyTest {

    @Test
    public void testIsQuiet() {
        Body body = new Body(true, true, false);
        assertTrue(body.isQuiet());
    }

    @Test
    public void testHasCurledFingers() {
        Body body = new Body(true, true, false);
        assertTrue(body.hasCurledFingers());
    }

    @Test
    public void testIsLying() {
        Body body = new Body(true, true, false);
        assertFalse(body.isLying());
    }
}

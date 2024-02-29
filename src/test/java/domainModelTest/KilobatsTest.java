package domainModelTest;

import static org.junit.Assert.*;

import domainModel.Kilobats;
import org.junit.Test;

public class KilobatsTest {

    @Test
    public void testIsUnderFoot() {
        Kilobats kilobats = new Kilobats();

        assertFalse(kilobats.isUnderFoot());
    }
}

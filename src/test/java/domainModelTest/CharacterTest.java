package domainModelTest;

import domainModel.Body;
import domainModel.Kilobats;
import domainModel.Character;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class CharacterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testApproachBody() {
        Body body = new Body(true, true, false);
        Character character = new Character("Он");

        character.approachBody(body);

        assertEquals("Он осторожно подошёл к телу.", outContent.toString().trim());
    }

    @Test
    public void testStepOnKilobats() {
        Body body = new Body(true, true, false);
        Character character = new Character("Он");
        Kilobats kilobats = new Kilobats();

        character.stepOnKilobats(kilobats, body);

        assertEquals("Он поставил ногу на килобац.", outContent.toString().trim());
    }
}

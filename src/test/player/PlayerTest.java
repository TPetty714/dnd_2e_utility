package test.player;

import main.Player;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;

public class PlayerTest {
    private Player testPlayer;

    @BeforeEach
    void setUp() {
        testPlayer = new Player();
        assertNull(testPlayer.name);
    }

    @Test
    void shouldAddPlayerName() throws IOException {
        assertNull(testPlayer.name);
        testPlayer.addName("Test");
        assertEquals("Test", testPlayer.name);
    }

    @Test
    void shouldBeAbleToCreateCharacter() {
        assertTrue(testPlayer.addCharacter("test"));
    }

}
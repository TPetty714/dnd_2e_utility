package test.character;

import main.Character;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class CharacterTest {
    private Character testCharacter;

    @BeforeEach
    void setUp(){
        testCharacter = new Character("test");
    }

    @Test
    void character_should_have_name() {
        assertNotNull(testCharacter.name);
        assertEquals("test", testCharacter.name);
    }

    @Test
    void character_should_have_list_of_kills() {
        assertNotNull(testCharacter.kills);
    }

    @Test
    void should_be_able_to_add_kill() {
        assertTrue(testCharacter.addKill("test", 3));
    }
}

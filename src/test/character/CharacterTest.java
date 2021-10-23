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
        assertTrue(testCharacter.addKill("test", 3, 15));
    }

    @Test
    void should_be_able_to_get_list_of_kills() {
        int xp = 15;
        int hit_die1 = 3;
        int hit_die2 = 2;
        testCharacter.addKill("test", hit_die1, xp);
        testCharacter.addKill("test", hit_die2, xp);
        assertNotNull(testCharacter.list_of_kills());
        assertEquals("test:\t2", testCharacter.list_of_kills());
    }

    @Test
    void should_be_able_to_get_total_xp() {
        int xp = 15;
        int hit_die1 = 3;
        int hit_die2 = 2;
        testCharacter.addKill("test", hit_die1, xp);
        testCharacter.addKill("test", hit_die2, xp);
        assertEquals((xp*hit_die1+xp*hit_die2), testCharacter.xp_gained());
    }
}

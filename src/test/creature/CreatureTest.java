package test.creature;

import main.Creature;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class CreatureTest {
    private Creature testCreature;

    @BeforeEach
    void setUp(){
        testCreature = new Creature("test", 3, 15);
    }

    @Test
    void creature_should_have_type_and_hit_die() {
        assertNotNull(testCreature.type);
        assertEquals("test", testCreature.type);
        assertNotNull(testCreature.hit_die);
        assertEquals(3, testCreature.hit_die);
        assertNotNull(testCreature.total_killed);
        assertEquals(1, testCreature.total_killed);
    }
}

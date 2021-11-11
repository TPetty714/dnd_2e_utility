import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PlayerTest {
    @Test
    void create_new__player_with_name() {
        Player testplayer = null;
        assertNull(testplayer);
        testplayer = new Player("test");
        assert(testplayer.getName() == "test");
    }

    @Test
    void create_new_character() {
        Player testplayer = new Player("test");
        testplayer.add_character("test_c");
        assert(testplayer.has_character("test_c"));
    }

    @Test
    void select_current_character() {
        Player testplayer = new Player("test");
        testplayer.add_character("test_c");
        testplayer.select_character("test_c");
        assert(testplayer.getCurrent_character().name == "test_c");
    }

    @Test
    void remove_a_character() {
        Player testplayer = new Player("test");
        testplayer.add_character("test_c");
        testplayer.remove_character("test_c");
        assertFalse(testplayer.has_character("test_c"));
    }
}

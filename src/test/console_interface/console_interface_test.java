package test.console_interface;

import main.Console_Interface;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class console_interface_test {
    private Console_Interface test_interface;
    private final InputStream systemIn = System.in;

    private ByteArrayInputStream testIn;

    @BeforeEach
    void setUp(){
        test_interface = new Console_Interface();
    }

    @Test
    void should_be_able_to_create_console_interface() {
        assertNotNull(test_interface);
    }

    @Test
    void at_start_current_player_should_be_null(){
        assertNull(test_interface.get_current_player());
    }

    @Before
    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @After
    public void restoreSystemInput() {
        System.setIn(systemIn);
    }

    @Test
    void should_return_if_player_does_not_exist() {
        provideInput("test");
        test_interface.login();
        assertNull(test_interface.get_current_player());
    }

    @Test
    void should_be_able_to_add_new_player() {
        provideInput("test");
        test_interface.create_player();
        assertFalse(test_interface.get_players().isEmpty());
    }

    @Test
    void should_be_able_to_list_players() {
        provideInput("test1");
        test_interface.create_player();
        provideInput("test2");
        test_interface.create_player();
        provideInput("test3");
        test_interface.create_player();
        provideInput("test4");
        test_interface.create_player();
        assertTrue(test_interface.list_players().contains("test1"));
        assertTrue(test_interface.list_players().contains("test2"));
        assertTrue(test_interface.list_players().contains("test3"));
        assertTrue(test_interface.list_players().contains("test4"));
    }
}

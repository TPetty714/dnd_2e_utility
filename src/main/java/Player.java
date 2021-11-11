import java.util.Hashtable;

public class Player {
    private Hashtable<String, Player_Character> characters;
    private Player_Character current_character;
    private String name;

    public Player(String name) {
        this.name = name;
        this.characters = new Hashtable<String, Player_Character>();
    }

    public String getName() {
        return name;
    }

    public boolean has_character(String character_name) {
        return characters.containsKey(character_name);
    }

    public void add_character(String character_name) {
        characters.put(character_name, new Player_Character(character_name));
    }

    public void select_character(String character_name) {
        current_character = characters.get(character_name);
    }

    public Player_Character getCurrent_character() {
        return current_character;
    }

    public void remove_character(String character_name) {
        characters.remove(character_name);
    }
}

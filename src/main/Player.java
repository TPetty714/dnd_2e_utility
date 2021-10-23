package main;

import java.io.IOException;
import java.util.HashMap;

public class Player {
    public String name;
    public HashMap<String, Character> characters;

    public Player() {
        this.characters = new HashMap<String, Character>();
    }

    public Player(String name) {
        this.characters = new HashMap<String, Character>();
        this.name = name;
    }

    public void addName(String name) {
        this.name = name;
    }

    public boolean addCharacter(String character_name) {
        if(characters.containsKey(character_name)) {
            System.out.println("Character " + character_name + " already exists");
            return false;
        }
        else {
            characters.put(character_name, new Character(character_name));
            System.out.println(characters.containsKey(character_name));
            return true;
        }
    }

    public boolean removeCharacter(String character_name) {
        if(characters.containsKey(character_name)) {
            characters.remove(character_name);
            System.out.println("Character " + character_name + " removed");
            return true;
        }
        else {
            System.out.println("Character " + character_name + " does not exist");
            return false;
        }
    }
}

package main;

import java.util.HashMap;

public class Character {
    public String name;
    public HashMap<String, Creature> kills;

    public Character(String name) {
        this.name = name;
        kills = new HashMap<String, Creature>();
    }

    public boolean addKill(String creature_type, int hit_die) {
        if(kills.containsKey(creature_type)) {
            kills.get(creature_type).total_killed += 1;
        }
        else {
            kills.put(creature_type, new Creature(creature_type, hit_die));
        }
        return kills.containsKey(creature_type);
    }
}

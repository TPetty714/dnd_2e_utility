package main;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Character {
    public String name;
    public Hashtable<String, Creature> kills;

    public Character(String name) {
        this.name = name;
        kills = new Hashtable<String, Creature>();
    }

    public boolean addKill(String creature_type, int hit_die, int xp) {
        if(kills.containsKey(creature_type)) {
            kills.get(creature_type).total_killed += 1;
            kills.get(creature_type).hit_die += hit_die;
        }
        else {
            kills.put(creature_type, new Creature(creature_type, hit_die, xp));
        }
        return kills.containsKey(creature_type);
    }

    public String list_of_kills() {
        String list_of_kills = null;
        Creature temp = null;
        for (Enumeration<Creature> e = kills.elements(); e.hasMoreElements();) {
            temp = e.nextElement();
            if (list_of_kills == null) list_of_kills = temp.type + ":\t" + temp.total_killed;
            else list_of_kills += temp.type + ":\t" + temp.total_killed;
        }
        return list_of_kills;
    }

    public int xp_gained() {
        int total_xp = 0;
        Creature temp = null;
        for (Enumeration<Creature> e = kills.elements(); e.hasMoreElements();) {
            temp = e.nextElement();
            total_xp += temp.hit_die * temp.xp;
        }
        return total_xp;
    }
}

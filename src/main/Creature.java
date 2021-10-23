package main;

import java.util.HashMap;

public class Creature {
    public String type;
    public int hit_die;
    public int xp;
    public int total_killed;

    public Creature(String name, int hit_die, int xp) {
        this.type = name;
        this.hit_die = hit_die;
        this.xp = xp;
        this.total_killed = 1;
    }
}

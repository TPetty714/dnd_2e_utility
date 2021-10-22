package main;

import java.util.HashMap;

public class Creature {
    public String type;
    public int hit_die;
    public int total_killed;

    public Creature(String name, int hit_die) {
        this.type = name;
        this.hit_die = hit_die;
        this.total_killed = 1;
    }
}

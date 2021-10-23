package main;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Console_Interface {
    private static Player current_player;
    private static Hashtable<String, Player> players;

    public static void main(String[] args){
    while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select an option");
            String input = scanner.next();
            switch (input) {
                case "Create":
                    create_player();
                    break;
                case "Login":
                    login();
                    break;
                case "Exit":
                    return;
                default:
                    System.out.println("Options are:\nCreate\tLogin\tExit");
            }
        }
    }

    public Console_Interface() {
        current_player = null;
        players = new Hashtable<String, Player>();
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Player");
        String input = scanner.next();
        if (players.containsKey(input)) {
            System.out.println("Selected player " + input);
        }
        else {
            System.out.println("Player " + input + " does not exist");
            return;
        }
        current_player = players.get(input);
    }

    public static void create_player() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input new player name");
        String input = scanner.next();
        if (players.containsKey(input)) {
            System.out.println(input + " already exists");
        }
        else {
            players.put(input, new Player(input));
            System.out.println(input + " added");
        }
    }

    public static String list_players() {
        String player_list = "";
        Player temp;
        for(Enumeration<Player> e = players.elements(); e.hasMoreElements();) {
            temp = e.nextElement();
            if (player_list == "")
                player_list = temp.name;
            else player_list += " "+temp.name;
        }
        return player_list;
    }

    public static Hashtable get_players() {
        return players;
    }

    public static Player get_current_player() {
        return current_player;
    }
}

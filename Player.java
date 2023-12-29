package FantasyRPGCharacterSystem;

import java.util.ArrayList;

public class Player {
    private String playerID;
    private String playerName;
    private ArrayList<Character> characters;
    private ArrayList<Skill> skills;

    public Player(String playerID, String playerName) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.characters = new ArrayList<>();
        this.skills = new ArrayList<>();
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String id) {
        this.playerID = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String name) {
        this.playerName = name;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }
    
    public void addCharacter(Character character) {
        this.characters.add(character);
    }
}

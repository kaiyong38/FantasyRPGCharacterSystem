package FantasyRPGCharacterSystem;

import java.util.ArrayList;

public abstract class Character {
    private String characterID;
    private String characterName;
    private int level;
    private int health;
    private ArrayList<Skill> skills; 
    private Player player;

    public Character(String characterID, String characterName, int level, int health) {
        this.characterID = characterID;
        this.characterName = characterName;
        this.level = (level > 0) ? level : 1;
        this.health = 100;
        this.skills = new ArrayList<>();
    }

    public String getCharacterID() {
        return characterID;
    }

    public void setCharacterID(String id) {
        this.characterID = id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String name) {
        this.characterName = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public void levelUp() {
        level++;
    }
    
    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}

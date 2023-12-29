package FantasyRPGCharacterSystem;

public class Rogue extends Character {
    private int stealthLevel;
    private String daggerType;

    public Rogue(String characterID, String characterName, int level, int stealthLevel, int health, String daggerType) {
        super(characterID, characterName, level, health);
        this.stealthLevel = stealthLevel;
        this.daggerType = daggerType;
    }

    public int getStealthLevel() {
        return stealthLevel;
    }

    public void setStealthLevel(int level) {
        this.stealthLevel = level;
    }

    public String getDaggerType() {
        return daggerType;
    }

    public void setDaggerType(String type) {
        this.daggerType = type;
    }

    public void stab(Character target) {
        int damage = 0;

        if (getLevel() >= 1 && getLevel() <= 3) {
            damage = 10;
        } else if (getLevel() >= 4 && getLevel() <= 5) {
            damage = 15;
        } else if (getLevel() > 5) {
            damage = 20;
        }


        target.setHealth(target.getHealth() - damage);

        System.out.println(getCharacterName() + " performed a stabbing attack on " + target.getCharacterName() +
                " dealing " + damage + " damage.");
    }

    public void evade() {
        if (stealthLevel < 5) {
            System.out.println(getCharacterName() + "'s stealth level must reach level 5 before evading attacks.");
        } else {
            System.out.println(getCharacterName() + " successfully evaded the incoming attack.");
        }
    }
    
    @Override
public String toString() {
    String result = "Constructor: Rogue\n" +
                    "Character ID: " + getCharacterID() + "\n" +
                    "Character Name: " + getCharacterName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Stealth Level: " + stealthLevel + "\n" +
                    "Health: " + getHealth() + "\n" +
                    "Dagger Type: " + daggerType + "\n";

    result += "Skills:\n";
    for (Skill skill : getSkills()) {
        result += "- " + skill.getSkillName() + ": " + skill.getSkillDescription() + "\n";
    }

    return result;
}

}

package FantasyRPGCharacterSystem;

public class Mage extends Character {
    private String elementalAffinity;

    public Mage(String characterID, String characterName, int level, int health, String elementalAffinity) {
        super(characterID, characterName, level, health);
        this.elementalAffinity = elementalAffinity;
    }

    public String getElementalAffinity() {
        return elementalAffinity;
    }

    public void setElementalAffinity(String element) {
        this.elementalAffinity = element;
    }

    public void castElementalSpell(String spellType) {
        if (getLevel() < 5) {
            System.out.println(getCharacterName() + " needs to reach level 5 before casting any spells.");
        } else {
            switch (spellType) {
                case "Teleportation":
                    System.out.println("Teleporting " + getCharacterName() + " out of danger!");
                    break;
                case "Illusion":
                    System.out.println(getCharacterName() + " is creating illusions to confuse the enemy.");
                    break;
                case "Detection":
                    System.out.println(getCharacterName() + " is detecting the presence of magic nearby...");
                    break;
                default:
                    System.out.println("Invalid spell type");
                    break;
            }
        }
    }
    
    @Override
public String toString() {
    String result = "Constructor: Mage\n" +
                    "Character ID: " + getCharacterID() + "\n" +
                    "Character Name: " + getCharacterName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Health: " + getHealth() + "\n" +
                    "Elemental Affinity: " + elementalAffinity + "\n";

    result += "Skills:\n";
    for (Skill skill : getSkills()) {
        result += "- " + skill.getSkillName() + ": " + skill.getSkillDescription() + "\n";
    }

    return result;
}

}

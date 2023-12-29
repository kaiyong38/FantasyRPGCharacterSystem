package FantasyRPGCharacterSystem;

public class Warrior extends Character {
    private String weaponType;
    private String armorType;

    public Warrior(String characterID, String characterName, int level, int health, String weaponType, String armorType) {
        super(characterID, characterName, level, health); 
        this.weaponType = weaponType;
        this.armorType = armorType;
}


    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weapon) {
        this.weaponType = weapon;
    }

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armor) {
        this.armorType = armor;
    }

    public void chargeAttack(Character target) {
        int damage = 0;

        if (getLevel() > 5) {
            switch (weaponType) {
                case "Sword":
                    damage = 50;
                    break;
                case "Dagger":
                    damage = 20;
                    break;
                case "Crossbow":
                    damage = 50;
                    break;
                case "Staff":
                    damage = 10;
                    break;
                default:
                    System.out.println("Invalid weapon type");
                    return;
            }
        } else {
            switch (weaponType) {
                case "Sword":
                    damage = 25;
                    break;
                case "Dagger":
                    damage = 10;
                    break;
                case "Crossbow":
                    damage = 25;
                    break;
                case "Staff":
                    damage = 5;
                    break;
                default:
                    System.out.println("Invalid weapon type");
                    return;
            }
        }

        target.setHealth(target.getHealth() - damage);

        System.out.println(getCharacterName() + " performed a charge attack on " + target.getCharacterName() +
                " using a " + weaponType + " dealing " + damage + " damage.");
    }

    public void shieldBlock() {
        switch (armorType) {
            case "Shield":
                System.out.println(getCharacterName() + " is raising its shield.");
                break;
            case "Gauntlet":
                System.out.println(getCharacterName() + " is raising its gauntlets.");
                break;
            case "Helmet":
                System.out.println(getCharacterName() + "'s head is protected.");
                break;
            default:
                System.out.println(getCharacterName() + " I hope you're protected... somehow.");
                break;
        }
    }
    
    @Override
public String toString() {
    String result = "Constructor: Warrior\n" +
                    "Character ID: " + getCharacterID() + "\n" +
                    "Character Name: " + getCharacterName() + "\n" +
                    "Level: " + getLevel() + "\n" +
                    "Health: " + getHealth() + "\n" +
                    "Weapon Type: " + weaponType + "\n" +
                    "Armor Type: " + armorType + "\n";

    result += "Skills:\n";
    for (Skill skill : getSkills()) {
        result += "- " + skill.getSkillName() + ": " + skill.getSkillDescription() + "\n";
    }

    return result;
}

}
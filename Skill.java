package FantasyRPGCharacterSystem;

public class Skill {
    private String skillName;
    private String skillDescription;

    public Skill(String skillName, String skillDescription) {
        this.skillName = skillName;
        this.skillDescription = skillDescription;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String name) {
        this.skillName = name;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setSkillDescription(String description) {
        this.skillDescription = description;
    }  
}
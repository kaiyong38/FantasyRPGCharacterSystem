package FantasyRPGCharacterSystem;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("P1", "Player1");
        Player player2 = new Player("P2", "Player2");

        Warrior gideon = new Warrior("GS001", "Gideon Stoneheart", 5, 100, "Sword", "Chainmail");
        Mage elara = new Mage("EF001", "Elara Frostweaver", 1, 100, "Ice");
        Rogue darian = new Rogue("DW001", "Darian Whisperwind", 10, 15, 100, "Shuriken");

        Skill whirlwindSlash = new Skill("Whirlwind Slash", "Powerful slashing attack that hits multiple enemies.");
        Skill dualWielding = new Skill("Dual Wielding", "Mastering the art of wielding two weapons simultaneously.");
        Skill frostNova = new Skill("Frost Nova", "Creates a freezing blast that damages and slows enemies.");
        Skill lockpicking = new Skill("Lockpicking", "Skillful manipulation of locks to open doors and chests.");

        gideon.addSkill(whirlwindSlash);
        gideon.addSkill(dualWielding);
        elara.addSkill(frostNova);
        darian.addSkill(lockpicking);
        
        player1.addCharacter(gideon);
        player1.addCharacter(elara);
        player2.addCharacter(darian);

        gideon.setPlayer(player1);
        elara.setPlayer(player1);
        darian.setPlayer(player2);

        gideon.chargeAttack(darian);

        elara.castElementalSpell("Teleportation");

        darian.stab(gideon);

        gideon.shieldBlock();

        darian.evade();

        System.out.println("\n" + gideon.toString());
        System.out.println(elara.toString());
        System.out.println(darian.toString());
    }
}


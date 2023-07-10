package org.example.week5;

public class Game {
    public static void main(String[] args) {
        String selectedPlayerClass = "Mage";

        try {
            PlayerClass playerClass = PlayerClass.valueOf(selectedPlayerClass.toUpperCase());
            String skill = getPlayerSkill(playerClass);
            System.out.println("Skill of " + selectedPlayerClass + ": " + skill);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid player class: " + selectedPlayerClass);
        }
    }

    public static String getPlayerSkill(PlayerClass playerClass) {
        return playerClass.getSkill();
    }
}

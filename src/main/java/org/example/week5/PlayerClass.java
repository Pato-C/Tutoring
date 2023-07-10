package org.example.week5;

enum PlayerClass {
    WARRIOR("Sword Attack"),
    MAGE("Fireball"),
    ARCHER("Precision Shot");

    private final String skill;

    PlayerClass(String skill) {
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }
}

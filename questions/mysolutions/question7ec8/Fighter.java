package question7ec8;

import java.util.Random;

public class Fighter {

    private static final Random numberGenerator = new Random();
    private static final int DAMAGE_VALUE = 2;

    private final String name;
    private final String type;
    private final int skill;
    private int stamina;

    public Fighter(String name, String type, int skill, int stamina) {
        this.name = name;
        this.type = type;
        this.skill = skill;
        this.stamina = stamina;
    }

    public void takeDamage(int damage) {
        stamina = Math.max(stamina - damage, 0);
    }

    public int calculateDamage() {
        return DAMAGE_VALUE;
    }

    public int calculateAttackScore() {
        int roll1 = numberGenerator.nextInt(6) + 1;
        int roll2 = numberGenerator.nextInt(6) + 1;
        return skill + roll1 + roll2;
    }

    public boolean isDead() {
        return stamina == 0;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " - " + type + " - skill: " + skill + "; stamina: " + stamina;
    }
}

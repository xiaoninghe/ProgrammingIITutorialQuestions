package question8d24;

public class LuckyFighter {

  private static final int DAMAGE_VALUE = 2;

  private final String name;
  private final String type;
  private final int skill;
  private int stamina;
  private final GameEngine theGameEngine;
  private int luck;
  private final Strategy strategy;

  /**
   * Construct a figher, given a name, type, attributes and reference to the game engine.
   */
  public LuckyFighter(String name, String type, int skill, int stamina, GameEngine theGameEngine, int luck,
                      Strategy strategy) {
    this.name = name;
    this.type = type;
    this.skill = skill;
    this.stamina = stamina;
    this.theGameEngine = theGameEngine;
    this.luck = luck;
    this.strategy = strategy;
  }

  private boolean testLuck() {
    if (luck == 0) {
      return false;
    }
    return theGameEngine.rollDice() + theGameEngine.rollDice() <= --luck;
  }

  public void takeDamage(int damage) {

    assert damage > 0;

    if (luck > 0) {
      switch (strategy) {
        case AVERAGE:
          if (theGameEngine.rollDice() > 3) break;
        case AGGRESSIVE:
          if (testLuck()) {
            damage++;
          } else {
            damage--;
          }
          break;
        case DEFENSIVE:
          break;
      }
    }

    stamina = Math.max(stamina - damage, 0);
  }

  public int calculateDamage() {
    switch (strategy) {
      case AVERAGE:
        if (theGameEngine.rollDice() > 3) {
          return DAMAGE_VALUE;
        }
      case AGGRESSIVE:
        if (testLuck()) {
          return 2 * DAMAGE_VALUE;
        }
        return Math.max(DAMAGE_VALUE - 1, 0);
      case DEFENSIVE:
        return DAMAGE_VALUE;
      default:
        return 0;
    }
  }

  public int calculateAttackScore() {
    return skill + theGameEngine.rollDice() + theGameEngine.rollDice();
  }

  public String getName() {
    return name;
  }

  public String toString() {
    return name + " - " + strategy + " " + type + " - skill: " + skill + "; stamina: " + stamina + "; luck:" + luck;
  }

  public boolean isDead() {
    return stamina == 0;
  }

}

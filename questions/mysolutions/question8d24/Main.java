package question8d24;

public class Main {

  /**
   * Example battle.
   */
  public static void main(String[] args) {

    GameEngine gameEngine = new GameEngine();

    LuckyFighter humanWarrior = new LuckyFighter("Joe", "Human Warrior", 16, 12, gameEngine, 12, Strategy.AGGRESSIVE);

    LuckyFighter elfLord = new LuckyFighter("Alex", "Elf Lord", 18, 6, gameEngine, 11, Strategy.DEFENSIVE);

    gameEngine.simulateBattle(humanWarrior, elfLord);

  }

}

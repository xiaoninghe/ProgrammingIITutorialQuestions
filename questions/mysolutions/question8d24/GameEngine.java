package question8d24;

import java.util.Random;

public class GameEngine {

  private Random generator;

  public GameEngine() {
    generator = new Random();
  }

  public int rollDice() {
    return generator.nextInt(6) + 1;
  }

  /**
   * Logging method that prints message to standard output.
   */
  public void log(String message) {

    System.out.println(message);

  }

  /**
   * Simulation of battle between two fighters.
   */
  public void simulateBattle(LuckyFighter first, LuckyFighter second) {

    log("At start of battle, stats are:");
    log(first.toString());
    log(second.toString());
    log("------------------------------");

    while (true) {

      int firstAttackScore = first.calculateAttackScore();
      int secondAttackScore = second.calculateAttackScore();

      if (firstAttackScore == secondAttackScore) {

        log(first.getName() + " draws with " + second.getName());
        log("------------------------------");

      } else {

        LuckyFighter winner;
        LuckyFighter loser;

        if (firstAttackScore > secondAttackScore) {
          winner = first;
          loser = second;
        } else {
          winner = second;
          loser = first;
        }

        log(winner.getName() + " hits " + loser.getName() + ", stats are:");

        loser.takeDamage(winner.calculateDamage());

        log(first.toString());
        log(second.toString());
        log("------------------------------");

        if (loser.isDead()) {
          log("End of battle, " + winner + " wins!");
          return;
        }

      }

    }


  }

}

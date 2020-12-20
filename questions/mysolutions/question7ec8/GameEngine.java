package question7ec8;

public class GameEngine {

    public static void log(String message) {

        System.out.println(message);
    }

    public static void simulateBattle(Fighter first, Fighter second) {

        log("At start of battle, stats are:");
        log(first.toString());
        log(second.toString());
        log("------------------------------");

        while (!first.isDead() && !second.isDead()) {

            int firstScore = first.calculateAttackScore();
            int secondScore = second.calculateAttackScore();

            if (firstScore == secondScore) {
                System.out.print(first.getName() + " draws with " + second.getName());
            } else {
                Fighter winner;
                Fighter loser;

                if (firstScore > secondScore) {
                    winner = first;
                    loser = second;
                } else {
                    winner = second;
                    loser = first;
                }

                loser.takeDamage(winner.calculateDamage());
                log(winner.getName() + " hits " + loser.getName() + ", stats are:");
                log(first.toString());
                log(second.toString());
            }
            log("------------------------------");
        }

        if (!first.isDead()) {
            log("End of battle, " + first + " wins!");
        } else {
            log("End of battle, " + second + " wins!");
        }
    }
}

package question7ec8;

public class Main {

    public static void main(String[] args) {

        Fighter alex = new Fighter("Alex", "Elf Lord", 18, 6);
        Fighter joe = new Fighter("Joe", "Human Warrior", 16, 12);

        GameEngine.simulateBattle(alex, joe);
    }

}

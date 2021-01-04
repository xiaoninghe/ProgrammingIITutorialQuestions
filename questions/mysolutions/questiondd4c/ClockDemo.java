package questiondd4c;

public class ClockDemo {

  public static void main(String[] args) throws InterruptedException {
    Clock clock1 = new Clock(0);
    Clock clock2 = new Clock(23, 59, 53);

    for (int i = 0; i < 15; i++) {
      System.out.print(clock1);
      System.out.print("   ");
      System.out.println(clock2);
      clock1.tick();
      clock2.tick();
      Thread.sleep(10);
    }
  }

}

package questiondd4c;

public class AlarmClock extends Clock {

  private boolean isSounding;
  private int alarm;

  public AlarmClock(int secondsSinceMidnight, int alarm) {
    super(secondsSinceMidnight);
    this.alarm = alarm;
    this.isSounding = false;
  }

  public AlarmClock(int currentHour, int currentMinute, int currentSecond, int alarm) {
    super(currentHour, currentMinute, currentSecond);
    this.alarm = alarm;
    this.isSounding = false;
  }

  @Override
  public void tick() {
    super.tick();
    this.isSounding = alarm <= secondsSinceMidnight && secondsSinceMidnight < alarm + 60;
  }

  @Override
  public String toString() {
    return super.toString() + (isSounding ? " BEEP!" : "");
  }
}

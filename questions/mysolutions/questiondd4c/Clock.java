package questiondd4c;

public class Clock {

  private final boolean is24HourFormat;
  protected int secondsSinceMidnight;

  public Clock(int secondsSinceMidnight) {
    this.secondsSinceMidnight = secondsSinceMidnight;
    this.is24HourFormat = false;
  }

  public Clock(int currentHour, int currentMinute, int currentSeconds) {
    this.secondsSinceMidnight = currentHour * 3600 + currentMinute * 60 + currentSeconds;
    this.is24HourFormat = true;
  }

  public void tick() {
    secondsSinceMidnight++;
    secondsSinceMidnight %= 86400;
  }

  private String formatTime(int digit) {
    if (digit < 10) {
      return "0" + digit;
    }
    return String.valueOf(digit);
  }

  @Override
  public String toString() {
    if (!is24HourFormat) return secondsSinceMidnight + " seconds since midnight.";
    int hour = secondsSinceMidnight / 3600;
    int minute = secondsSinceMidnight % 3600 / 60;
    int second = secondsSinceMidnight % 60;
    return formatTime(hour) + ":" + formatTime(minute) + ":" + formatTime(second);
  }
}

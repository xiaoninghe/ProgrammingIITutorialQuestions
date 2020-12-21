package question0378;

public class TelephoneNumberComparator implements PersonComparator {

  @Override
  public int compareTo(Person p1, Person p2) {
    return p1.getTelephoneNumber().compareTo(p2.getTelephoneNumber());
  }
}

package question0378;

import java.util.HashSet;
import java.util.Set;

public class Demo {

  public static void main(String[] args) {
    Set<Person> people = new HashSet<>();
    people.add(new Person("Partridge", "Alan", "12345"));
    people.add(new Person("Surname", "Judith", "12354"));
    people.add(new Person("Surname", "Peter", "14253"));
    people.add(new Person("Field", "Tony", "61432"));
    people.add(new Person("Donaldson", "Minty", "25142"));
    people.add(new Person("Donaldson", "Jekyll", "25142"));
    people.add(new Person("Donaldson", "Jekyll", "00000"));

    PersonComparator nameComparator = new TwoTieredComparator(new SurnameComparator(), new ForenameComparator());
    PersonComparator personComparator = new TwoTieredComparator(new SurnameComparator(), new TwoTieredComparator(new ForenameComparator(), new TelephoneNumberComparator()));

    System.out.println("Smallest by surname: " + findMin(people, new SurnameComparator()));
    System.out.println("Smallest by forename: " + findMin(people, new ForenameComparator()));
    System.out.println("Smallest by NI: " + findMin(people, new TelephoneNumberComparator()));
    System.out.println("Smallest by surname then forename: " + findMin(people,
            new TwoTieredComparator(new SurnameComparator(), new ForenameComparator())));
    System.out.println("Smallest by surname, then forename, then NI: "
            + findMin(people, new TwoTieredComparator(new SurnameComparator(),
            new TwoTieredComparator(new ForenameComparator(), new TelephoneNumberComparator()))));
  }

  public static Person findMin(Set<Person> people, PersonComparator comparator) {
    Person min = null;
    for (Person person : people) {
      if (min == null || comparator.compareTo(min, person) > 0) {
        min = person;
      }
    }
    return min;
  }
}

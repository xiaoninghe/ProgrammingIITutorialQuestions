package question0378;

public class Person {

  private String surname;
  private String forename;
  private String telephoneNumber;

  public Person(String surname, String forename, String telephoneNumber) {
    this.surname = surname;
    this.forename = forename;
    this.telephoneNumber = telephoneNumber;
  }

  public String getSurname() {
    return surname;
  }

  public String getForename() {
    return forename;
  }

  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  @Override
  public String toString() {
    return forename + " " + surname + ", Telephone: " + telephoneNumber;
  }
}

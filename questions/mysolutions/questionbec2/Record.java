package questionbec2;

public class Record {

  private final String title;
  private final Genre genre;

  public Record(String title, Genre genre) {

    this.title = title;
    this.genre = genre;
  }

  public Genre getGenre() {
    return genre;
  }

  @Override
  public String toString() {
    return title + " (" + genre + ")";
  }
}

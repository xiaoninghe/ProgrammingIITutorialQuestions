package questionbec2;

import java.util.ArrayList;
import java.util.List;

public class Artist {

  private String name;
  private List<Record> catalogue;
  private Genre mainGenre;

  public Artist(String name, Genre mainGenre) {
    this(name, new ArrayList<>(), mainGenre);
  }

  public Artist(String name, List<Record> catalogue, Genre mainGenre) {
    this.name = name;
    this.catalogue = catalogue;
    this.mainGenre = mainGenre;
  }

  public void addRecord(String name) {
    catalogue.add(new Record(name, mainGenre));
  }

  public void addRecord(String name, Genre genre) {
    catalogue.add(new Record(name, genre));
  }

  public void showCatalogue() {
    for (Record record : catalogue) {
      System.out.println(record);
    }
  }

  public void showGenre(Genre genre) {
    for (Record record : catalogue) {
      if (record.getGenre() == genre) {
        System.out.println(record);
      }
    }
  }

  public String getName() {
    return name;
  }
}

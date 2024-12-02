package aims.media;

public class Track {
  private String title;
  private int lenght;

  Track(String title, int lenght) {
    this.lenght = lenght;
    this.title = title;
  }

  public String getTitle() {
    return this.title;
  }

  public int getLenght() {
    return this.lenght;
  }
}

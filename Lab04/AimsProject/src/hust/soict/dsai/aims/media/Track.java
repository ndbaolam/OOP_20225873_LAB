package aims.media;

public class Track implements Playable{
  private String title;
  private int lenght;

  Track(String title, int lenght) {
    this.lenght = lenght;
    this.title = title;
  }

  public String getTitle() {
    return this.title;
  }

  public int getLength() {
    return this.lenght;
  }

  @Override
  public void play() {
    System.out.println("Playing DVD: " + this.getTitle());
    System.out.println("DVD length: " + this.getLength());
  }
}

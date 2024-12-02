package aims.media;

import java.util.*;

public class CompactDisc extends Disc {
  private String artist;
  private List<Track> tracks = new ArrayList<Track>();

  CompactDisc(String director, int length) {
    super(director, director, director, length, length);
  }

  public int getLength() {
    int sum = 0;
    for (Track track : tracks) {
      sum += track.getLenght();
    }

    return sum;
  }
}

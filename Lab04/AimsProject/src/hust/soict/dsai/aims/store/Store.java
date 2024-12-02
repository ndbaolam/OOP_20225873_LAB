package aims.store;
import java.util.ArrayList;

import aims.media.Media;

public class Store {
  private ArrayList<Media> itemsInStore = new ArrayList<Media>();  

  public void addMedia(Media media) {
    itemsInStore.add(media);
  }

  public void removeMedia(Media media) {
    if(itemsInStore.contains(media))
      itemsInStore.remove(media);
    else 
      System.out.println("media not found!");
  }
}

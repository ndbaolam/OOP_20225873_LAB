package aims.media;

import java.lang.Object;

public abstract class Media {
  protected int id;
  protected String title;
  protected String category;
  protected float cost;

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getCategory() {
    return category;
  }

  public float getCost() {
    return this.cost;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setCategory(String category) {
    this.category = category;
  }    
}

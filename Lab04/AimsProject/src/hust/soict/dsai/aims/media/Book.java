package aims.media;
import java.util.*;

public class Book {
  private int id;
  private String title;
  private String category;
  private float cost;
  private List<String> authors = new ArrayList<String>();

  public Book() {

  }

  public void addAuthor(String authorName) {
    if(authors.contains(authorName)) {
      System.out.println("Author has already existed!");
      return;
    }      

    authors.add(authorName);
  }

  public void removeAuthor(String authorName) {
    if(!authors.contains(authorName)) {
      System.out.println("Author doesn't exist!");
      return;
    }      

    authors.remove(authorName);
  }

  public static void main(String[] args) {
    
  }
}

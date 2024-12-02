package aims.cart;

import java.util.ArrayList;

import aims.media.Media;

public class Cart {
  public static final int MAX_NUMBERS_ORDERD = 20;
  private ArrayList<Media> itemsOrdered = new ArrayList<Media>();  

  public void addMedia(Media... mediaList) {
    for(Media media : mediaList) {
      if (itemsOrdered.size() >= MAX_NUMBERS_ORDERD) { 
        System.out.println("The cart is almost full");
        break;
      }
      itemsOrdered.add(media);
      System.out.println("The disc " + media.getTitle() + " has been added");
    }
  }

  public void printCart() {
    System.out.println("***********************CART***********************");
    System.out.println("Ordered Items:");    
    for (int i = 0; i < itemsOrdered.size(); i++) {   
      if(itemsOrdered.get(i) != null) {
        System.out.println((i + 1) + ". DVD - " + itemsOrdered.get(i).toString());
      }        
    }
    System.out.println("Total cost: " + this.totalCost());
    System.out.println("**************************************************");
  }

  public void removeMedia(Media media) {
    if (itemsOrdered.size() == 0) {
      System.out.println("The cart is almost empty");
      return;
    }

    boolean removed = false;

    for (int i = 0; i < itemsOrdered.size(); i++) {
      if (itemsOrdered.get(i) != null && itemsOrdered.get(i).equals(media)) {
        itemsOrdered.remove(media);
        removed = true;
        break;
      }
    }

    if (!removed) {
      System.out.println("Could not find the searched disc in cart!");
      return;
    }

    System.out.println("The disc has been removed!");
  }

  public float totalCost() {
    float total = 0f;
    for (int i = 0; i < itemsOrdered.size(); i++) {   
      if(itemsOrdered.get(i) != null)   
        total += itemsOrdered.get(i).getCost();
    }
    return total;
  }
}

package test;

import aims.DigitalVideoDisc;
import aims.Store;

public class StoreTest {
  public static void main(String[] args) {
    Store store = new Store();
    DigitalVideoDisc dvd = new DigitalVideoDisc("Test");
    store.addDVD(dvd);
    store.removeDVD(dvd);
  }
}

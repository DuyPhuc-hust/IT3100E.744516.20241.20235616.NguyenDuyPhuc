package hust.soict.cybersec.aims.store;

import hust.soict.cybersec.aims.disc.DigitalVideoDisc;
import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    public void addDvd(DigitalVideoDisc dvd) {
        if (dvd != null) {
            itemsInStore.add(dvd);
            System.out.println("DVD added: " + dvd.getTitle());
        } else {
            System.out.println("Cannot add null DVD.");
        }
    }

    public void removeDvd(DigitalVideoDisc dvd) {
        if (itemsInStore.contains(dvd)) {
            itemsInStore.remove(dvd);
            System.out.println("DVD removed: " + dvd.getTitle());
        } else {
            System.out.println("DVD not found in the store.");
        }
    }
}
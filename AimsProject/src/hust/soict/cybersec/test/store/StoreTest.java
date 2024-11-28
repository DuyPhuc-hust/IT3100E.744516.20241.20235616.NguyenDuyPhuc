package hust.soict.cybersec.test.store;

import hust.soict.cybersec.aims.disc.DigitalVideoDisc;
import hust.soict.cybersec.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        // Create DigitalVideoDisc instances
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Interstellar");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Matrix");

        // Test adding DVDs
        System.out.println("Testing addDVD method:");
        store.addDvd(dvd1);
        store.addDvd(dvd2);
        store.addDvd(null);

        // Test removing DVDs
        System.out.println("\nTesting removeDVD method:");
        store.removeDvd(dvd2);
        store.removeDvd(dvd3);
    }
}
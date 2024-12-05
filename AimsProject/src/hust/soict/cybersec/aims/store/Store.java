package hust.soict.cybersec.aims.store;

import java.util.ArrayList;

import hust.soict.cybersec.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<Media>();
    }

    public void displayItems() {
		for (Media item: itemsInStore) {
			System.out.println(item.toString());
		}
	}

    public void addMedia(Media media) {
        if (media != null) {
            itemsInStore.add(media);
        } else {
            System.out.println("Can not add null item!");
        }
    }

    public void removeMedia(Media media) {
    	if (itemsInStore.contains(media)) {
    		itemsInStore.remove(media);
    	} else {
    		System.out.println("This item is not in store!");
    	}
    }

    public Media searchById(int id) {
		boolean found = false;
		for (int i = 0; i < itemsInStore.size(); i++) {
			if (itemsInStore.get(i).getId() == id) {
				System.out.println("Media found: " + itemsInStore.get(i).toString());
				found = true;
				return itemsInStore.get(i);
			}
		}

		if (!found) {
			System.out.println("No Media found with ID: " + id);
		}
        return null;
	}

	public Media searchByTitle(String title) {
		boolean found = false;
		for (int i = 0; i < itemsInStore.size(); i++) {
			if (itemsInStore.get(i).getTitle().equals(title)) {
				System.out.println("Media found: " + itemsInStore.get(i).toString());
				found = true;
				return itemsInStore.get(i);
			}
		}

		if (!found) {
			System.out.println("No Media found with title: " + title);
		}
        return null;
	}
}
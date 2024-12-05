package hust.soict.cybersec.aims.cart;

import java.util.ArrayList;
import java.util.Collections;

import hust.soict.cybersec.aims.media.Media;

public class Cart {
	public static final int MAX_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

	public void addMedia(Media media) {
		if (!itemsOrdered.contains(media)) {
			itemsOrdered.add(media);
		} else {
			System.out.println("This is already in your order!");
		}
	}

	public void removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
		} else {
			System.out.println("This is not in the order!");
		}
	}

	public void printOrders() {
		for (Media item : itemsOrdered) {
			System.out.println(item.toString());
		}
	}

	public void searchById(int id) {
		boolean found = false;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getId() == id) {
				System.out.println("Media found: " + itemsOrdered.get(i).toString());
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("No Media found with ID: " + id);
		}
	}

	public void searchByTitle(String title) {
		boolean found = false;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getTitle().equals(title)) {
				System.out.println("Media found: " + itemsOrdered.get(i).toString());
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("No Media found with title: " + title);
		}
	}

	public Media takeById(int id) {
		boolean found = false;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getId() == id) {
				System.out.println("Media found: " + itemsOrdered.get(i).toString());
				found = true;
				return itemsOrdered.get(i);
			}
		}

		if (!found) {
			System.out.println("No Media found with ID: " + id);
		}
		return null;
	}

	public Media takeByTitle(String title) {
		boolean found = false;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getTitle().equals(title)) {
				System.out.println("Media found: " + itemsOrdered.get(i).toString());
				found = true;
				return itemsOrdered.get(i);
			}
		}

		if (!found) {
			System.out.println("No Media found with title: " + title);
		}
		return null;
	}

	public void sortByCostTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
		System.out.println("Sorted by Cost, then Title:");
		itemsOrdered.forEach(System.out::println);
	}

	public void sortByTitleCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
		System.out.println("Sorted by Title, then Cost:");
		itemsOrdered.forEach(System.out::println);
	}

	public float totalCost() {
		float totalCost = 0;
		for (Media item : itemsOrdered) {
			totalCost += item.getCost();
		}
		return totalCost;
	}

	public void clear() {
		this.itemsOrdered = new ArrayList<Media>();
	}
}
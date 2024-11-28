package hust.soict.cybersec.aims.cart;

import hust.soict.cybersec.aims.disc.DigitalVideoDisc;

public class Cart {
	private int qtyOrdered = 0;
	public static final int MAX_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_ORDERED];
	private int total;

	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_ORDERED) {
			System.out.println("Reached max number ordered");
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered += 1;
			System.out.println("Added");
		}

	}
	public void addDigitalVideoDisc( DigitalVideoDisc [] dvdList ) {
		if ( qtyOrdered  >= MAX_ORDERED ) {
			System.out.println("The cart is not capable of add these ammount of dvds");
		} else {
			for (int i = 0; i < dvdList.length; i++) {
				itemsOrdered[qtyOrdered] =  dvdList[i];
				qtyOrdered += 1;
			}

			System.out.println("Added");
		}
	}

	public void addDigitalVideoDisc( DigitalVideoDisc dvd1, DigitalVideoDisc dvd2 ) {
		if (qtyOrdered + 2 >= MAX_ORDERED) {
			System.out.println("The cart is not capable of adding two more dvds");
		} else {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered += 1;
			itemsOrdered[qtyOrdered] = dvd2;
			qtyOrdered += 1;
			System.out.println("Added");
		}
	}

	public void print() {
		total = 0;
		System.out.println("*************************[CART]*************************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println((i + 1) + ". DVD - " + itemsOrdered[i].toString());
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("*********************************************************");
	}

	public void searchById(int id) {
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getId() == id) {
				System.out.println("DVD found: " + itemsOrdered[i].toString());
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("No DVD found with ID: " + id);
		}
	}

	public void searchByTitle(String title) {
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].isMatch(title)) {
				System.out.println("DVD found: " + itemsOrdered[i].toString());
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("No DVD found with title: " + title);
		}
	}

	public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				for (int j = i; i < qtyOrdered - 1; i++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				itemsOrdered[qtyOrdered-1] = null;
				qtyOrdered -= 1;
				System.out.println("Removed");
				return;
			}
		}
		System.out.println("Cannot find the disc");
	}

	public float totalCost() {
		float totalCost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			totalCost += itemsOrdered[i].getCost();
		}
		return totalCost;
	}

	public String[] getItemsOrdered() {
		String[] listOrdered = new String[qtyOrdered];
		for (int i = 0; i< qtyOrdered; i++) {
			listOrdered[i] = itemsOrdered[i].getTitle();
		}
		return listOrdered;
	}
}
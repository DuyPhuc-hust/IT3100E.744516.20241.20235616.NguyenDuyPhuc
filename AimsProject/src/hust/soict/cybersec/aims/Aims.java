package hust.soict.cybersec.aims;

import hust.soict.cybersec.aims.cart.Cart;
import hust.soict.cybersec.aims.disc.DigitalVideoDisc;
import java.util.Arrays;

public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();

		// Create new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
        "Animation", "Roger Allers", 87, 19.95f);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);

		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.removeDigitalVideoDisc(dvd2);

		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
		DigitalVideoDisc alt1 = new DigitalVideoDisc("Toy Story",
		        "Animation", "John Lasseter", 81, 18.95f);

		DigitalVideoDisc alt2 = new DigitalVideoDisc("Blade Runner",
						"Science Fiction", "Ridley Scott", 117, 23.95f);

		DigitalVideoDisc alt3 = new DigitalVideoDisc("Zootopia",
						"Animation", "Byron Howard", 108, 20.95f);

		DigitalVideoDisc alt4 = new DigitalVideoDisc("The Avengers",
						"Action", 24.99f);

		DigitalVideoDisc[] dvdLList = new DigitalVideoDisc[3];
		dvdLList[0] = alt1;
		dvdLList[1] = alt2;
		dvdLList[2] = alt3;
		anOrder.addDigitalVideoDisc(dvdLList);
		anOrder.addDigitalVideoDisc(alt3, alt4);
		
		anOrder.print();

		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
		System.out.println(Arrays.toString(anOrder.getItemsOrdered()));

		anOrder.removeDigitalVideoDisc(alt2);
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());

		System.out.println(Arrays.toString(anOrder.getItemsOrdered()));
	}
}
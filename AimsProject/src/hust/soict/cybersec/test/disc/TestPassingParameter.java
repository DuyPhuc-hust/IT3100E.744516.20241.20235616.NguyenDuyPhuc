package hust.soict.cybersec.test.disc;
import hust.soict.cybersec.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderllaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderllaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());

        trueSwap(jungleDVD, cinderllaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());

        System.out.println("cinerella dvd title: " + cinderllaDVD.getTitle());

        changeTitle(jungleDVD, cinderllaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    // Using a wrapper class to hold the references
    public static void trueSwap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        String tempTitle = dvd1.getTitle();
        // dvd1.setTitle(dvd2.getTitle());
        // dvd2.setTitle(tempTitle);
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        // dvd.setTitle(title);
        // dvd = new DigitalVideoDisc(oldTitle);
    }
}
package hust.soict.cybersec.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

	private static int nbDigitalVideoDiscs = 0;

	public DigitalVideoDisc(String title) {
		super(nbDigitalVideoDiscs + 1, title,"",0.0f,"",0);
		nbDigitalVideoDiscs += 1;
	}
	// int id, String title, String category, float cost, String director, int length
	public DigitalVideoDisc(String title, String category, float cost) {
		super(nbDigitalVideoDiscs + 1, title, category, cost,"", 0);
		nbDigitalVideoDiscs += 1;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(nbDigitalVideoDiscs + 1, title, category, cost, director,0);
		nbDigitalVideoDiscs += 1;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(nbDigitalVideoDiscs + 1, title, category, cost, director, length);
		nbDigitalVideoDiscs += 1;
	}
	public boolean isMatch(String title) {
		return this.getTitle().equals(title);
	}
	@Override
	public String toString() {
		return "DVD" + "-" + this.getTitle() + "-" + this.getCategory() + "-" + this.getDirector() + "-" + String.valueOf(this.getLength()) + ": " + String.valueOf(this.getCost()) + "$";
	}
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

	// Handle compare for DVD with difference ordering rule
	@Override
    public int compareTo(Media other) {
        if (!(other instanceof DigitalVideoDisc)) {
            return super.compareTo(other);
        }

        DigitalVideoDisc otherDVD = (DigitalVideoDisc) other;
        int titleComparison = this.getTitle().compareTo(otherDVD.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        }
        int lengthComparison = Integer.compare(otherDVD.getLength(), this.getLength());
        if (lengthComparison != 0) {
            return lengthComparison;
        }
        return Double.compare(this.getCost(), otherDVD.getCost());
    }
}
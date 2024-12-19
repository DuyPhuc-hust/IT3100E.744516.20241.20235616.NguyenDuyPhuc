package hust.soict.cybersec.aims.media;

import hust.soict.cybersec.aims.exception.PlayerException;

public class Track implements Playable {
	private String title;
	private int length;

	public Track() {
		this.title = "";
		this.length = 0;
	}

	public Track(String title) {
		this.title = title;
	}

	public Track(int length) {
		this.length = length;
	}

	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Track)) {
            return false;
        }

        Track other = (Track) obj;
        return (this.title != null && this.title.equals(other.title)) && this.length == other.length;
    }

	@Override
	public void play() throws PlayerException {
		if (this.getLength() > 0) {
			System.out.println("Playing track: " + this.getTitle());
			System.out.println("Track length: " + this.getLength());
		}
		else {throw new PlayerException("Error: Track length is non-positive!");}
	}

}
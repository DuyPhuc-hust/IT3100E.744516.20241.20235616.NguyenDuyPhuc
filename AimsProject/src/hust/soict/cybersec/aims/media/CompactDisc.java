package hust.soict.cybersec.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import hust.soict.cybersec.aims.exception.PlayerException;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<Track> ();
	public CompactDisc() {
		this.artist = "";
	}
	public CompactDisc(String artist) {
		this.artist = artist;
	}
	public CompactDisc(String artist, String title, String category, String director, float cost) {
		super(new Random().nextInt(1_000_000) + 1, title, category, cost, director, 0);
		this.artist = artist;
	}
	public String getArtist() {
		return artist;
	}
	public void addTrack(Track track) {
		if (!tracks.contains(track)) {
			tracks.add(track);
		} else {
			System.out.println("This track already exist!");
		}
	}
	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
		} else {
			System.out.println("This track is not existed!");
		}
	}
	@Override
	public int getLength() {
		int totalLength = 0;
		for (Track track : tracks) {
			totalLength += track.getLength();
		}

		return totalLength;
	}
	@Override
	public void play() throws PlayerException{
		System.out.println("CompactDisc Artist: " + this.getArtist());
		System.out.println("Total length: " + this.getLength());

		if (this.getLength() > 0) {
			System.out.println("Compactdisc: " + this.getTitle());
			System.out.println("CompactDisc Artist: " + this.getArtist());
			System.out.println("Total length: " + this.getLength());
			java.util.Iterator iter = tracks.iterator();
			Track nextTrack;
			while (iter.hasNext()) {
				nextTrack = (Track) iter.next();
				try {
					nextTrack.play();
				}
				catch(PlayerException e ) {
					throw e;
				}
			}
		}
		else {
			throw new PlayerException("Error: CD length is non-positive!");
		}

		System.out.println("-----------------Play All Tracks-----------------");
		for (Track track: tracks) {
			track.play();
		}
	}
	@Override
	public String toString() {
		return "Compact Disc" + "-" + this.getArtist() + "-" + this.getCategory() + "-" + this.getDirector() + "-" + String.valueOf(this.getLength()) + ": " + String.valueOf(this.getCost()) + "$";
	};

}
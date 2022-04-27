package chapter03_1;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public void viewShow() {
		System.out.println(artist +" "+ title +" ( " + album +", "+ year +", "+ track +", " + composer + " )" );
		System.out.printf("%s %s ( %s, %d, %s, %s )",	artist,title,album,year,track,composer);
	}
	
}

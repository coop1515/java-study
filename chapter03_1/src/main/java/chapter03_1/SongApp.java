package chapter03_1;

public class SongApp {

	public static void main(String[] args) {
		Song song = new Song();
		
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("Real");
		song.setComposer("이민수 작곡");
		song.setTrack("3번 track");
		song.setYear(2010);
		
		song.viewShow();

	}

}

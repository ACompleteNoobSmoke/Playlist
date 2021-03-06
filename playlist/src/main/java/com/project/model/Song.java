package com.project.model;

public class Song {

	private String title;
	private String genre;
	private String artist;
	private String albumType;
	private String album;
	private int yearReleased;

	// Creates a playlist object with an title, artist, album type, album, and
	// yearReleased.
	public Song(String title, String artist, String genre, String albumType, String album, int yearReleased) {
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.albumType = albumType;
		this.album = album;
		this.yearReleased = yearReleased;
	}

	// Sets Song's title to argument title.
	public void setTitle(String title) {
		this.title = title;
	}

	// Return the value of title in a Song.
	public String getTitle() {
		return title;
	}

	// Sets Song's artist to argument artist.
	public void setArtist(String artist) {
		this.artist = artist;
	}

	// Returns the value of artist in a Song.
	public String getArtist() {
		return this.artist;
	}

	// Set Genre To Argument Genre
	public void setGenre(String genre) {
		this.genre = genre;
	}

	// Returns the valur of genre in a Song.
	public String getGenre() {
		return genre;
	}

	// Set Album Type To Argument Album Type
	public void setAlbumType(String albumType) {
		this.albumType = albumType;
	}

	// Get Album Type To Argument Album Type
	public String getAlbumType() {
		return albumType;
	}

	// Sets Song's album to argument album.
	public void setAlbum(String album) {
		this.album = album;
	}

	// Returns the value of album in a Song.
	public String getAlbum() {
		return this.album;
	}

	// Sets Song's yearReleased to argument yearReleased
	public void setYearReleased(int yearReleased) {
		if (yearReleased > 1960 || yearReleased < 2020) {
			this.yearReleased = yearReleased;
		} else {
			System.out.println("Error");
		}
	}

	// Returns Year Released value in a Song.
	public int getYearReleased() {
		return this.yearReleased;
	}

	// Header With Track Number To Song Information
	public void songHeaderTrack() {
		System.out.printf("%-15s%-22s%-22s%-22s%-22s%-22s\n", "Track", "Title", "Artist", "Album", "Genre", "Year");
		System.out.println(
				"____________________________________________________________________________________________________________");
	}

	public void songHeaderTitle() {
		System.out.printf("%-22s%-22s%-22s%-22s%-22s\n", "Title", "Artist", "Album", "Genre", "Year");
		System.out.println(
				"_____________________________________________________________________________________________________");
	}

	//
	public String toString() {
		String songInfo = String.format("%-22s%-22s%-22s%-22s%-22d", title, artist, album, genre, yearReleased);
		return songInfo;
	}

	public String toString(int trackNumber) {
		String songInfo = String.format("%-15d%-22s%-22s%-22s%-22s%-22d", trackNumber, title, artist, album, genre,
				yearReleased);
		return songInfo;
	}

} // End class

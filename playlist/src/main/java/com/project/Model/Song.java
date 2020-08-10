package com.project.Model;

public class Song {
	

		private String title;
		private String artist;
		private String album;
		private int yearReleased;
			
		//Creates a playlist object with an title, artist, album, and yearReleased.
		public Song(String title, String artist, String album, int yearReleased) {
			this.title = title;
			this.artist = artist;
			this.album = album;
			this.yearReleased = yearReleased;
		}
			
		//Sets Song's title to argument title.
		public void setTitle(String title) {
			this.title = title;
		}
			
		//Return the value of title in a Song.
		public String getTitle() {
			return title;
		}
			
		//Sets Song's artist to argument artist.
		public void setArtist(String artist) {
			this.artist = artist;
		}
			
		//Returns the value of artist in a Song.
		public String getArtist() {
			return this.artist;
		}

		//Sets Song's album to argument album.
		public void setAlbum(String album) {
			this.album = album;
		}
			
		//Returns the value of album in a Song.
		public String getAlbum() {
			return this.album;
		}
			
		//Sets Song's yearReleased to argument yearReleased
		public void setYearReleased(int yearReleased) {
			if(yearReleased > 1960 && yearReleased < 2020) {
			this.yearReleased = yearReleased;		
		   }else {
				System.out.println("Error");
			}
			}
			
		//Returns Year Released value in a Song.
		public int getYearReleased() {
			return this.yearReleased;
		}

}

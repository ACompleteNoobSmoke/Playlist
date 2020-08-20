package com.project.methods;

import com.project.database.MySQLConnection;
import com.project.menu.UserInputs;
import com.project.model.Song;

public class InsertAction {

    // Inputs To Create And Insert New Song
    public void insert(String userName) {
        boolean add = false; // Use To Check Is Song Already Exists.
        MySQLConnection mySQL = new MySQLConnection();
        if (!add) {
            System.out.println("*** ADD SONG ***");
            String song = UserInputs.getSongTitle();
            String artist = UserInputs.getArtistName();
            String albumType = UserInputs.getType();
            String album = UserInputs.getProjectName(albumType);
            int year = UserInputs.getYear();
            String genre = UserInputs.getGenre();
            Song newSong = new Song(song, artist, genre, albumType, album, year);
            add = mySQL.insertNewSong(userName, newSong); // Check Database If The Song Already Exists.
            if (!add) {
                System.err.println("WARNING: Song Already Exists In Playlist");
                return;
            } else {
                System.out.println(song + " By " + artist + " Added to Playlist");
            }
        }
    }
}
package com.project.methods;

import java.util.ArrayList;

import com.project.database.MySQLConnection;
import com.project.menu.Menu;
import com.project.menu.UserInputs;
import com.project.model.Song;

public class SearchAction {

    public void searching(String userName) {
        Menu menu = new Menu();
        int menuPick = menu.searchMenu();
        if (menuPick == 1) {
            Song song = searchedSong(userName);
            viewSearchSong(song);
        } else if (menuPick == 2) {
            ArrayList<Song> album = searchedAlbum(userName);
            viewFullAlbum(album);
        }
        System.out.println("");
    }

    public Song searchedSong(String userName) {
        System.out.println("*** Search Song ***");
        Song foundSong = null;
        MySQLConnection sql = new MySQLConnection();
        String songTitle = UserInputs.getSongTitle();
        String artist = UserInputs.getArtistName();
        foundSong = sql.retrieveSong(userName, songTitle, artist);
        System.out.println("");
        return foundSong;
    }

    public ArrayList<Song> searchedAlbum(String userName) {
        System.out.println("*** Search Album ***");
        ArrayList<Song> foundAlbum = new ArrayList<Song>();
        MySQLConnection sql2 = new MySQLConnection();
        String albumTitle = UserInputs.getAlbumTitle();
        String artist = UserInputs.getArtistName();
        foundAlbum = sql2.retrieveAlbum(userName, artist, albumTitle);
        System.out.println("");
        return foundAlbum;
    }

    public void viewSearchSong(Song viewFoundSong) {
        if (viewFoundSong == null) {
            System.err.println("\nSong Could Not Be Found!!\n");
            return;
        }

        viewFoundSong.songHeaderTitle();
        System.out.println(viewFoundSong);
    }

    public void viewFullAlbum(ArrayList<Song> viewAlbum) {
        if (viewAlbum.isEmpty()) {
            System.err.println("\nAlbum Could Not Be Found!!\n");
            return;
        }

        boolean header = true;
        int trackNum = 0;

        for (Song albumSong : viewAlbum) {
            if (header) {
                albumSong.songHeaderTrack();
                header = false;
                trackNum++;
            }
            System.out.println(albumSong.toString(trackNum));
            trackNum++;
        }
    }

}
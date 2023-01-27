package LinkedList.Challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    private Song findSong(String name) {
        for (Song i : this.songs) {
            if (i.getTittle().equals(name)) {
                return i;
            }
        }
        return null;
    }

    public boolean addSong(String nameSong, double duration) {
        if (findSong(nameSong) == null) {
            this.songs.add(new Song(nameSong, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, List<Song> playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && index <= this.songs.size()) {
            playlist.add(this.songs.get(index));
            return true;
        } else {
            System.out.println("This album does not have a track " + trackNumber);
            return false;
        }
    }

    public boolean addToPlayList(String title, List<Song> playlist) {
        Song chceckSong = findSong(title);
        if (chceckSong != null) {
            playlist.add(chceckSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }
}





































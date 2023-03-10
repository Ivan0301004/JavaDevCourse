package AbstractAndInterfaces.InnerClass.Challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private final String name;
    private final String artist;
    private final SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }


    public boolean addSong(String nameSong, double duration) {
        return this.songs.add(new Song(nameSong, duration));
    }

    public boolean addToPlayList(int trackNumber, List<Song> playlist) {
        Song checkSong = this.songs.findSong(trackNumber);
        if (checkSong != null) {
            playlist.add(checkSong);
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;

    }

    public boolean addToPlayList(String title, List<Song> playlist) {
        Song chceckSong = songs.findSong(title);
        if (chceckSong != null) {
            playlist.add(chceckSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }


    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }

            this.songs.add(song);
            return true;
        }


        private Song findSong(String name) {
            for (Song i : this.songs) {
                if (i.getTittle().equals(name)) {
                    return i;
                }
            }
            return null;
        }


        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (index >= 0 && index < songs.size()) {
                return songs.get(index);
            }
            return null;
        }
    }
}





































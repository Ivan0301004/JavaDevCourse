package AbstractAndInterfaces.InnerClass.Challenge;

import java.util.*;


public class Main {
    private static final List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Fortitude", "Gojira");
        album.addSong("The Chant", 5.8);
        album.addSong("Sphinx", 5.2);
        album.addSong("Born For One Thing", 4.56);
        album.addSong("Fortitude", 2.4);
        album.addSong("Amazonia", 4.5);
        album.addSong("Another World", 5.8);
        album.addSong("Grind", 6.5);
        albums.add(album);

        album = new Album("Lateralus", "Tool");
        album.addSong("Lateralus", 9.4);
        album.addSong("Parabola", 9.4);
        album.addSong("Schism", 9.4);
        album.addSong("The Grudge", 9.4);
        album.addSong("The Patient", 7.34);
        albums.add(album);

        List<Song> playlist = new Vector<Song>();
        albums.get(0).addToPlayList("The Chant", playlist);
        albums.get(0).addToPlayList("Sphinx", playlist);
        albums.get(0).addToPlayList("Amazonia", playlist);
        albums.get(0).addToPlayList("Shooting Star", playlist);
        albums.get(0).addToPlayList("Orobourus", playlist);
        albums.get(1).addToPlayList("The Patient", playlist);

        albums.get(0).addToPlayList(3, playlist);
        albums.get(1).addToPlayList(3, playlist);
        albums.get(1).addToPlayList(12, playlist); // There is no track

        play(playlist);
    }


    private static void play(List<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist.");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0 -> {
                    System.out.println("Playlist complete");
                    quit = true;
                }
                case 1 -> {
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                }
                case 2 -> {
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                    }
                }
                case 3 -> {
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now Replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now Replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reach to the end of the list");
                        }
                    }
                }
                case 4 -> {
                    printList(playList);
                }
                case 5 -> {
                    printMenu();
                }
                case 6 -> {
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                }
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions");
        System.out.println("""
            0 - To quit
            1 - To Play Next Song
            2 - To Play Previous Song
            3 - Replay Current Song
            4 - To Print List Song In The Playlist
            5 - To Print Menu
            6 - To Remove Current Song From The Playlist
            """);
    }


    private static void printList(List<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("================================");
    }


}


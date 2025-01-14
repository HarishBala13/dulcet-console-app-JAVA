package comdulcetapplication;

import java.util.ArrayList;
import java.util.Scanner;

public class SongManager {
    private ArrayList<Song> songs = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("1. Add Song\n2. View Songs\n3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear newline

            switch (choice) {
                case 1:
                    addNewSong();
                    break;
                case 2:
                    getAllSongs();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private void addNewSong() {
        System.out.print("Enter song id: ");
        int songId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter artist name: ");
        String artistName = scanner.nextLine();
        
        System.out.print("Enter song name: ");
        String songName = scanner.nextLine();
        
        System.out.print("Enter album name: ");
        String albumName = scanner.nextLine();
        
        System.out.print("Enter playlist name: ");
        String playListName = scanner.nextLine();
        
        System.out.print("Enter song's genre: ");
        String genre = scanner.nextLine();
        
        System.out.print("Enter song duration: ");
        String duration = scanner.nextLine();

        songs.add(new Song(songId, songName, artistName, albumName, playListName, genre, duration));
        System.out.println("Song added successfully!");
    }

    private void getAllSongs() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the library.");
        } else {
            System.out.println("Songs List:");
            for (Song song : songs) {
                System.out.println(song);
            }
        }
    }
}


/*
Name: Bianca Baccay
Date: 10/2/2025
Description:  Rearranges the order of the songs and prints the shuffled playlist to the console
*/

import java.util.Random;

public class ShufflePlaylist {
    public static void main(String[] args) {
        String[] playlist = {"Shake It Off – Taylor Swift",
                "I Love You – Barney",
                "Baby Shark – Pinkfong",
                "Never Gonna Give You Up – Rick Astley",
                "Axel F (Crazy Frog) – Crazy Frog",
                "Gangnam Style – PSY",
                "What Does the Fox Say? – Ylvis"};
        String[] shuffledPlaylist = shuffle(playlist);
        System.out.println("Shuffled Playlist: ");
        for (int i = 0; i < shuffledPlaylist.length; i++) {
            System.out.println((i + 1) + ". " + shuffledPlaylist[i]);
        }
    }

    public static String[] shuffle(String[] playlist) {
        Random randomIndex = new Random();
        for (int i = 0; i < playlist.length; i++) {
            int newIndex = randomIndex.nextInt(i + 1);
            String swap = playlist[i];
            playlist[i] = playlist[newIndex];
            playlist[newIndex] = swap;
        }
        return playlist;
    }
}
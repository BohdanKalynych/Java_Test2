package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Song> songList = new ArrayList();

        double TotalLenght = 0;
        for (int i = 0; i < 3; i++) {
            Song songObject = new Song();
            System.out.println("Please enter Band and name of the " + (i+1) + " song");
            songObject.setSongName(sc.nextLine()); // asdasdasd/n
            System.out.println("Please enter lenght of the " + (i+1) + " song");
            songObject.setSongLenght(Double.valueOf(sc.nextLine())); //42/n
            TotalLenght = TotalLenght + songObject.getSongLenght();

            System.out.println("Please enter music style of the " + (i+1) + " song");
            songObject.setSongStyle(sc.nextLine().toUpperCase());

            songList.add(songObject);
        }

        System.out.println("Your entered list of songs: ");
        System.out.println();
        for (Song  songIterator1 : songList) {
            System.out.println(songIterator1);
        }

        System.out.println("Total lenght is equal to: " + TotalLenght);

        Collections.sort(songList, new Comparator<Song>() {
            public int compare(Song one, Song other) {
                return one.getSongStyle().compareTo(other.getSongStyle());
            }
        });

        System.out.println("_____________________________________________________________________________________");
        System.out.println("Sorted list of songs by music style ");

        for (int k = 0; k < songList.size(); k++) {
            System.out.println(songList.get(k));
        }

        System.out.println("____________________________________________________________________");
        System.out.println("please enter the range beatween which you want to find a song(use comma separator)");
        System.out.println("Starting range: ");
        double rangeValue1 = sc.nextDouble();
        System.out.println("Ending range: ");
        double rangeValue2 = sc.nextDouble();
        System.out.println("Entered range is  from "+rangeValue1+" to "+rangeValue2);


        System.out.println();
        System.out.println("List of songs that are valid for entered range: ");
        for (Song song : songList) {
            if (song.getSongLenght() > rangeValue1 && song.getSongLenght() < rangeValue2) {
                System.out.println(song);
            }

        }
    }
}
package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // adding objects to ArrayList
        ArrayList<Song> SongList = new ArrayList();

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

            SongList.add(songObject);
        }


        Song Sng = new Song();
        // display ArrayList of entered song information
        System.out.println("Your entered list of songs: ");
        System.out.println();
        for (int j = 0; j < SongList.size(); j++) {
            Sng = SongList.get(j);
            System.out.println(Sng);
        }

        System.out.println("Total lenght is equal to: " + TotalLenght);

        Collections.sort(SongList, new Comparator<Song>() {
            public int compare(Song one, Song other) {
                return one.getSongStyle().compareTo(other.getSongStyle());
            }
        });

        System.out.println("_____________________________________________________________________________________");
        Song Sng2 = new Song();
        System.out.println("Sorted list of songs by music style ");
        System.out.println();
        for (int k = 0; k < SongList.size(); k++) {
            Sng2 = SongList.get(k);
            System.out.println(Sng2);
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
        for (int l = 0; l < SongList.size(); l++) {
            while (rangeValue1<SongList.get(l).SongLenght|| SongList.get(l).SongLenght<rangeValue2){
                Song Sng3 = new Song();
                Sng3 = SongList.get(l);
                System.out.println(Sng);
            }

            /*if (rangeValue1<SongList.get(l).SongLenght|| SongList.get(l).SongLenght<rangeValue2){
                Sng3 = SongList.get(l);
                System.out.println(Sng3);
            }*/
        }


    }
}
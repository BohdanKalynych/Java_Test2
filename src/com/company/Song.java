package com.company;


public class Song {

    private String SongName;
    private String SongStyle;
    public Double SongLenght;

    public void setSongName(String newValue) {
        SongName = newValue;
    }

    public void setSongLenght(Double newValue) {
        SongLenght = newValue;
    }

    public void setSongStyle(String newValue) {
        SongStyle = newValue;
    }

    public String getSongName(){
        return SongName;
    }

    public Double getSongLenght() {
        return SongLenght;
    }

    public String getSongStyle() {
        return SongStyle;
    }

    @Override
    public String toString() {
        return "Song{" +
                "SongName='" + SongName + '\'' +
                ", SongStyle='" + SongStyle + '\'' +
                ", SongLenght=" + SongLenght +
                '}';
    }
}

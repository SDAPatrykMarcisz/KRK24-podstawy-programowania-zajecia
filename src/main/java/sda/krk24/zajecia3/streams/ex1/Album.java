package sda.krk24.zajecia3.streams.ex1;

import java.util.List;

public class Album {

    private List<Track> tracks;
    private String bandName;
    private int price;

    public Album(List<Track> tracks, String bandName, int price) {
        this.tracks = tracks;
        this.bandName = bandName;
        this.price = price;
    }

    public void addTrack(Track track){
        tracks.add(track);
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public String getBandName() {
        return bandName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Album{" +
                "tracks=" + tracks +
                ", bandName='" + bandName + '\'' +
                ", price=" + price +
                '}';
    }
}

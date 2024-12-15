package task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> artists = new ArrayList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getArtists() {
        return artists;
    }

    public void setArtists(List<MusicArtist> artists) {
        this.artists = artists;
    }

    public static void transferMembers(MusicBand bandB, MusicBand bandA) {

        for(MusicArtist artist : bandA.getArtists()) {
            bandB.artists.add(artist);
        }

        bandA.artists.removeAll(bandA.getArtists());
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", artists=" + artists +
                '}';
    }

    public void removeArtist(String name) {
        for(MusicArtist artist : artists) {
            if(artist.getName() == name) {
                artists.remove(artist);
                return;
            }
        }
    }

    public void addArtist(String name, int age) {
        artists.add(new MusicArtist(name, age));
    }

    public void printMembers() {
        System.out.println(artists);
    }
}

package task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> artists = new ArrayList<>();

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

    public List<String> getArtists() {
        return artists;
    }

    public void setArtists(List<String> artists) {
        this.artists = artists;
    }


    public static void transferMembers(MusicBand bandB, MusicBand bandA) {
        bandB.artists.addAll(bandA.getArtists());
//        bandA.artists.removeAll(bandA.getArtists());
          bandA.getArtists().clear(); // работает также как и строка выше
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", artists=" + artists +
                '}';
    }

    public void printMembers() {
        System.out.println(artists);
    }

    public void addMember(String member) {
        artists.add(member);
    }

    public void removeMember(String member) {
        artists.remove(member);
    }
}

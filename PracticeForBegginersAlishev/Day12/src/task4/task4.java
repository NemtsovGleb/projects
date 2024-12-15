package task4;

import java.util.ArrayList;
import java.util.List;

import static task4.MusicBand.transferMembers;

public class task4 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Queen", 1980);
        MusicBand band2 = new MusicBand("Nirvana", 1960);
        band1.addMember("Freddie Merkury");
        band1.addMember("Baraban");
        band2.addMember("Kurt Cobain");
        band2.addMember("Dave Groul");

        transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();

        band2.addMember("Aloha dance");
        band2.printMembers();
        band2.removeMember("Aloha dance");
        band2.printMembers();
    }

}

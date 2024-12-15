package task5;

import java.util.ArrayList;
import java.util.List;

import static task5.MusicBand.transferMembers;

public class task5 {
    public static void main(String[] args) {
        MusicBand nirvana = new MusicBand("Nirvana", 1960);
        MusicBand queen = new MusicBand("Queen", 1940);
        nirvana.addArtist("Kurt Cobain", 27);
        nirvana.addArtist("Dave Grohl", 60);
        queen.addArtist("Freddie Merkury", 58);
        queen.addArtist("Baraban", 70);


        System.out.println(nirvana);
        System.out.println(queen);


        transferMembers(queen, nirvana);
        System.out.println();

        System.out.println(queen);

//        nirvana.addArtist("Gleb",21);
//        nirvana.printMembers();




    }
}

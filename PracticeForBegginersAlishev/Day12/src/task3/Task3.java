package task3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();

        bands.add(new MusicBand("Queen", 1960));
        bands.add(new MusicBand("Kizaru", 2000));
        bands.add(new MusicBand("2Pac", 1990));
        bands.add(new MusicBand("Luna", 2015));
        bands.add(new MusicBand("Scally Milanno", 2024));
        bands.add(new MusicBand("Elvis", 1950));
        bands.add(new MusicBand("PopSmoke", 2021));
        bands.add(new MusicBand("Frank Sinatra", 1980));
        bands.add(new MusicBand("Drake", 2022));
        bands.add(new MusicBand("Travis Scott", 2023));

        Collections.shuffle(bands);

        System.out.println(groupsAfter2000(bands));

        System.out.println();

        System.out.println(bands);

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();

        for(MusicBand inputBands : bands) {
            if(inputBands.getYear() > 2000)
                bandsAfter2000.add(inputBands);
        }

        return bandsAfter2000;
    }
}

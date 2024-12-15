package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    List<String> songs = new ArrayList<>();

    {
        songs.add("TurkishMarsh");
        songs.add("MoonlightSonata");
        songs.add("AveMaria");
    }


    @Override
    public List<String> getSongs() {
        return songs;
    }
}

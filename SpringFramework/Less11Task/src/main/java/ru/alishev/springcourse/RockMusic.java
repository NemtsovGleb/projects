package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    List<String> songs = new ArrayList<>();

    {
        songs.add("HighwayStar");
        songs.add("Kill");
        songs.add("WarPigs");
    }



    @Override
    public List<String> getSongs() {
        return songs;
    }
}


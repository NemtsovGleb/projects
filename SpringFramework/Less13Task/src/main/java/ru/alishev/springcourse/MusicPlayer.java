package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.LinkedList;

public class MusicPlayer {


    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;

    }


//    @Value("${musicPlayer.name}")
//    private String name;
//
//    @Value("${musicPlayer.volume}")
//    private int volume;
//
//    private Music music1;
//    private Music music2;
//
//    public String getName() {
//        return name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//
//    public MusicPlayer(@Qualifier("rockMusic")Music music1,
//                       @Qualifier("classicalMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }


    public void playMusic() {
        Random rand = new Random();

        int randomGenre = rand.nextInt(3);

        if (randomGenre == 0) {
            System.out.println(musicList.get(0).getSong());
        } else if (randomGenre == 1) {
            System.out.println(musicList.get(1).getSong());
        } else {
            System.out.println(musicList.get(2).getSong());
        }


    }
}

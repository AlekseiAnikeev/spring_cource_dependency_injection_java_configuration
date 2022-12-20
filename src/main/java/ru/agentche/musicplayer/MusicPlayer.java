package ru.agentche.musicplayer;

import org.springframework.beans.factory.annotation.Value;


import java.util.List;
import java.util.Random;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 01.12.2022
 */
public class MusicPlayer {
    private final List<Music> musicList;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        Random randomTrack = new Random();
        return musicList.get(randomTrack.nextInt(musicList.size())).getSong().get(randomTrack.nextInt(3));
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}

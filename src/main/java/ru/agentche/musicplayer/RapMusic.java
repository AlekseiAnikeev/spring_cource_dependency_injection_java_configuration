package ru.agentche.musicplayer;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 15.12.2022
 */
public class RapMusic implements Music {
    private final List<String> musicList = new ArrayList<>();

    public RapMusic() {
        musicList.add("Minor");
        musicList.add("Colors");
        musicList.add("Prayer");
    }

    @Override
    public List<String> getSong() {
        return musicList;
    }
}


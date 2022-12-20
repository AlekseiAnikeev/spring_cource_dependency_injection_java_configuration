package ru.agentche.musicplayer;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 17.12.2022
 */
public class Computer {
    private final int id;
    private final MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + " Playing: " + musicPlayer.playMusic();
    }
}

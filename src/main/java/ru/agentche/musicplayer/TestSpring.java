package ru.agentche.musicplayer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 17.11.2022
 */
public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}

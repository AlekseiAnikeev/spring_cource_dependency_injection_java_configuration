package ru.agentche.musicplayer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 20.12.2022
 */
@Configuration
@ComponentScan("ru.agentche.musicplayer")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalBean() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockBean() {
        return new RockMusic();
    }

    @Bean
    public RapMusic rapBean() {
        return new RapMusic();
    }

    @Bean
    public List<Music> musicListBean() {
        return Arrays.asList(classicalBean(), rockBean(), rapBean());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicListBean());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}

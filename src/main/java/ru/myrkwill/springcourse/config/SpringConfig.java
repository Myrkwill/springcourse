package ru.myrkwill.springcourse.config;

import org.springframework.context.annotation.*;
import ru.myrkwill.springcourse.Music;
import ru.myrkwill.springcourse.genres.ClassicalMusic;
import ru.myrkwill.springcourse.genres.JazzMusic;
import ru.myrkwill.springcourse.genres.RockMusic;

import java.util.Arrays;
import java.util.List;

/**
 * @author Mark Nagibin
 */

@Configuration
@ComponentScan("ru.myrkwill.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
    }
}

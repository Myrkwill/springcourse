package ru.myrkwill.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.myrkwill.springcourse.config.SpringConfig;

/**
 * @author Mark Nagibin
 */
public class TestSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic());

        context.close();
    }
}

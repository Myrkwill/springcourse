package ru.myrkwill.springcourse.genres;

import org.springframework.stereotype.Component;
import ru.myrkwill.springcourse.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Mark Nagibin
 */
@Component
public class RockMusic implements Music {

    @PostConstruct
    public void init() {
        System.out.println("Init RockMusic");
    }

    @PreDestroy
    public void deinit() {
        System.out.println("Deinit RockMusic");
    }

    @Override
    public String getSong() {
        return "Rock Music";
    }
}

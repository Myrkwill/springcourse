package ru.myrkwill.springcourse.genres;

import org.springframework.stereotype.Component;
import ru.myrkwill.springcourse.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Mark Nagibin
 */

@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void init() {
        System.out.println("Init ClassicalMusic");
    }

    @PreDestroy
    public void deinit() {
        System.out.println("Deinit ClassicalMusic");
    }

    @Override
    public String getSong() {
        return "Classic Music";
    }
}

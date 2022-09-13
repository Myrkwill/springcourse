package ru.myrkwill.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Mark Nagibin
 */

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    @PostConstruct
    public void init() {
        System.out.println("Init ClassicalMusic");
    }

    @PreDestroy
    public void deinit() {
        System.out.println("Deinit ClassicalMusic");
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Classic Music";
    }
}

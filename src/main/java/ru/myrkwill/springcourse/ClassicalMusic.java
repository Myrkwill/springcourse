package ru.myrkwill.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Mark Nagibin
 */
public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    public void init() {
        System.out.println("Init ClassicalMusic");
    }

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

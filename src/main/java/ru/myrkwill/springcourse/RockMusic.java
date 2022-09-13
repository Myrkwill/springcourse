package ru.myrkwill.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Mark Nagibin
 */
@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Rock Music";
    }
}

package patterns.creational.dependency_injection.example.my.service.impl;

import lombok.extern.slf4j.Slf4j;
import patterns.creational.dependency_injection.example.my.service.Singable;

@Slf4j
public class Human implements Singable {

    public static final String SONG_WORDS = "Их-хи";

    @Override
    public void sing() {
        log.info(SONG_WORDS);
        System.out.println(SONG_WORDS);
    }
}

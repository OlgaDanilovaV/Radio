package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();
        radio.nextRadioStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();
        radio.prevRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void inputRadioStation() {
        Radio radio = new Radio();
        radio.inputRadioStation();
        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected,actual);
    }

    @Test
    public void increaseSoundVolume() {
        Radio radio = new Radio();
        radio.increaseSoundVolume();
        int expected = 6;
        int actual = radio.getCurrentSoundVolume();

        assertEquals(expected,actual);
    }

    @Test
    public void decreaseSoundVolume() {
        Radio radio = new Radio();
        radio.decreaseSoundVolume();
        int expected = 4;
        int actual = radio.getCurrentSoundVolume();

        assertEquals(expected,actual);
    }
}
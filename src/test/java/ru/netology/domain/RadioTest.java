package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.setCurrentRadioStation(radio.getCurrentRadioStation() +1);

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.setCurrentRadioStation(radio.getCurrentSoundVolume() -1);

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void inputRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);

        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void increaseSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        radio.setCurrentSoundVolume(radio.getCurrentSoundVolume() +1);

        assertEquals(10,radio.getCurrentSoundVolume());
    }

    @Test
    public void decreaseSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.setCurrentSoundVolume(radio.getCurrentSoundVolume() -1);

        assertEquals(0,radio.getCurrentSoundVolume());
    }
}
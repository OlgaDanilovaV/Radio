package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(7);
        radio.nextRadioStation();
        radio.setOn(true);

        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void returnNextRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        radio.setOn(true);

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(7);
        radio.prevRadioStation();
        radio.setOn(true);

        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void returnPrevRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        radio.setOn(true);

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void inputRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(7);
        radio.setOn(true);

        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void increaseSoundVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentSoundVolume(7);
        radio.increaseSoundVolume();
        radio.setOn(true);

        assertEquals(8,radio.getCurrentSoundVolume());
    }

    @Test
    public void returnIncreaseSoundVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentSoundVolume(10);
        radio.increaseSoundVolume();
        radio.setOn(true);

        assertEquals(10,radio.getCurrentSoundVolume());
    }

    @Test
    public void decreaseSoundVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentSoundVolume(7);
        radio.decreaseSoundVolume();
        radio.setOn(true);

        assertEquals(6,radio.getCurrentSoundVolume());
    }

    @Test
    public void returnDecreaseSoundVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentSoundVolume(0);
        radio.decreaseSoundVolume();
        radio.setOn(true);

        assertEquals(0,radio.getCurrentSoundVolume());
    }
}
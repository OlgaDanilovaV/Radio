package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio(5,50);

        radio.nextRadioStation();

        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void returnNextRadioStation() {
        Radio radio = new Radio(10,50);

        radio.nextRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio(5,50);

        radio.prevRadioStation();

        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void returnPrevRadioStation() {

        Radio radio = new Radio(0,50);

        radio.prevRadioStation();

        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void inputRadioStation() {
        Radio radio = new Radio(7,50);

        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void increaseSoundVolume() {
        Radio radio = new Radio(5,50);

        radio.increaseSoundVolume();

        assertEquals(51,radio.getCurrentSoundVolume());
    }

    @Test
    public void returnIncreaseSoundVolume() {
        Radio radio = new Radio(5,100);

        radio.increaseSoundVolume();

        assertEquals(100,radio.getCurrentSoundVolume());
    }

    @Test
    public void decreaseSoundVolume() {
        Radio radio = new Radio(5,50);

        radio.decreaseSoundVolume();

        assertEquals(49,radio.getCurrentSoundVolume());
    }

    @Test
    public void returnDecreaseSoundVolume() {
        Radio radio = new Radio(5,0);

        radio.decreaseSoundVolume();

        assertEquals(0,radio.getCurrentSoundVolume());
    }
}
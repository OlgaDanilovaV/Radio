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
    public void customNumberOfRadioStation() {
        Radio radio = new Radio(10,7,50);

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

    @Test
    public void currentRadioStation () {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        assertEquals(5,radio.getCurrentRadioStation());
    }

    @Test
    public void returnMoreMaxRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(11);

        assertEquals(0,radio.getCurrentRadioStation());
    }

    @Test
    public void returnLessMinRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        assertEquals(0,radio.getCurrentRadioStation());
    }

    @Test
    public void currentSoundVolume () {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(50);

        assertEquals(50,radio.getCurrentSoundVolume());
    }

    @Test
    public void returnMoreMaxSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(101);

        assertEquals(0,radio.getCurrentSoundVolume());
    }

    @Test
    public void returnLessMinSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(-1);

        assertEquals(0,radio.getCurrentSoundVolume());
    }
}
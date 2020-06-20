package ru.netology.domain;

public class Radio {
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentSoundVolume;
    private boolean on;

    public Radio() {
    }

    public Radio(int currentRadioStation, int currentSoundVolume) {
        this.currentRadioStation = currentRadioStation;
        this.currentSoundVolume = currentSoundVolume;
    }

    public Radio(int maxRadioStation, int currentRadioStation, int currentSoundVolume) {
        this.maxRadioStation = maxRadioStation;
        this.currentRadioStation = currentRadioStation;
        this.currentSoundVolume = currentSoundVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxVolume) {
            return;
        }
        if (currentSoundVolume < minVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void nextRadioStation() {

        currentRadioStation ++;

        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {

        currentRadioStation --;

        if (currentRadioStation < minRadioStation) {
            currentRadioStation = 10;
        }
    }

    public void increaseSoundVolume() {

        if (currentSoundVolume >= maxVolume) {
            return;
        }
        currentSoundVolume ++;
    }

    public void decreaseSoundVolume() {

        if (currentSoundVolume <= minVolume) {
            return;
        }
        currentSoundVolume --;
    }
}

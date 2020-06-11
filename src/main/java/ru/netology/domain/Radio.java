package ru.netology.domain;

public class Radio {
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentSoundVolume;
    private boolean on;

    public Radio(int currentRadioStation, int currentSoundVolume) {
        this.currentRadioStation = currentRadioStation;
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
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

        if (currentRadioStation > 10) {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {

        currentRadioStation --;

        if (currentRadioStation < 0) {
            currentRadioStation = 10;
        }
    }

    public void increaseSoundVolume() {

        if (currentSoundVolume >= 100) {
            return;
        }
        currentSoundVolume ++;
    }

    public void decreaseSoundVolume() {

        if (currentSoundVolume <= 0) {
            return;
        }
        currentSoundVolume --;
    }
}

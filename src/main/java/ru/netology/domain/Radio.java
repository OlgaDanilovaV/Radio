package ru.netology.domain;

public class Radio {
    private int maxRadioStation;
    private int minRadioStation;
    private int currentRadioStation;
    private int maxVolume;
    private int minVolume;
    private int currentSoundVolume;
    private boolean on;

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
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

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
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

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void nextRadioStation() {

        currentRadioStation ++;

        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {

        currentRadioStation --;

        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }
    }


    public void increaseSoundVolume() {

        if (currentSoundVolume >= 10) {
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

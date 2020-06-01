package ru.netology.domain;

public class Radio {
    private String name;
    private int maxRadioStation = 9;
    private int minRadioStation = 1;
    private int currentRadioStation = 7;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentSoundVolume = 5;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
        this.currentSoundVolume = currentSoundVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation ++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation --;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void inputRadioStation() {
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        if (currentRadioStation < minRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
    }

    public void increaseSoundVolume() {
        if (currentSoundVolume < maxVolume) {
            currentSoundVolume ++;
        }
    }

    public void decreaseSoundVolume() {
        if (currentSoundVolume > minVolume) {
            currentSoundVolume --;
        }
    }
}

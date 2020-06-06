package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentSoundVolume;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }

        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > 10) {
            return;
        }
        if (currentSoundVolume < 0) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }
}

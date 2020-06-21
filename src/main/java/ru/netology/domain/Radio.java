package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentSoundVolume;
    private boolean on;

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

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxVolume) {
            return;
        }
        if (currentSoundVolume < minVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void increaseSoundVolume() {

        if (currentSoundVolume >= maxVolume) {
            return;
        }
        currentSoundVolume ++;
    }

    public void decreaseSoundVolume() {

        if (currentSoundVolume <= minRadioStation) {
            return;
        }
        currentSoundVolume --;
    }
}

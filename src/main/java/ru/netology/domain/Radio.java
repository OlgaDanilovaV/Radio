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

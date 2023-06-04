package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int currentRadioStation;
    private int currentSoundVolumeLevel;
    private int countRadioStation;



    /*
    public  Radio(){
        this.countRadioStation = 10 - 1;

    }
    public  Radio(int count){
        this.countRadioStation = count - 1;

    }

    public int getRadioStation() {
        return currentRadioStation;
    }
    */

    public void nextRadioStation() {
        if (currentRadioStation < countRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else  {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else  {
            currentRadioStation = countRadioStation;
        }
    }
    /*
    public void setRadioStation(int numRadioStation) {
        if (numRadioStation > countRadioStation) {
            return;
        }
        if (numRadioStation < 0) {
            return;
        }
        currentRadioStation = numRadioStation;
    }
    */

    public void increaseVolume() {
        if (currentSoundVolumeLevel < 100) {
            currentSoundVolumeLevel = currentSoundVolumeLevel + 1;
        }
    }

    public void decreaseVolume() {
        if (currentSoundVolumeLevel > 0) {
            currentSoundVolumeLevel = currentSoundVolumeLevel - 1;
        }
    }
    /*
    public int getVolume() {
        return currentSoundVolumeLevel;
    }

    public void setVolume(int Volume) {
        if (Volume > 100) {
            currentSoundVolumeLevel = 100;
            return;
        }
        if (Volume < 0) {
            currentSoundVolumeLevel = 0;
            return;
        }
        currentSoundVolumeLevel = Volume;
    }
    */
}

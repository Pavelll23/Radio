package ru.netology.radio.radioService;

public class Radio {
    private int currentRadioStation;
    private int soundVolume;
    private  int maxStation;

    public Radio(){
        maxStation = 9;
    }
    public Radio(int stationCount){
        maxStation = stationCount - 1;
    }



    public void prevStation() {
        if (currentRadioStation >= 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation--;
        }

    }

    public void increaseVolume() {
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }

    public void nextStation() {
        if (currentRadioStation <= 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation > 9){
            currentRadioStation =  0;
        }
    }
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0){
            return;
        }
        if (currentRadioStation >9){
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0){
            return;
        }
        if (soundVolume > 10){
            return;
        }
        this.soundVolume = soundVolume;
    }
}


package ru.netology.radio.radioService;

public class Radio {
    public int currentRadioStation;
    public int soundVolume;

    public int getCurrentRadioStation(){
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation){
        if (newCurrentRadioStation > 9){
            return;
        }
        if (newCurrentRadioStation < 0){
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }
    public int nextStation(){
        if (currentRadioStation <= 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation > 9){
            currentRadioStation = 0;
        }
        return currentRadioStation;
    }
    public int prevStation(){
        if (currentRadioStation >= 0){
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation < 0){
            currentRadioStation = 9;
        }
        return currentRadioStation;
    }

    public int increaseVolume(){
        if (soundVolume < 10){
            soundVolume = soundVolume + 1;
        }
        return soundVolume;
    }
    public int decreaseVolume(){
        if (soundVolume > 0){
            soundVolume = soundVolume - 1;
        }
        return soundVolume;
    }
}

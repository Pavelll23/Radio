package ru.netology.radio.radioService;

public class Radio {

    private int currentRadioStation;
    private int soundVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int minStation = 0;
    private int lastStation;

    public Radio(){
        lastStation = 9;
    }
    public Radio(int stationCont){
        lastStation = stationCont -1;
    }
    public int getMaxStation(){
        return lastStation;
    }

    public int getCurrentRadioStation(){

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation){
        if (newCurrentRadioStation > lastStation){
            return;
        }
        if (newCurrentRadioStation < minStation){
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }


    public int nextStation(){
        if (currentRadioStation < lastStation) {
            currentRadioStation++;
        }
        if (currentRadioStation == lastStation){
            currentRadioStation++;
        }
        if (currentRadioStation > lastStation){
            currentRadioStation = minStation;
        }
        return currentRadioStation;
        }
    public int prevStation(){
        if (currentRadioStation > minStation){
            currentRadioStation--;
        }
        if (currentRadioStation == minStation){
            currentRadioStation--;
        }
        if (currentRadioStation < minStation){
            currentRadioStation = lastStation;
        }
        return currentRadioStation;
    }
    public int getSoundVolume(){
        return soundVolume;
    }
    public void setSoundVolume(int newsoundVolume){
       if (newsoundVolume > maxVolume){
           return;
       }
       if (newsoundVolume < minVolume){
            return;
        }
        soundVolume = newsoundVolume;
    }

    public int increaseVolume(){
        if (soundVolume < maxVolume){
            soundVolume++;
        }
        return soundVolume;
    }
    public int decreaseVolume(){
        if (soundVolume > minVolume){
            soundVolume--;
        }
        return soundVolume;
    }
}

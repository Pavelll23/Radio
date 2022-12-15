package ru.netology.radio.radioService;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTests {

    @Test
    public void shouldSetFmStation(){
    Radio number = new Radio();
    number.setCurrentRadioStation(10);
    int expected = 0;
    int actual = number.getCurrentRadioStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetSound(){
        Radio valume = new Radio();
        valume.soundVolume = 2;
        int expected = 2;
        int actual = valume.soundVolume;
        Assertions.assertEquals(expected,actual);
    }

   @Test
    public void shouldNextStation(){
        Radio next = new Radio();
        next.currentRadioStation = 9;
        int expected = 0;
        int actual = next.nextStation();
        Assertions.assertEquals(expected, actual);
   }

   @Test
    public void shouldPrevStation(){
        Radio prev = new Radio();
        prev.currentRadioStation = 0;
        int expected = 9;
        int actual = prev.prevStation();
        Assertions.assertEquals(expected,actual);
   }

   @Test
    public void  shouldUpVolume(){
        Radio up = new Radio();
        up.soundVolume = 2;
        int expected = 3;
        int actual = up.increaseVolume();
        Assertions.assertEquals(expected, actual);
   }

   @Test
    public void shouldDownVolume(){
        Radio down = new Radio();
        down.soundVolume = 3;
        int expected = 2;
        int actual = down.decreaseVolume();
        Assertions.assertEquals(expected, actual);
   }
}

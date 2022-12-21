package ru.netology.radio.radioService;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTests {

    @Test
    public void shouldSetFmStationMax(){
    Radio radio = new Radio();
    radio.setCurrentRadioStation(10);
    int expected = 0;
    int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetFmStationMin(){
        Radio number = new Radio();
        number.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = number.getCurrentRadioStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetFmStation(){
        Radio number = new Radio();
        number.setCurrentRadioStation(2);
        int expected = 2;
        int actual = number.getCurrentRadioStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetSound(){
        Radio valume = new Radio();
        valume.setSoundVolume(2);
        int expected = 2;
        int actual = valume.getSoundVolume();
        Assertions.assertEquals(expected,actual);
    }

   @Test
    public void shouldNextStation(){
        Radio next = new Radio();
        next.setCurrentRadioStation(9);
        next.nextStation();
        int expected = 0;
        int actual = next.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
   }
   @Test
   public void shouldNextStationOk(){
       Radio next = new Radio();
       next.setCurrentRadioStation(7);
       next.nextStation();
       int expected = 8;
       int actual = next.getCurrentRadioStation();
       Assertions.assertEquals(expected, actual);
   }

   @Test
   public void shouldNextStationIfMore(){
       Radio next = new Radio();
       next.setCurrentRadioStation(10);
       next.nextStation();
       int expected = 0;
       int actual = next.getCurrentRadioStation();
       Assertions.assertEquals(expected, actual);
   }

   @Test
    public void shouldPrevStation(){
        Radio prev = new Radio();
        prev.setCurrentRadioStation(0);
        prev.prevStation();
        int expected = 9;
        int actual = prev.getCurrentRadioStation();
        Assertions.assertEquals(expected,actual);
   }

   @Test
   public void shouldPrevStationOk(){
       Radio prev = new Radio();
       prev.setCurrentRadioStation(3);
       prev.prevStation();
       int expected = 2;
       int actual = prev.getCurrentRadioStation();
       Assertions.assertEquals(expected,actual);
   }

   @Test
   public void shouldPrevStationIf(){
       Radio prev = new Radio();
       prev.setCurrentRadioStation(-1);
       prev.prevStation();
       int expected = 9;
       int actual = prev.getCurrentRadioStation();
       Assertions.assertEquals(expected,actual);
   }

   @Test
    public void  shouldUpVolume(){
        Radio up = new Radio();
        up.setSoundVolume(2);
        up.increaseVolume();
        int expected = 3;
        int actual = up.getSoundVolume();
        Assertions.assertEquals(expected, actual);
   }

   @Test
   public void  shouldNoUpVolume(){
       Radio up = new Radio();
       up.setSoundVolume(10);
       up.increaseVolume();
       int expected = 10;
       int actual = up.getSoundVolume();
       Assertions.assertEquals(expected, actual);
    }

   @Test
    public void shouldDownVolume(){
        Radio down = new Radio();
        down.setSoundVolume(3);
        down.decreaseVolume();
        int expected = 2;
        int actual = down.getSoundVolume();
        Assertions.assertEquals(expected, actual);
   }
   @Test
    public void shouldNoDownVolume(){
        Radio down = new Radio();
        down.setSoundVolume(0);
        down.decreaseVolume();
        int expected = 0;
        int actual = down.getSoundVolume();
        Assertions.assertEquals(expected, actual);
   }
}
